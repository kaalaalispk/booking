package com.pk.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.booking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
