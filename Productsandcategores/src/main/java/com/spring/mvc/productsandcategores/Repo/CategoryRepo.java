package com.spring.mvc.productsandcategores.Repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.productsandcategores.Model.Category;
import com.spring.mvc.productsandcategores.Model.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {
	
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
	

}
