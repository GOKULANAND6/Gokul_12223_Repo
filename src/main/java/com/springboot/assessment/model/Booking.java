package com.springboot.assessment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "booking")
public class Booking 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "ID")
	private int id;
	@Column( name = "OPTIONS")
	private String booking_options;
	@Column( name = "PRICE")
	private String booking_price;
	@Column( name = "OFFERS")
	private String booking_offers;
	
	public Booking() 
	{
		super();
	}

	public Booking(int id, String booking_options, String booking_price, String booking_offers) {
		super();
		this.id = id;
		this.booking_options = booking_options;
		this.booking_price = booking_price;
		this.booking_offers = booking_offers;
	}

	public int getBooking_id() {
		return id;
	}

	public void setBooking_id(int id) {
		this.id = id;
	}

	public String getBooking_options() {
		return booking_options;
	}

	public void setBooking_options(String booking_options) {
		this.booking_options = booking_options;
	}

	public String getBooking_price() {
		return booking_price;
	}

	public void setBooking_price(String booking_price) {
		this.booking_price = booking_price;
	}

	public String getBooking_offers() {
		return booking_offers;
	}

	public void setBooking_offers(String booking_offers) {
		this.booking_offers = booking_offers;
	}

//	@Override
//	public String toString() {
//		return "Booking [booking_id=" + booking_id + ", booking_options=" + booking_options + ", booking_price="
//				+ booking_price + ", booking_offers=" + booking_offers + "]";
//	}
}
