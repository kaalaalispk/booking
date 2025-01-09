package com.pk.booking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Booking {
	@Id
	private int BookingId;
	private String status;
	private String pickup;
	private String destination;
	private int distance;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	@OneToOne(cascade=CascadeType.ALL)
	private Driver driver;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(int bookingId, String status, String pickup, String destination, int distance, 
			Customer customer, Payment payment, Driver driver) {
		super();
		BookingId = bookingId;
		this.status = status;
		this.pickup = pickup;
		this.destination = destination;
		this.distance = distance;
		
		this.customer = customer;
		this.payment = payment;
		this.driver = driver;
	}






	public int getBookingId() {
		return BookingId;
	}
	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getPickup() {
		return pickup;
	}



	public void setPickup(String pickup) {
		this.pickup = pickup;
	}



	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	

}
