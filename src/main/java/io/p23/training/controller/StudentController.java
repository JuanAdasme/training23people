package io.p23.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.p23.training.domain.Student;
import io.p23.training.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService service;
	
	@Value("${msg}")
	String msg;
	
	@GetMapping("/{id}")
	public Student findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Student create(@RequestBody Student student) {
		return service.create(student);
	}
	
	@GetMapping
	public List<Student> findAll() {
		return service.findAll();
	}
	
	@PutMapping("/{id}")
	public Student save(@RequestBody Student student, @PathVariable Long id) {
		student.setId(id);
		return service.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@GetMapping("/test")
	public String test() {
		return msg;
	}
}
