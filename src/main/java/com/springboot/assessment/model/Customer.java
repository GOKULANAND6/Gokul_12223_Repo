package com.springboot.assessment.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "customer")
public class Customer 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID")
	private int cus_id;
	@Column( name = "NAME")
	private String cus_name;
	@Column( name = "GENDER")
	private String cus_gender;
	@Column( name = "MOBILE")
	private String cus_mobile;
	@Column( name = "TIME")
	private String cus_time;
	@Column( name = "PRIORITY")
	private String cus_priority;
	
	@ManyToOne(targetEntity = Booking.class, cascade  = CascadeType.MERGE)
	@JoinColumn
	private Booking booking;

	public Customer() 
	{
		super();
	}

	public Customer(int cus_id, String cus_name, String cus_gender, String cus_mobile, String cus_time,
			String cus_priority, Booking booking) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_gender = cus_gender;
		this.cus_mobile = cus_mobile;
		this.cus_time = cus_time;
		this.cus_priority = cus_priority;
		this.booking = booking;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_gender() {
		return cus_gender;
	}

	public void setCus_gender(String cus_gender) {
		this.cus_gender = cus_gender;
	}

	public String getCus_mobile() {
		return cus_mobile;
	}

	public void setCus_mobile(String cus_mobile) {
		this.cus_mobile = cus_mobile;
	}

	public String getCus_time() {
		return cus_time;
	}

	public void setCus_time(String cus_time) {
		this.cus_time = cus_time;
	}

	public String getCus_priority() {
		return cus_priority;
	}

	public void setCus_priority(String cus_priority) {
		this.cus_priority = cus_priority;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_name=" + cus_name + ", cus_gender=" + cus_gender + ", cus_mobile="
				+ cus_mobile + ", cus_time=" + cus_time + ", cus_priority=" + cus_priority + ", booking=" + booking
				+ "]";
	}
}
