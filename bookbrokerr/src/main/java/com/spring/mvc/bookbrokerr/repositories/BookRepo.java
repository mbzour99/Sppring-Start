package com.spring.mvc.bookbrokerr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.bookbrokerr.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	List<Book> findAll();
	List<Book> findByUserIdIs(Long userId);
	List<Book> findByBorrowerIdIs(Long userId);
	List<Book> findByBorrowerIdIsOrUserIdIs(Long borrowerID, Long userId);
	@Query(value="SELECT * FROM books WHERE borrower_id=1",nativeQuery = true)
	List<Book> unb();
	@Query(value="SELECT * FROM books WHERE borrower_id !=1",nativeQuery = true)
	List<Book> nb();
}