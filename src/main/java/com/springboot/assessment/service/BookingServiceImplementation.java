package com.springboot.assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.assessment.model.Booking;
import com.springboot.assessment.repo.BookingRepo;

@Service
public class BookingServiceImplementation implements BookingService
{
	BookingRepo repo;

	public BookingServiceImplementation(BookingRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addBooking(Booking booking) 
	{
		repo.save(booking);
	}

	@Override
	public List<Booking> getallBookings() 
	{
		return repo.findAllBookings();
	}

	@Override
	public String updateBooking(Booking booking) 
	{
		repo.update(booking);
		return "UpdateSuccess";
	}

	@Override
	public String deleteBooking(int booking_id) 
	{
		repo.deleteById(booking_id);
		return "DeleteSuccess";
	}

	@Override
	public Booking findBookingById(int booking_id) 
	{
		Booking booking = repo.findById(booking_id);
		System.out.println(booking);
		return booking;
	}
}
