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

import com.springboot.assessment.model.Customer;
import com.springboot.assessment.service.CustomerServiceImplementation;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController 
{
	CustomerServiceImplementation service;

	public CustomerController(CustomerServiceImplementation service) {
		super();
		this.service = service;
	}

	@PostMapping
	public  String insertCustomer(@RequestBody Customer customer)
	{
	String msg = "";
	try {
	service.addCustomer(customer);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Customer> readAllCustomers()
	{
	return service.getallCustomers();
	}

	@PutMapping
	public  String updateCustomer(@RequestBody Customer customer)
	{
	String msg = "";
	try {
	service.updateCustomer(customer);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{cus_id}")
	public String deleteCustomerbyId(@PathVariable("cus_id") int cus_id)
	{
	String msg = "";
	try {
	service.deleteCustomer(cus_id);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
	
	@GetMapping("{cus_id}")
	public String findCustomer(@PathVariable("cus_id") int cus_id)
	{
		String msg = "";
		try {
			service.findCustomerById(cus_id);
			msg = "Record Found";
		}
		catch (Exception e) {
			msg = "Record not Found";
		}
		return msg;
	}
}
