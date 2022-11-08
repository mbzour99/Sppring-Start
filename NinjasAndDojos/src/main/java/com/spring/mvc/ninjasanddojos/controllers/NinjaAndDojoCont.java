package com.spring.mvc.ninjasanddojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.ninjasanddojos.models.Dojo;
import com.spring.mvc.ninjasanddojos.models.Ninja;
import com.spring.mvc.ninjasanddojos.serveces.NinjaAndDojoServ;
@Controller
public class NinjaAndDojoCont {

private final NinjaAndDojoServ ninjaAndDojoServ;

public NinjaAndDojoCont(NinjaAndDojoServ ninjaAndDojoServ) {
	this.ninjaAndDojoServ = ninjaAndDojoServ;
}

@RequestMapping("/")
public String notHere() {
	return "redirect:/dojo/new";
}

@GetMapping("/dojo/new")
public String addDojo(@ModelAttribute("dojo") Dojo dojo) {
	return"newdojo.jsp";
}
@PostMapping("/dojo/new")
public String processAddDojo(@Valid @ModelAttribute("dojo")Dojo dojo,BindingResult result) {

	if (result.hasErrors()) {
		return "newdojo.jsp";
	}
	else {
		ninjaAndDojoServ.addDojo(dojo);
		return "redirect:/ninja/new";
	}

}

@GetMapping("/ninja/new")
public String addNinja(@ModelAttribute("ninja")Ninja ninja,Model model) {
	List<Dojo> allDojo = ninjaAndDojoServ.allDojos();
	model.addAttribute("dojos",allDojo);
	return "newninja.jsp";
	
}

@PostMapping("/ninja/new")
public String processAddNinja(@Valid @ModelAttribute("ninja")Ninja ninja, Model model, BindingResult result) {
	if(result.hasErrors()) {
		List<Dojo> allDojo = ninjaAndDojoServ.allDojos();
		model.addAttribute("dojos",allDojo);
		return "newninja.jsp";
	}
	else {
		ninjaAndDojoServ.addNinja(ninja);
		return "redirect:/dojo/"+ninja.getDojo().getId();
	}	
}

@GetMapping("/dojo/{dojoId}")
public String showDojo(@PathVariable("dojoId")Long id, Model model) {
	Dojo dojo = ninjaAndDojoServ.getDojo(id);
	model.addAttribute("dojo", dojo);
	return "showninjas.jsp";
}
}