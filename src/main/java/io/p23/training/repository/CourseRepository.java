package io.p23.training.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import io.p23.training.domain.Course;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course,Long>  {
	List<Course> findAll();
}
