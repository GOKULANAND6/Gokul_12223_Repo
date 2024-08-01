package com.springboot.assessment.repo;

import java.util.List;

import com.springboot.assessment.model.Customer;

public interface CustomerRepo 
{
	public void save(Customer customer);

	public List<Customer> findAllCustomers();

	public void update(Customer customer);

	public void deleteById(int cus_id);
	
	public Customer findById(int cus_id);
}
