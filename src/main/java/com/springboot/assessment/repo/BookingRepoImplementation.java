package com.springboot.assessment.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.assessment.model.Booking;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BookingRepoImplementation implements BookingRepo
{
	EntityManager manager;
	public BookingRepoImplementation(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void save(Booking booking) 
	{
		manager.persist(booking);
	}

	@Override
	public List<Booking> findAllBookings() 
	{
		String str = "From Booking";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void update(Booking booking) 
	{
		manager.merge(booking);	
	}

	@Override
	public void deleteById(int booking_id) 
	{
		Booking boo = manager.find(Booking.class, booking_id);
		manager.remove(boo);
	}

	@Override
	public Booking findById(int booking_id) 
	{
		return manager.find(Booking.class, booking_id);
	}
}
