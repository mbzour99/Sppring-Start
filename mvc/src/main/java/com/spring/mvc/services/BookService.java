package com.spring.mvc.services;

import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.spring.mvc.models.Book;
import com.spring.mvc.repositories.BookRepository;

//import antlr.collections.List;
import java.util.List;
@Service
public class BookService {

private final BookRepository bookRepository;
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 public Book updateBook(Long id, String title, String desc, String lang,Integer numOfPages) {
	 Book bb=(Book)findBook(id);
	 bb.setDescription(desc);
	 bb.setTitle(title);
	 bb.setNumberOfPages(numOfPages);
     return bookRepository.save(bb);
 }

 public void deleteBook(Long id) {
      bookRepository.deleteById(id);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
}


