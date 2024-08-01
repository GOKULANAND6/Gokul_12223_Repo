package com.springboot.assessment.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.assessment.model.Signup;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SignupRepoImplementation implements SignupRepo
{
	EntityManager manager;
	public SignupRepoImplementation(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void save(Signup signup) 
	{
		manager.persist(signup);
	}

	@Override
	public List<Signup> findAllUsers() 
	{
		String str = "From Signup";
		Query query = manager.createQuery(str);
		return query.getResultList();
	}

	@Override
	public void update(Signup signup) 
	{
		manager.merge(signup);
	}

	@Override
	public void deleteById(int signup_id) 
	{
		Signup signup = manager.find(Signup.class, signup_id);
		manager.remove(signup);
	}

	@Override
	public Signup findById(int signup_id) 
	{
		return manager.find(Signup.class, signup_id);
	}
}
