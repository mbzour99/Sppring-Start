package com.spring.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.models.Book;
import com.spring.mvc.services.BookService;
@Controller
public class BookMange {
	 private final BookService bookService;
	 public BookMange(BookService bookService){
	     this.bookService = bookService;
	 }
	
	@RequestMapping("/books/{id}")
	public String showbook(@PathVariable(value="id") long id, Model model) {
		Book book = (Book)bookService.findBook(id);
		model.addAttribute("mybook", book);
		return "showbook.jsp";
		
	}
	 @RequestMapping("/books")
	 public String index(Model model) {
	     List<Book> books = bookService.allBooks();
	     model.addAttribute("books", books);
	     return "tableofbooks.jsp";
	 }
	
}


