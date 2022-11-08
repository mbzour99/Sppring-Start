package com.spring.mvc.savetravels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.savetravels.models.Lang;
import com.spring.mvc.savetravels.serveses.TravelServ;

import java.util.List;

import javax.validation.Valid;
@Controller
public class TravelsApi {
	 private final TravelServ travelsServ;
	 
	 public TravelsApi(TravelServ travelsServ){
	     this.travelsServ = travelsServ;
	 }
	 
    @GetMapping("/new")
    public String newtravel(@ModelAttribute("travel") Lang travel,Model model) {
    	model.addAttribute("travels",travelsServ.allTravels());
        return "savet.jsp";
    }
    
    @PostMapping("/new")
    public String createme(Model model,@Valid @ModelAttribute("travel") Lang travel, BindingResult result) {
        if (result.hasErrors()) {
          	model.addAttribute("travels",travelsServ.allTravels());
            return "savet.jsp";
        } else {
        	travelsServ.createTravel(travel);
            return "redirect:/new";
        }
        
    }
    @GetMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Lang travel = travelsServ.findTravel(id);
        model.addAttribute("travel", travel);
        return "delete.jsp";
    }
    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Lang travel = travelsServ.findTravel(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
    
    @PutMapping("/expenses/edit/{id}")
    public String update(@Valid @ModelAttribute("travel") Lang travel, BindingResult result,@PathVariable("id")Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	travelsServ.updateTravel(id,travel);
            return "redirect:/new";
        }
    }
    
    @DeleteMapping("/expenses/{id}")
    public String destroyi(@PathVariable("id") Long id) {
    	travelsServ.deleteTravel(id);
        return "redirect:/new";
    }

}



