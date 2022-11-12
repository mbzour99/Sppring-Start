package com.axsos.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.models.LoginUser;
import com.axsos.mvc.models.User;
import com.axsos.mvc.services.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userServ;
	
	@GetMapping("/")
	public String loginRegistration(HttpSession session, Model model) {
		if (session.getAttribute("user_object")!= null) {
			return "redirect:/success";
		}
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "logreg.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("newUser") User user,
							   BindingResult result,
							   Model model,
							   HttpSession session) {
		
		
		User u=userServ.register(user,result);
		
		if (result.hasErrors()) {

			model.addAttribute("newLogin", new LoginUser() );
			return "logreg.jsp";
		}
		else {
			session.setAttribute("user_object",user);
			session.setAttribute("logged_in",true);
			return "redirect:/success";
		}
	}
	
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser loginUser,
							BindingResult result,
							Model model,
							HttpSession session) {
		// go to login process
		userServ.login(loginUser,result);
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "logreg.jsp";
		}
		else {
			session.setAttribute("user_object", userServ.findUserByEmail(loginUser.getEmail()));
			session.setAttribute("allbooks", userServ.findUserByEmail(loginUser.getEmail()).getBooks());
			model.addAttribute("allbooks",session.getAttribute("allbooks"));
			session.setAttribute("logged_in",true);
			
			model.addAttribute("allbooks",userServ.findUserByEmail(loginUser.getEmail()).getBooks());
			return "redirect:/success";
		}
		
	}
	
	@GetMapping("/success")
	public String sucesspage(HttpSession session, Model model) {
		model.addAttribute("loggedUser",session.getAttribute("user_object"));
		model.addAttribute("allbooks",userServ.findAllBooks());
//		User u=(User)session.getAttribute("user_object");
//		System.out.println(u.getBooks().get(0));
//		model.addAttribute("user",session.getAttribute("user_object"));
		return "success.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user_object", null);
		session.setAttribute("logged_in", false);
		return "redirect:/";
	}
	@GetMapping("/books/new")
	public String addAbook(@ModelAttribute("newbook") Book book) {
		
		return "newbook.jsp";
	}
	@PostMapping("/books/new")
	public String addbookmy(@Valid @ModelAttribute("newbook") Book book,BindingResult result,Model model,HttpSession s){
		if(result.hasErrors()) {
			return "newbook.jsp";
		}
		userServ.addBook(book,s);	
		User u=(User) s.getAttribute("user_object");
//		List<Book>books=u.getBooks();
//		books.add(book);
//		u.setBooks(books);
		model.addAttribute("allbooks",u.getBooks());
		return "redirect:/success";
		
	}
	@GetMapping("/books/{id}")
	public String aaal(@ModelAttribute("editbook") Book book,Model model,@PathVariable("id") Long id) {
		Book b=userServ.findBookById(id);
		model.addAttribute("mbook",b);
		return"edit.jsp";
	}
	@PutMapping("/books/{id}/edit")
	public String updateme(@Valid @ModelAttribute("editbook")Book b, @PathVariable("id") Long id,BindingResult re) {
		if(re.hasErrors()) {
			return"edit.jsp";
		}
		userServ.updateBook(id, b);
	return "redirect:/success";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletem(@PathVariable("id")Long id) {
		userServ.deletem(id);
		return "redirect:/success";
	}

}
