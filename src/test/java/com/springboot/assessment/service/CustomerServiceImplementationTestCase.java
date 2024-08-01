package com.springboot.assessment.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CustomerServiceImplementationTestCase 
{
	WebDriver driver;

	@BeforeEach
	void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterEach
	void closeConnection()
	{
		driver.close();
	}


	@Test
	void testAddCustomer() 
	{
		driver.get("http://localhost:3000/homepage2");
		driver.findElement(By.id("bookappointment")).click();
		driver.findElement(By.name("cus_name")).sendKeys("Aarthi");
		driver.findElement(By.name("cus_gender")).sendKeys("Female");
		driver.findElement(By.name("cus_mobile")).sendKeys("78945632103");
		driver.findElement(By.name("cus_time")).sendKeys("5PM");
		driver.findElement(By.name("cus_priority")).sendKeys("LOW");
		driver.findElement(By.id("selectId")).sendKeys("2");
		driver.findElement(By.id("submit")).submit();
	}

	@Test
	void testGetallCustomers() 
	{
		driver.get("http://localhost:3000");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("loginemail")).sendKeys("prabha123@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("prabha@123");
	
	}

}
