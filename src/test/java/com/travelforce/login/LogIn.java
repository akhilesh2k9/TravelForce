package com.travelforce.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogIn {

	//public static void main(String args[]) {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://extranetlite.techmaster.in");
//		driver.manage().window().maximize();
//		//driver.findElement(By.className("linkred")).click(); //LoginName
//		driver.findElement(By.id("Username")).sendKeys("tbomena");
//		driver.findElement(By.id("Password")).sendKeys("tbm@123");
//		driver.findElement(By.xpath("html/body/main/form/div/div[2]/div[2]/div/div/div[3]/button")).click();
//	}
	
	
	
	
	@Test
	public void validLogin() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://extranetlite.techmaster.in");
		driver.manage().window().maximize();
		//driver.findElement(By.className("linkred")).click(); //LoginName
		driver.findElement(By.id("Username")).sendKeys("tbomena");
		driver.findElement(By.id("Password")).sendKeys("tbm@123");
		driver.findElement(By.xpath("html/body/main/form/div/div[2]/div[2]/div/div/div[3]/button")).click();
	
	System.out.println("Valid Login Test Passsed.");
	}
		
	}

