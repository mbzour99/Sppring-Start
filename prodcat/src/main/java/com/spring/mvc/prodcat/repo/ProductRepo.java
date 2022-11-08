package com.spring.mvc.prodcat.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.prodcat.model.Category;
import com.spring.mvc.prodcat.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
	List<Product>findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
