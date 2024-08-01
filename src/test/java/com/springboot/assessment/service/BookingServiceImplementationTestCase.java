package com.springboot.assessment.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BookingServiceImplementationTestCase 
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
	void testAddBooking() 
	{
		driver.get("http://localhost:3000/insertbooking");
		driver.findElement(By.id("options")).sendKeys("Polishing");
		driver.findElement(By.id("price")).sendKeys("5000");
		driver.findElement(By.id("offers")).sendKeys("5% Discount");

		driver.findElement(By.id("submit")).submit();
	}

	@Test
	void testGetallBookings() 
	{
		driver.get("http://localhost:3000/homepage2");
		driver.findElement(By.id("viewservice")).click();
	}
}
