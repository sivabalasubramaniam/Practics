package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static WebDriver driver;
	
	public static void getDriver(){

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\PracticeProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	public static void implicit() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://google.com/");

		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		driver.navigate().to("http://gmail.com/");
		
	}

	public static void explicitMethod() {
		
		driver.get("http://google.com/");
		
		WebElement txtBox = driver.findElement(By.name("q"));

		WebDriverWait wait1 = new WebDriverWait(driver, 15);
//		wait1.until(ExpectedConditions.visibilityOf(txtBox));
		
		txtBox.sendKeys("Test Text");
	
	}
	
	public static void fluentWaitMethod() {

		driver.get("http://google.com/");
		
		@SuppressWarnings({ "deprecation", "unused" })
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Exception.class);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		getDriver();
//		implicit();
		explicitMethod();
	}
	
}
