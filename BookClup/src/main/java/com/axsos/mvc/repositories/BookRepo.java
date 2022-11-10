package com.axsos.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.mvc.models.Book;

public interface BookRepo extends CrudRepository<Book,Long>{
	List<Book> findAll();

}
