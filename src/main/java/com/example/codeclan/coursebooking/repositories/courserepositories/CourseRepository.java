package com.example.codeclan.coursebooking.repositories.courserepositories;

import com.example.codeclan.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findCoursesByStarRating(int starRating);
//    List<Course> findCoursesByCustomer(String name);
}
