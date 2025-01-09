package com.pk.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.booking.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
