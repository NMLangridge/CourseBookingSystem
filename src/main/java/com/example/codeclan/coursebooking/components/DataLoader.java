package com.example.codeclan.coursebooking.components;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.models.Course;
import com.example.codeclan.coursebooking.models.Customer;
import com.example.codeclan.coursebooking.repositories.bookingrepositories.BookingRepository;
import com.example.codeclan.coursebooking.repositories.courserepositories.CourseRepository;
import com.example.codeclan.coursebooking.repositories.customerrepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Photography", "Glasgow", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Graphic Design", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Nathan", "Glasgow", 28);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Faye", "Edinburgh", 28);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("01-09-20", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("31-01-20", course2, customer2);
        bookingRepository.save(booking2);

    }

}
