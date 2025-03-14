package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12_3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		driver = new ChromeDriver();
//		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
//		
//		
//		Thread.sleep(5000);
//		
//		//isenabled or not
//		if (driver.findElement(By.id("account-management-sign-up")).isEnabled()) {
//			System.out.println("Element is Enabled");
//		} else {
//			System.out.println("Element is Disabled");
//		}
//		
//		//isDisplayed
//		driver.get("https://practice.automationtesting.in/my-account/");
//		driver.findElement(By.className("fc-button-label")).click();
		
		// Type invalid test credentials
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.className("fc-button-label")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(By.name("password")).sendKeys("seenu4selenium@123");

		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
		// Validate whether given locator is displayed on the current page?

//		if (driver.findElement(By.linkText("Automation")).isDisplayed()) {
//			System.out.println("Element is displayed");
//		} else {
//			System.out.println("Not in the current page");
//		}
		// instead of isDisplayed (100% locater should be present, use size method and findElements
		// Size(): Returns the number of elements in this list/page.
		// if the given locator has present on screen, the size of object size=1
		// given locator has NOT present on screen, the size of object size = 0
		if (driver.findElements(By.linkText("Automation")).size()>0) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Not in the current page");
		}

	}

}
