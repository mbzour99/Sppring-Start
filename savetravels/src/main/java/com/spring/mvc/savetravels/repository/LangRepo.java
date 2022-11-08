package com.spring.mvc.savetravels.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.savetravels.models.Lang;

@Repository
public interface LangRepo extends CrudRepository<Lang, Long>{
 List<Lang> findAll();
 void deleteById(Long id);
 
}

