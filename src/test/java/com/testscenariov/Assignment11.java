package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) throws Exception {
		WebDriver  driver;
		
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("submit")).click();
		
		//Get the Error message Text using getText()
		
	String errormsg = driver.findElement(By.id("firstNameError")).getText();
	String errormsg2 = driver.findElement(By.id("lastNameError")).getText();
	String errormsg3 = driver.findElement(By.id("emailAddressError")).getText();
	String errormsg4 = driver.findElement(By.id("phoneNumberError")).getText();
	String errormsg5 = driver.findElement(By.id("passwordError")).getText();
	String errormsg6 = driver.findElement(By.id("ConfirmPasswordError")).getText();
	String errormsg7 = driver.findElement(By.id("nationalityError")).getText();
	String errormsg8 = driver.findElement(By.id("attendeeTypeError")).getText();
	String errormsg9 = driver.findElement(By.id("questions_137Error")).getText();
	
	
	
	System.out.println(errormsg);
	System.out.println(errormsg2);
	System.out.println(errormsg3);
	System.out.println(errormsg4);
	System.out.println(errormsg5);
	System.out.println(errormsg6);
	System.out.println(errormsg7);
	System.out.println(errormsg8);
	System.out.println(errormsg9);

	}

}
