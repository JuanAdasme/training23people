package io.p23.training.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import io.p23.training.domain.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {
	List<Student> findAll();
	
	void deleteById(Long id);
}
