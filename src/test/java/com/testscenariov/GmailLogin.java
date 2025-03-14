package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		//Create an object for WebDriver interface
		WebDriver driver;
		// Launch Chrome browser
		driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Testing123");
		driver.findElement(By.name("pass")).sendKeys("dgehetb");
		driver.findElement(By.name("login")).click();

	}

}
