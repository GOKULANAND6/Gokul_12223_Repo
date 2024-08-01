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

import com.springboot.assessment.model.Signup;
import com.springboot.assessment.service.SignupServiceImplementation;

@RestController
@RequestMapping("/signup")
@CrossOrigin("*")
public class SignupController 
{
	SignupServiceImplementation service;

	public SignupController(SignupServiceImplementation service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public  String insertUser(@RequestBody Signup signup)
	{
	String msg = "";
	try {
	service.addUser(signup);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Signup> readAllUsers()
	{
	return service.getallUsers();
	}

	@PutMapping
	public  String updateUser(@RequestBody Signup signup)
	{
	String msg = "";
	try {
	service.updateUser(signup);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{signup_id}")
	public String deleteUserbyId(@PathVariable("signup_id") int signup_id)
	{
	String msg = "";
	try {
	service.deleteUser(signup_id);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
	
	@GetMapping("{signup_id}")
	public String findUser(@PathVariable("signup_id") int signup_id)
	{
		String msg = "";
		try {
			service.findUserById(signup_id);
			msg = "Record Found";
		}
		catch (Exception e) {
			msg = "Record not Found";
		}
		return msg;
	}
}
