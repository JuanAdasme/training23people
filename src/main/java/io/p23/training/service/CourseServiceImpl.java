package io.p23.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.p23.training.domain.Course;
import io.p23.training.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService	{
	@Autowired
	CourseRepository repository;
	
	@Override
	public Course findById(Long id) {
		return repository.findById(id).
				orElse(null);
	}

	@Override
	public Course create(Course course) {
		return repository.save(course);
	}

	@Override
	public List<Course> findAll() {
		return repository.findAll();
	}

	@Override
	public Course save(Course course) {
		return repository.save(course);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
