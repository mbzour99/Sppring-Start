package com.spring.mycounter;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCounter {
	@RequestMapping("/your_server")
	public String welcome(){
		return "showcount.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session) {
		
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("counter");
			count += 1;
			session.setAttribute("counter", count);
		}
		return "count.jsp";
	}
	
}
