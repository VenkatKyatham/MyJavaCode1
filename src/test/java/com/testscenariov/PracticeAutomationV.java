package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationV {

	public static void main(String[] args) {
		 WebDriver driver;
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://practice.automationtesting.in/my-account/");
		 driver.findElement(By.className("fc-button-label")).click();
		 
		 // Type invalid test credentials
		 
		 driver.findElement(By.name("username")).sendKeys("bdjhfjfkjdk");
		 driver.findElement(By.name("password")).sendKeys("fjg3466jhfjfkjdk");
		 
		 driver.findElement(By.name("login")).click();
		 

	}

}
