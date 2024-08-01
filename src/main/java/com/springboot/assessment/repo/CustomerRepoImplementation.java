package com.springboot.assessment.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.assessment.model.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepoImplementation implements CustomerRepo
{
	EntityManager manager;

	public CustomerRepoImplementation(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void save(Customer customer) 
	{
		manager.persist(customer);
	}

	@Override
	public List<Customer> findAllCustomers() 
	{
		String str = "From Customer";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void update(Customer customer) 
	{
		manager.merge(customer);
	}

	@Override
	public void deleteById(int cus_id) 
	{
		Customer cus = manager.find(Customer.class, cus_id);
		manager.remove(cus);
	}

	@Override
	public Customer findById(int cus_id) 
	{
		return manager.find(Customer.class, cus_id);
	}
}
