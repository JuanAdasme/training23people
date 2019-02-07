package io.p23.training.service;

import java.util.List;

import io.p23.training.domain.Student;

public interface StudentService {
	Student findById(Long id);
	
	Student create(Student student);
	
	List<Student> findAll();
	
	Student save(Student student);
	
	void delete(Long id);
}
