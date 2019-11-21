package com.example.codeclan.coursebooking.repositories.customerrepositories;

import com.example.codeclan.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
//    List<Customer> findCustomersByCourse(String name);
}
