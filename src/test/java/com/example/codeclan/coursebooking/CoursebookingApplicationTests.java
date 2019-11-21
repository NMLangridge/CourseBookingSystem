package com.example.codeclan.coursebooking;

import com.example.codeclan.coursebooking.repositories.bookingrepositories.BookingRepository;
import com.example.codeclan.coursebooking.repositories.courserepositories.CourseRepository;
import com.example.codeclan.coursebooking.repositories.customerrepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}
