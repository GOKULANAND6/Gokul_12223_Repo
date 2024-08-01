package com.springboot.assessment.repo;

import java.util.List;
import com.springboot.assessment.model.Signup;

public interface SignupRepo 
{
	public void save(Signup signup);

	public List<Signup> findAllUsers();

	public void update(Signup signup);

	public void deleteById(int signup_id);
	
	public Signup findById(int signup_id);
}
