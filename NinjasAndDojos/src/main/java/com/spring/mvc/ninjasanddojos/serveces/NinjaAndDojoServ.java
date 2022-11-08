package com.spring.mvc.ninjasanddojos.serveces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.mvc.ninjasanddojos.models.Dojo;
import com.spring.mvc.ninjasanddojos.models.Ninja;
import com.spring.mvc.ninjasanddojos.repositores.DojoRepo;
import com.spring.mvc.ninjasanddojos.repositores.NinjaRepo;
@Service
public class NinjaAndDojoServ {
	
private final NinjaRepo ninjarepo;
private final DojoRepo dojorepo;

public NinjaAndDojoServ(NinjaRepo ninjarepo, DojoRepo dojorepo) {
	
	this.ninjarepo = ninjarepo;
	this.dojorepo = dojorepo;
}

public Dojo addDojo(Dojo dojo) {
	return dojorepo.save(dojo);
}

public List<Dojo> allDojos() {
	return dojorepo.findAll();
}

public Ninja addNinja(Ninja ninja) {
	return ninjarepo.save(ninja);
}

public Dojo getDojo(Long id){
	Optional<Dojo> dojo = dojorepo.findById(id);
	if(dojo.isPresent()) {
		return dojo.get();
		
	}
	else {
		return null;
	}
}

public Ninja getNinja(Long id){
	Optional<Ninja> ninja = ninjarepo.findById(id);
	if(ninja.isPresent()) {
		return ninja.get();
		
	}
	else {
		return null;
	}
	
}
}
