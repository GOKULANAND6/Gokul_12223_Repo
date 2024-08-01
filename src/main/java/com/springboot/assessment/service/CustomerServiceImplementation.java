package com.springboot.assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.assessment.model.Customer;
import com.springboot.assessment.repo.CustomerRepo;

@Service
public class CustomerServiceImplementation implements CustomerService
{
	CustomerRepo repo;

	public CustomerServiceImplementation(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCustomer(Customer customer) 
	{
		repo.save(customer);
		System.out.println("Customer service");
		return "AddSuccess";
	}

	@Override
	public List<Customer> getallCustomers() 
	{
		return repo.findAllCustomers();
	}

	@Override
	public String updateCustomer(Customer customer) 
	{
		repo.update(customer);
		return "UpdateSuccess";
	}

	@Override
	public String deleteCustomer(int cus_id) 
	{
		repo.deleteById(cus_id);
		return "DeleteSuccess";
	}

	@Override
	public Customer findCustomerById(int cus_id) 
	{
		Customer cus = repo.findById(cus_id);
		System.out.println(cus);
		return cus;
	}
}
