package com.example.codeclan.coursebooking.controllers;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.repositories.bookingrepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

}
