package com.spring.mvc.productsandcategores.Serv;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.mvc.productsandcategores.Model.Category;
import com.spring.mvc.productsandcategores.Model.CategoryProduct;
import com.spring.mvc.productsandcategores.Model.Product;
import com.spring.mvc.productsandcategores.Repo.CategoryRepo;
import com.spring.mvc.productsandcategores.Repo.ProductCategoryRepo;
import com.spring.mvc.productsandcategores.Repo.ProductRepo;
@Service
public class ProductCategortServ {

private final ProductRepo productRepo;
private final CategoryRepo categoryRepo;
private final ProductCategoryRepo catrgoryproduct;
public ProductCategortServ(ProductRepo productRepo, CategoryRepo categoryRepo, ProductCategoryRepo catrgoryproduct) {
	this.productRepo = productRepo;
	this.categoryRepo = categoryRepo;
	this. catrgoryproduct=catrgoryproduct;

}
public Product addProduct(Product product) {
	return productRepo.save(product);
}

public Category addCategory(Category category) {
	return categoryRepo.save(category);
}

public CategoryProduct joinCategoryToProduct(CategoryProduct categoryProduct) {
	return catrgoryproduct.save(categoryProduct);
}

public Product findProductById(Long id) {
	Optional<Product> check =  productRepo.findById(id);
	if (check.isPresent()) {
		return check.get();
	}
	else {
		return null;
	}
}

public List<Category> allCatergories(){
	return categoryRepo.findAll();
}
public List<Product> allProducts(){
	  return productRepo.findAll();
	  }

public List<Category> allExcludeCategories(Product product){
	return categoryRepo.findByProductsNotContains(product);
}

public List<Product> allExcludeProducts(Category category){
	return productRepo.findByCategoriesNotContains(category);
}

public Category findCategoryById(Long Id) {
	Optional<Category> check = categoryRepo.findById(Id);
	if(check.isPresent()) {
		return check.get();
	}
	else {
		return null;
	}
}
}