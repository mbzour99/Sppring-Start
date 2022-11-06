package com.spring.mvc.savetravels.serveses;
//package com.spring.mvc.languages.repositores;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.spring.mvc.savetravels.models.Travel;
import com.spring.mvc.savetravels.repository.TravelsRepo;

//import antlr.collections.List;
import java.util.List;
@Service
public class TravelServ {

private final TravelsRepo travelsRepo;

 public TravelServ(TravelsRepo travelsRepo) {
     this.travelsRepo = travelsRepo;
 }
 // returns all the books
 public List<Travel> allTravels() {
     return travelsRepo.findAll();
 }

 public void createTravel(Travel b) {
	 
    travelsRepo.save(b);
 }

 public Travel updateTravel(Long id,Travel expense) {
	    Travel toUpdate= findTravel(id);
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
 public Travel findTravel(Long id) {
     Optional<Travel> optionalTravel = travelsRepo.findById(id);
     if(optionalTravel.isPresent()) {
         return optionalTravel.get();
     } else {
         return null;
     }
 }
}


