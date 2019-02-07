package io.p23.training.service;

import java.util.List;

import io.p23.training.domain.Course;

public interface CourseService {
	Course findById(Long id);
	
	Course create(Course course);
	
	List<Course> findAll();
	
	Course save(Course course);
	
	void delete(Long id);
}
