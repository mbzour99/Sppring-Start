package com.spring.mvc.projectmanager.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.projectmanager.models.Task;

@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {
	List<Task> findAll();
	List<Task> findByProjectIdIs(Long id);
}