package com.pk.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.booking.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
