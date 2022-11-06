package com.spring.mvc.languages.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.mvc.languages.models.Lang;

public interface LangRepo  extends CrudRepository<Lang, Long>{
	  List<Lang> findall();
	  

}
