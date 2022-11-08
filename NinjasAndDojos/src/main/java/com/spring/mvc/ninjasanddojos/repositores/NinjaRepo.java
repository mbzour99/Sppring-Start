package com.spring.mvc.ninjasanddojos.repositores;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.ninjasanddojos.models.Ninja;
@Repository
public interface NinjaRepo extends CrudRepository<Ninja,Long> {

}

