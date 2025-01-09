package com.pk.booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Vehicle {
	@Id
	private String vehicleId;
	private String vehicleType;
	private int vehicleTypeId;
	private String location;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String vehicleId, String vehicleType, int vehicleTypeId, String location) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleTypeId = vehicleTypeId;
		this.location = location;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleTypeId() {
		return vehicleTypeId;
	}
	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleTypeId=" + vehicleTypeId
				+ ", location=" + location + "]";
	}
	
}
