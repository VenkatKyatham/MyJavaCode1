package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10 {

	public static void main(String[] args) throws Exception {
		
		WebDriver  driver;
		
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"))).selectByVisibleText("Boston");
		
		new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"))).selectByVisibleText("London");

	}

}
