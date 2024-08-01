package com.springboot.assessment.repo;

import java.util.List;

import com.springboot.assessment.model.Booking;



public interface BookingRepo 
{
	public void save(Booking booking);

	public List<Booking> findAllBookings();

	public void update(Booking booking);

	public void deleteById(int booking_id);
	
	public Booking findById(int booking_id);
}
