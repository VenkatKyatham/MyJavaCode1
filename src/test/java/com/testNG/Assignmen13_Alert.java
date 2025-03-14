package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignmen13_Alert {
	@Test
	public void f() throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		
	}


}
