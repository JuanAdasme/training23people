package io.p23.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.p23.training.domain.Course;
import io.p23.training.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {
	@Autowired
	CourseService service;
	
	@GetMapping("/{id}")
	public Course findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Course create(@RequestBody Course course) {
		return service.create(course);
	}
	
	@GetMapping
	public List<Course> findAll() {
		return service.findAll();
	}
	
	@PutMapping("/{id}")
	public Course save(@RequestBody Course course, @PathVariable Long id) {
		course.setId(id);
		return service.save(course);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
