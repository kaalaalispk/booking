package com.pk.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.booking.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
