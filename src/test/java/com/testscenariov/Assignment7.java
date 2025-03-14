package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver Driver;
		
		Driver = new ChromeDriver();
		
		Driver.get("https://practice.automationtesting.in/my-account/");
		Driver.findElement(By.className("fc-button-label")).click();
		
		Driver.manage().window().maximize();
		
		Thread.sleep(5000);
		Driver.findElement(By.id("req_email")).sendKeys("jdhfijeif");
		Thread.sleep(5000);
		Driver.findElement(By.id("reg_password")).sendKeys("hjhdfgdgiu223");
		Driver.findElement(By.xpath("/html/body")).click();
		
	}

}
