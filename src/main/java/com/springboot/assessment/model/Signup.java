package com.springboot.assessment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "signup")
public class Signup 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "Id")
	private int signup_id;
	@Column( name = "Name")
	private String signup_name;
	@Column( name = "Email")
	private String signup_email;
	@Column( name = "Password")
	private String signup_password;
	
	public Signup() 
	{
		super();
	}

	public Signup(int signup_id, String signup_name, String signup_email, String signup_password) {
		super();
		this.signup_id = signup_id;
		this.signup_name = signup_name;
		this.signup_email = signup_email;
		this.signup_password = signup_password;
	}

	public int getSignup_id() {
		return signup_id;
	}

	public void setSignup_id(int signup_id) {
		this.signup_id = signup_id;
	}

	public String getSignup_name() {
		return signup_name;
	}

	public void setSignup_name(String signup_name) {
		this.signup_name = signup_name;
	}

	public String getSignup_email() {
		return signup_email;
	}

	public void setSignup_email(String signup_email) {
		this.signup_email = signup_email;
	}

	public String getSignup_password() {
		return signup_password;
	}

	public void setSignup_password(String signup_password) {
		this.signup_password = signup_password;
	}

	@Override
	public String toString() {
		return "Signup [signup_id=" + signup_id + ", signup_name=" + signup_name + ", signup_email=" + signup_email
				+ ", signup_password=" + signup_password + "]";
	}
}
