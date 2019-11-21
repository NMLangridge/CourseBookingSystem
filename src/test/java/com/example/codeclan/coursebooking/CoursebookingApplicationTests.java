package com.example.codeclan.coursebooking;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.models.Course;
import com.example.codeclan.coursebooking.models.Customer;
import com.example.codeclan.coursebooking.repositories.bookingrepositories.BookingRepository;
import com.example.codeclan.coursebooking.repositories.courserepositories.CourseRepository;
import com.example.codeclan.coursebooking.repositories.customerrepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoursebookingApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void findCoursesByStarRating() {
		List<Course> found = courseRepository.findCoursesByStarRating(4);
		assertEquals(4, found.get(0).getStarRating());
	}

//	@Test
//	public void findCustomersByCourse() {
//		List<Customer> found = customerRepository.findCustomersByCourse("Photography");
//		assertEquals("Photography", found.get(0).getName());
//	}

//
//	@Test
//	public void findCoursesByCustomer() {
//		List<Course> found = courseRepository.findCoursesByCustomer("Nathan");
//		assertEquals("Nathan", found.get(0).getName());
//	}

}
