package com.pk.booking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Driver {
	@Id
	private int driverId;
	private String driverName;
	private String gender;
	private String driverMobileNo;
	private String driverEmailId;
	@OneToOne(cascade=CascadeType.ALL)
	private Vehicle vehicle;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int driverId, String driverName, String gender, String driverMobileNo, String driverEmailId,
			Vehicle vehicle) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.gender = gender;
		this.driverMobileNo = driverMobileNo;
		this.driverEmailId = driverEmailId;
		this.vehicle = vehicle;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDriverMobileNo() {
		return driverMobileNo;
	}
	public void setDriverMobileNo(String driverMobileNo) {
		this.driverMobileNo = driverMobileNo;
	}
	public String getDriverEmailId() {
		return driverEmailId;
	}
	public void setDriverEmailId(String driverEmailId) {
		this.driverEmailId = driverEmailId;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", gender=" + gender
				+ ", driverMobileNo=" + driverMobileNo + ", driverEmailId=" + driverEmailId + ", vehicle=" + vehicle
				+ "]";
	}
	

}
