package com.travelforce.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewProperty {

	public static WebDriver driver=null;
	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		
		NewProperty p1= new NewProperty();
		p1.login(driver);
		p1.newProperty(driver);
		
		driver.close();
		driver.quit();
	}


	
	
	public void login(WebDriver d1) {
		d1.get("http://extranetlite.techmaster.in");
		d1.manage().window().maximize();
		d1.findElement(By.id("Username")).sendKeys("tbomena");
		d1.findElement(By.id("Password")).sendKeys("tbm@123");
		d1.findElement(By.xpath("html/body/main/form/div/div[2]/div[2]/div/div/div[3]/button")).click();
	}
		
	
	public void newProperty(WebDriver d2) throws AWTException {
		Robot robot= new Robot();
		d2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d2.findElement(By.className("headlink")).click();		
		Select chain=new Select( d2.findElement(By.id("ChainId")));
		chain.selectByVisibleText("AKHILESH");
		Select propertyType=new Select(d2.findElement(By.id("PropertyType")));
		propertyType.selectByVisibleText("Hotel");
		
		Select star=new Select(d2.findElement(By.id("StarRating")));
		star.selectByIndex(5);
		d2.findElement(By.id("Location")).sendKeys("Delhi");
		d2.findElement(By.id("PropertyName")).sendKeys("Selenium Hotel");
		d2.findElement(By.id("lnkHotelImages")).click();
		d2.findElement(By.name("propertyImages_MainImage")).click();
		StringSelection StringSelection= new StringSelection("E:\\test.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StringSelection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.setAutoDelay(1000);
		
		d2.findElement(By.id("btnHotelImagesDone")).click();
	d2.findElement(By.id("Country")).sendKeys("India");
//		robot.setAutoDelay(1000);
//		

		List<WebElement> OptionList = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li"));
	    if(OptionList.size()>=1){
	        for(int i=0;i<OptionList.size();i++)
	        {
	            String CurrentOption = OptionList.get(i).getText();
	            if(CurrentOption.equalsIgnoreCase("India")){
	                
	                OptionList.get(i).click();
	            }
	        }
	    }
		
		
		
		
		
		
	   robot.setAutoDelay(1000);
		
	d2.findElement(By.id("City")).sendKeys("Delhi");
		
//		List<WebElement> OptionList2 = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li"));
//	    if(OptionList2.size()>=1){
//	        for(int i=0;i<OptionList2.size();i++)
//	        {
//            String CurrentOption2 = OptionList2.get(i).getText();
//	            if(CurrentOption2.equalsIgnoreCase("Delhi")){
//	                
//	                OptionList2.get(i).click();
//	            }
//        }
//	    }
		
		
	    
		d2.findElement(By.id("AddressLine1")).sendKeys("Vasant Kunj");
		d2.findElement(By.id("Pin")).sendKeys("110070");
		d2.findElement(By.id("Phone")).sendKeys("9999999999");
		d2.findElement(By.id("Fax")).sendKeys("7878787878");
		
		robot.setAutoDelay(1000);
		d2.findElement(By.id("lnkPropertyNotification")).click();
		//d2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//d2.switchTo().activeElement();
		
		d2.findElement(By.id("PropertyNotificationEmails_0__EmailTitle")).sendKeys("ALL");
		d2.findElement(By.id("PropertyNotificationEmails_0__EmailId")).sendKeys("akhileshk@techmaster.in");
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendBookingNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendCancelBookingNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendOnRequestBookingNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendOnRequestConfirmNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendOnRequestRejectNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendAllocationExhaustNotification")).click();
		d2.findElement(By.id("PropertyNotificationEmails_0__IsSendHotelApprovalNotification")).click();
		robot.setAutoDelay(1000);
		d2.findElement(By.id("btnPropertyNotificationDone")).click();
		
		d2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		d2.findElement(By.id("Description")).sendKeys("This is automation Test property");
		d2.findElement(By.id("MarkUp")).sendKeys("10");
		
		d2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//d2.findElement(By.id("submitButton")).click();
		
		robot.setAutoDelay(5000);
	
	}
	
}
