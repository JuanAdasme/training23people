package io.p23.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.p23.training.domain.Student;
import io.p23.training.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public Student findById(Long id) {
		return repository.findById(id).
				orElse(null);
	}

	@Override
	public Student create(Student student) {
		return repository.save(student);
	}
	
	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Student save(Student student) {
		return repository.save(student);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
