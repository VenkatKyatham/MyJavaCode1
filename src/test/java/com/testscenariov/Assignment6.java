package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws Exception {
		
		WebDriver Driver;
		
		Driver = new ChromeDriver();
		
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Driver.findElement(By.name("username")).sendKeys("gjjski1462jhj");
		Driver.findElement(By.name("password")).sendKeys("hjhjkhkjn223");
		
		Driver.findElement(By.tagName("submit")).click();
		
		

	}

}
