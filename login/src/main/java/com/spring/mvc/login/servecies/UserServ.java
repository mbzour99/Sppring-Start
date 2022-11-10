package com.spring.mvc.login.servecies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.spring.mvc.login.models.LoginUser;
import com.spring.mvc.login.models.User;
import com.spring.mvc.login.repositores.UserRepo;

@Service
public class UserServ {
    
	private final UserRepo userrepo;
	
	public UserServ(UserRepo userrepo){
    this.userrepo=userrepo;
	}
	
	public List<User> allUsers(){
		return userrepo.findAll();		
	}
    public void addUser(Long id) {
    	User u=getUser(id);
    	userrepo.save(u);
    }
	public User getUser(Long id) {
	return this.userrepo.findById(id).orElse(null);
}
	
	public User getByEmail(String myemail) {

		return this.userrepo.findByEmail(myemail).orElse(null);
	}
    public User register(User newUser, BindingResult result) {
    	 String myemail=newUser.getEmail();
    	 User x=getByEmail(myemail);
    	 
        if(x!=null) {
        	return null;	
        }
        else {
        	 
        }
        
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        
        return null;
    }

}
	