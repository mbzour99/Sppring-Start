package com.spring.mvc.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.login.models.LoginUser;
import com.spring.mvc.login.models.User;
import com.spring.mvc.login.servecies.UserServ;
@Controller
public class UserCont {
     @Autowired
     UserServ userserv;
	
	@GetMapping("/")
	public String userlogin(@ModelAttribute("newUser") User user ,@ModelAttribute("newLogin") LoginUser loginuser) {
		
		return "loginandregisteration.jsp";
		
	}
	
	@PostMapping("/register")
	public String userloginprosess(@Valid @ModelAttribute("user") User user,BindingResult result,HttpSession session,Model model) {
	      if(session.getAttribute("userId")!=null) {
	    	  

	      }
	        if(result.hasErrors()) {

	            model.addAttribute("newLogin", new LoginUser());
	           
	            
		return "loginandregisteration.jsp";
	}
	        return "";
	}
	

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        

        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
    
 
        return "redirect:/home";
    }
@GetMapping("/welcome")
public String showlogin() {
	return "welcome.jsp";
}

	
}
	    
	    
	    
//		 @GetMapping("/")
//	    public String index(Model model) {
//	    
//	        model.addAttribute("newUser", new User());
//	        model.addAttribute("newLogin", new LoginUser());
//	        return "index.jsp";
//	    }
