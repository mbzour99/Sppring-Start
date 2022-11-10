package com.axsos.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.models.LoginUser;
import com.axsos.mvc.models.User;
import com.axsos.mvc.repositories.BookRepo;
import com.axsos.mvc.repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
    @Autowired
    BookRepo bookRepo;
    
	public List<User> findAllUsers() {
		return (List<User>) userRepo.findAll();
	}
	
	public User findUserById(Long id) {
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}
	public User findUserByEmail(String email) {
		Optional<User> user = userRepo.findByEmail(email);
		if (user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}
	public List<Book> findAllBooks(){
		return bookRepo.findAll();
	}
	
	public void addBook(Book book, HttpSession s) {
		User uuu=(User) s.getAttribute("user_object");
//		Long nyid=uuu.getId();
		book.setUser(uuu);
		bookRepo.save(book);
		
	}
	public Book findBookById(Long id) {
		Optional<Book> mybook =  bookRepo.findById(id);
		if (mybook.isPresent()) {
			return mybook.get();
		}
		else {
			return null;
		}
	}
    public User register(User newUser, BindingResult result) {
        Optional<User> userIfFound = userRepo.findByEmail(newUser.getEmail());
    	if (userIfFound.isPresent()) {
    		result.rejectValue("email", "Matches", "Email already exists!");
    	}
        if (!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("confirm", "Matches", "Password does not match");
        }
        if (result.hasErrors()) {
        	return null;
        }
        else {
        	String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        	newUser.setPassword(hashedPW);
        	userRepo.save(newUser);
        	return newUser;
        }
    }
    // Login service
    public User login(LoginUser loginUserObject, BindingResult result) {
    	if (result.hasErrors()) {
    		return null;
    	}
    	
        Optional<User> userIfFound = userRepo.findByEmail(loginUserObject.getEmail());
        if (!userIfFound.isPresent()) {
        	result.rejectValue("email", "Matches", "email is not found!");
        	return null;
        }
        
        if (!BCrypt.checkpw(loginUserObject.getPassword(), userIfFound.get().getPassword())) {
        	result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if (result.hasErrors()) {
        	return null;
        }
        else {
        	return userIfFound.get();
        }
    }
}
