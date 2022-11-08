package com.spring.mvc.ninjasanddojos.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.ninjasanddojos.models.Dojo;
@Repository
public interface DojoRepo extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
}