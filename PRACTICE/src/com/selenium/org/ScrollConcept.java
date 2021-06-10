package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollConcept {
	
	public static WebDriver driver;
	
	public static void driver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.amazon.com/");
	
	}

	public static void scrollUpDown() throws InterruptedException {
		
		WebElement bottomImg = driver.findElement(By.xpath("//img[@src='https://images.dmca.com/Badges/dmca-badge-w100-2x1-02.png?ID=3207c6fe-72f8-49ae-8178-c2d27538c377']"));
		WebElement topImg = driver.findElement(By.id("client-logo"));
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", bottomImg);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", topImg);
		
	}
	
	public static void scrollAmazon() throws InterruptedException {

		WebElement bImg = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		WebElement tImg = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", bImg);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", tImg);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		driver();
//		scrollUpDown();
		scrollAmazon();
	}
}