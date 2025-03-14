package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_Test_1 {
@Test

public void f() throws Exception {
	
	WebDriver driver;
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();

	

}
}
