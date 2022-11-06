package com.spring.mvc.savetravels.serveses;
//package com.spring.mvc.languages.repositores;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.spring.mvc.savetravels.models.Lang;
import com.spring.mvc.savetravels.repository.LangRepo;

//import antlr.collections.List;
import java.util.List;
@Service
public class TravelServ {

private final LangRepo travelsRepo;

 public TravelServ(LangRepo travelsRepo) {
     this.travelsRepo = travelsRepo;
 }
 // returns all the books
 public List<Lang> allTravels() {
     return travelsRepo.findAll();
 }

 public void createTravel(Lang b) {
	 
    travelsRepo.save(b);
 }

 public Lang updateTravel(Long id,Lang expense) {
	    Lang toUpdate= findTravel(id);
	    toUpdate.setAmount(expense.getAmount());
	    toUpdate.setDescription(expense.getDescription());;
	    toUpdate.setExpense(expense.getExpense());;
	    toUpdate.setVendor(expense.getVendor());;
	    travelsRepo.save(toUpdate);
	    return null;
	}
 public void deleteTravel(Long id) {
	 travelsRepo.deleteById(id);
 }
 // retrieves a book
 public Lang findTravel(Long id) {
     Optional<Lang> optionalTravel = travelsRepo.findById(id);
     if(optionalTravel.isPresent()) {
         return optionalTravel.get();
     } else {
         return null;
     }
 }
}


