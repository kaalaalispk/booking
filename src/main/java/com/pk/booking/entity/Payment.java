package com.pk.booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Payment {
	@Id
	private int paymentId;
	private String paymentMode;
	private String paymentStatus;
	private int amount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, String paymentMode, String paymentStatus, int amount) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", paymentStatus=" + paymentStatus
				+ ", amount=" + amount + "]";
	}
	


}
