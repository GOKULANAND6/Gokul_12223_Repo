package com.springboot.assessment.service;

import java.util.List;

import com.springboot.assessment.model.Booking;

public interface BookingService 
{
	public void addBooking(Booking booking);
	 
	public List<Booking> getallBookings();

	public String updateBooking(Booking booking);

	public String deleteBooking(int booking_id);
	
	public Booking findBookingById(int booking_id);
}
