package com.springboot.assessment.service;

import java.util.List;

import com.springboot.assessment.model.Signup;

public interface SignupService 
{
	public void addUser(Signup signup);
	 
	public List<Signup> getallUsers();

	public void updateUser(Signup signup);

	public void deleteUser(int signup_id);
	
	public Signup findUserById(int signup_id);
}
