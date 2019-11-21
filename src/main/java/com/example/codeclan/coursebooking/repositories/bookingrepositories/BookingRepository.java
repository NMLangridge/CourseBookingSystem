package com.example.codeclan.coursebooking.repositories.bookingrepositories;

import com.example.codeclan.coursebooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

}
