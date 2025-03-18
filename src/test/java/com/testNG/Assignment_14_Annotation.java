package com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment_14_Annotation{
	WebDriver Driver;
	@BeforeClass
	public void beforeClass() {
		
		Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();

	}

	@Test
	public void f() throws Exception {
		Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		Driver.findElement(By.className("oxd-userdropdown-name")).click();
		Driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]")).click();
		Driver.quit();
	}

}
