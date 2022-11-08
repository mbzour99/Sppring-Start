package com.spring.mvc.productsandcategores.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.productsandcategores.Model.CategoryProduct;

@Repository
public interface ProductCategoryRepo  extends CrudRepository<CategoryProduct,Long>{

}

