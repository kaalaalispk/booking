package com.pk.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pk.booking.entity.Booking;
import com.pk.booking.service.BookingService;
import com.pk.payment.entity.Payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	@PostMapping("/booking")
	public Booking makeBooking(@RequestBody Booking booking) {
		return bookingService.makeBooking(booking);
		 
	}
	@GetMapping("/booking")
	public List<Booking> getAllBookings(@RequestParam Booking booking) {
		return bookingService.getAllBookings(booking);
		
	}
	@GetMapping("/booking/{bookingId}")
	public Booking getBookingById(@PathVariable int bookingId) {
		return bookingService.getPaymentById(bookingId);
		
	}
	

}
