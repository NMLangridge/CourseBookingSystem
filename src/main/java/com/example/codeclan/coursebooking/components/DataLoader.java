package com.example.codeclan.coursebooking.components;

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

    }

}
