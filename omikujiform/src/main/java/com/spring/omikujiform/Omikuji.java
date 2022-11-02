package com.spring.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Omikuji {
	
	@RequestMapping("/omikuji")
	public String welcome(){
		return "mimi.jsp";
	}
@PostMapping("/process")
public String  mmmmm(@RequestParam(value="number") Integer number,HttpSession session) {
	session.setAttribute("number",number);

	return "redirect:/omikuji/show";
}
//	@PostMapping("/process")
//	public String jdkljl(
//	    @RequestParam(value="number") Integer number,
//	    @RequestParam(value="city") String city,
//	    @RequestParam(value="person") String person,
//	    @RequestParam(value="pref") String pref,
//	    @RequestParam(value="thing") String thing,
//	    @RequestParam(value="des") String des,
//	    HttpSession session
//			) {
//		session.setAttribute("number",number);
//		session.setAttribute("city",city);
//		session.setAttribute("person",person);
//		session.setAttribute("pref",pref);
//		session.setAttribute("thing",thing);
//		session.setAttribute("des",des);
//	    return "redirect:/omikuji"; 
//	}
	
	@RequestMapping("/omikuji/show")
	public String showm(){
		return "show.jsp";
	}
	
}
