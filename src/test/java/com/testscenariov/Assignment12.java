package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) throws Exception {
		WebDriver Driver;
		
		Driver = new ChromeDriver();
		Driver.get("https://us.megabus.com/account-management/login");
		Driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		
		Driver.findElement(By.xpath("/html/body/main/div/mb-app/mb-login-page/div/div/div/ul/li[2]/a")).click();
		
		// to Scroll down
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0]).scrollIntoView();", Driver.findElement(By.linkText("About Us")));
		
		Thread.sleep(2000);
		Driver.get("https://us.megabus.com/account-management/login");
		if (Driver.findElement(By.className("form-group")).isSelected()) {
			System.out.println("Element is selected");
		}else {
			System.out.println("Element is Not Selected");
		}
		
		System.out.println("*****************");
		
		Driver.get("https://us.megabus.com/account-management/login");
		if (Driver.findElement(By.xpath("//*[@id=\"signup\"]/mb-create-account/div/div/form/div[5]")).isSelected()) {
			System.out.println("CheckBox is selected");
		}else {
			System.out.println("CheckBox is Not Selected");
		}
		
		

	}

}
