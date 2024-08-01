package com.springboot.assessment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment.model.Booking;
import com.springboot.assessment.service.BookingServiceImplementation;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController 
{
	BookingServiceImplementation service;

	public BookingController(BookingServiceImplementation service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public  String insertBooking(@RequestBody Booking booking)
	{
//		String msg = "";
//		try {
//		service.addBooking(booking);
//		msg = "Successfully Added";
//		}
//		catch (Exception e) {
//		msg = "Failed to Add";
//		}
		service.addBooking(booking);
	return "Success";
	}

	@GetMapping("/all")
	public List<Booking> readAllBookings()
	{
	return service.getallBookings();
	}

	@PutMapping
	public  String updateBooking(@RequestBody Booking booking)
	{
	String msg = "";
	try {
	service.updateBooking(booking);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{booking_id}")
	public String deleteBookingbyId(@PathVariable("booking_id") int booking_id)
	{
	String msg = "";
	try {
	service.deleteBooking(booking_id);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
	
	@GetMapping("{booking_id}")
	public Booking findBooking(@PathVariable("booking_id") int booking_id)
	{
			return service.findBookingById(booking_id);
	}
}
