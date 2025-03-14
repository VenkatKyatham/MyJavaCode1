package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

//		driver = new ChromeDriver();
//		driver.get("https://collegeweeklive.com/go-signup/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//*[@id=\"register\"]/div[9]/div/div/div/label/a[1]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-15634\"]/a")).click();

//			driver = new ChromeDriver();
//			driver.get("https://phptravels.com/demo/");
//			driver.manage().window().maximize();
//			Thread.sleep(5000);
//			
//			driver.findElement(By.linkText("About Us")).click();

		driver = new ChromeDriver();
		driver.get("https://autotestdata.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Need Help?")).click();

	}

}
