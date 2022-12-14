package com.spring.mvc.bookbrokerr.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.mvc.bookbrokerr.models.Book;
import com.spring.mvc.bookbrokerr.models.User;
import com.spring.mvc.bookbrokerr.repositories.BookRepo;

@Service
public class BookService {
	private final BookRepo bookRepo;
	
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
//	public List<Book> unborrowedBooks(User user){
//		return bookRepo.findByBorrowerIdIsOrUserIdIs(null, user.getId());
//	}
	
	public List<Book> unborrowedBooks(User user){
		return bookRepo.findByBorrowerIdIs(null);
	}
	
	public List<Book> borrowedBooks(User user){
		return bookRepo.findByBorrowerIdIs(user.getId());
	}
	
	public List<Book> myBooks(User user){
		return bookRepo.findByUserIdIs(user.getId());
	}
	
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
	public void deleteBook(Book book) {
		bookRepo.delete(book);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}
	
	public void removeBorrower(Book book) {
		book.setBorrower(null);
		bookRepo.save(book);
	}
	
	public void addBorrower(Book book, User user) {
		book.setBorrower(user);
		bookRepo.save(book);
	}

}
