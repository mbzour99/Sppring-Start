package com.spring.mvc.projectmanager.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.projectmanager.models.Project;
import com.spring.mvc.projectmanager.models.User;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {
	List<Project> findAll();
	Project findByIdIs(Long id);
	List<Project> findAllByUsers(User user);
	List<Project> findByUsersNotContains(User user);
}

