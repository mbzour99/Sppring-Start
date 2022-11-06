package com.spring.mvc.languages.controllers;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.spring.mvc.languages.serveces.LangServ;
import com.spring.mvc.languages.models.Lang;

public class LangCont {
	private LangServ langServ;
	public LangCont(LangServ langServ) {
		this.langServ=langServ;
	}
    @GetMapping("/languages")
    public String newLang(@ModelAttribute("travel") Lang travel,Model model) {
    	model.addAttribute("travels",langServ.allLangs());
        return "shows.jsp";
    }
    @PostMapping("/languages")
    public String createme(@Valid @ModelAttribute("travel") Lang travel, BindingResult result) {
        if (result.hasErrors()) {
            return "shows.jsp";
        } else {
        	langServ.createLang(travel);
            return "redirect:/languages";
        }
        
    }
    @GetMapping("/languages/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Lang lang = langServ.findLang(id);
        model.addAttribute("lang", lang);
        return "delete.jsp";
    }
    @GetMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Lang travel = langServ.findLang(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
    
    @PutMapping("/languages/edit/{id}")
    public String update(@Valid @ModelAttribute("travel") Lang travel, BindingResult result,@PathVariable("id")Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	langServ.updateLang(id,travel);
            return "redirect:/languages";
        }
    }
    @DeleteMapping("/languages/{id}")
    public String destroyi(@PathVariable("id") Long id) {
    	langServ.deleteLang(id);
        return "redirect:/languages";
    }
}
