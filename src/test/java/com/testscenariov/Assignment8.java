package com.testscenariov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.className("fc-button-label")).click();
		Thread.sleep(5000);
		driver.findElement(By.tagName("text")).sendKeys("hdifu778");
		driver.findElement(By.tagName("text")).sendKeys("jsdyjuifu778");
		driver.findElement(By.tagName("email")).sendKeys("hdhfg767");
		driver.findElement(By.tagName("tel")).sendKeys("hdhfguhd34");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox1")).click();
		

		
		
		
		
		
		

	}

}
