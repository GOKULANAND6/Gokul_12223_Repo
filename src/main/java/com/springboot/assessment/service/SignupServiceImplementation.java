package com.springboot.assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.assessment.model.Signup;
import com.springboot.assessment.repo.SignupRepo;

@Service
public class SignupServiceImplementation implements SignupService
{
	SignupRepo repo;
	public SignupServiceImplementation(SignupRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addUser(Signup signup) 
	{
		repo.save(signup);
	}

	@Override
	public List<Signup> getallUsers() 
	{
		return repo.findAllUsers();
	}

	@Override
	public void updateUser(Signup signup) 
	{
		repo.update(signup);
	}

	@Override
	public void deleteUser(int signup_id) 
	{
		repo.deleteById(signup_id);
	}

	@Override
	public Signup findUserById(int signup_id) 
	{
		return repo.findById(signup_id);
	}
}
