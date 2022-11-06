package com.spring.mvc.savetravels.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.savetravels.models.Lang;

@Repository
public interface LangRepo extends CrudRepository<Lang, Long>{
 // this method retrieves all the books from the database
 List<Lang> findAll();
// // this method finds books with descriptions containing the search string
// List<Travel> findByDescriptionContaining(String search);
// // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
// // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
 void deleteById(Long id);
 
}

