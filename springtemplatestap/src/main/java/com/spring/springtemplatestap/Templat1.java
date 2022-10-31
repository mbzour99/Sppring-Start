package com.spring.springtemplatestap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Templat1 {
    @RequestMapping("/")
    public String hello() {
    
            return"temo.jsp";
            
    }

    @RequestMapping("/tt")
    public String index1(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	model.addAttribute("name",name);
    	model.addAttribute("itemName",itemName);
    	model.addAttribute("price",price);
    	model.addAttribute("description",description);
    	model.addAttribute("vendor",vendor);
    	
    
        return "temptemp.jsp";
    }
   
    

	@RequestMapping("/te")
	public String index(Model mo) {
		mo.addAttribute("m","bzour");
		return "temptemp.jsp";
	}

}

