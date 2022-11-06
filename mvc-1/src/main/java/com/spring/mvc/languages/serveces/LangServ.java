package com.spring.mvc.languages.serveces;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.spring.mvc.languages.models.Lang;
import com.spring.mvc.languages.repositores.LangRepo;

//import antlr.collections.List;
import java.util.List;
@Service
public class LangServ {

private final LangRepo langRepo;

public LangServ(LangRepo langRepo) {
   this.langRepo = langRepo;
}
// returns all the books
public List<Lang> allLangs() {
   return langRepo.findAll();
}

public void createLang(Lang b) {
	 
  langRepo.save(b);
}

public Lang updateLang(Long id,Lang lang) {
	    Lang toUpdate= findLang(id);
	    toUpdate.setName(lang.getName());
	    toUpdate.setCreator(lang.getCreator());;
	    toUpdate.setVersion(lang.getVersion());;
	    langRepo.save(toUpdate);
	    return null;
	}
public void deleteLang(Long id) {
	 langRepo.deleteById(id);
}
// retrieves a book
public Lang findLang(Long id) {
   Optional<Lang> optionalTravel = langRepo.findById(id);
   if(optionalTravel.isPresent()) {
       return optionalTravel.get();
   } else {
       return null;
   }
}
}


