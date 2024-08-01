package com.springboot.assessment.service;

import java.util.List;

import com.springboot.assessment.model.Customer;

public interface CustomerService 
{
	public String addCustomer(Customer customer);
	 
	public List<Customer> getallCustomers();

	public String updateCustomer(Customer customer);

	public String deleteCustomer(int cus_id);
	
	public Customer findCustomerById(int cus_id);
}
