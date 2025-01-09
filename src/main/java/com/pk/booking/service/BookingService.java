package com.pk.booking.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.booking.entity.Booking;
import com.pk.booking.entity.Customer;
import com.pk.booking.entity.Driver;
import com.pk.booking.entity.Payment;
import com.pk.booking.repository.BookingRepository;
@Service
public class BookingService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private ModelMapper mapper;

	public Booking makeBooking(Booking booking) {
		Customer c=restTemplate.getForObject("http://localhost:9091/customer/"+booking.getCustomer().getCustomerId(), Customer.class);
		booking.setCustomer(c);
		if(booking.getPickup()==booking.getDriver().getVehicle().getLocation()) {
			Driver d=restTemplate.getForObject("http://localhost:9092/driver/"+booking.getDriver().getDriverId(), Driver.class);
			booking.setDriver(d);
		}
		if(booking.getStatus()=="Completed") {
			Payment p=restTemplate.getForObject("http://localhost:9095/makepayment"+booking.getPayment().getPaymentId(), Payment.class);
			booking.setPayment(p);
			
		}
		
		return bookingRepository.save(booking);
	}

	public List<Booking> getAllBookings(Booking booking) {
		List<Booking> d=bookingRepository.findAll();
		return d;
		
	}

	public Booking getPaymentById(int bookingId) {
		Optional<Booking> d=bookingRepository.findById(bookingId);
		if(d.isEmpty()) {
			throw new RuntimeException("No Booking exist with booking id");
		}
		return mapper.map(d.get(),Booking.class);
		
	}

}
