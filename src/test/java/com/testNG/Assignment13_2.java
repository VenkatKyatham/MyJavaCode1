package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment13_2 {

	@Test
	
	public void f() throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		// driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a")).click();
		
	//	driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.quit();
			
	} 
		
		

	}


