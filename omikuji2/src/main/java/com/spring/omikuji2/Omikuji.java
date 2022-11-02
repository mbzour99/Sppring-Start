package com.spring.omikuji2;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Omikuji {
	
	@RequestMapping("/omikuji")
	public String welcome(){
		return "mimi.jsp";
	}

	@RequestMapping(value="/omikuji/concat", method=RequestMethod.POST)
	public String concat(
	    @RequestParam(value="number") Integer number,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="pref") String pref,
	    @RequestParam(value="thing") String thing,
	    @RequestParam(value="des") String des,
	    
	    Model model,HttpSession ses
			) {
		ses.setAttribute("number",number);
		ses.setAttribute("city",number);
		ses.setAttribute("person",number);
		ses.setAttribute("pref",pref);
		ses.setAttribute("thing",thing);
		ses.setAttribute("des",des);
//		
//	    model.addAttribute("name",name);
//	    model.addAttribute("number",number);
//	    model.addAttribute("number",number);
//	    model.addAttribute("number",number);
//	    model.addAttribute("number",number);
	    return "redirect:/omikuji/show";
	}
	@RequestMapping("/omikuji/show")
	public String show(){
		return "show.jsp";
	}
	
}

