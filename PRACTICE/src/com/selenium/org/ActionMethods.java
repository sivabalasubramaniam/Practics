package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {

	public static WebDriver driver;

	public static void getDriver(){

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\PracticeProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void bankSite() throws InterruptedException {
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		WebElement vdoDismiss = driver.findElement(By.id("closeBtn"));
		vdoDismiss.click();
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();  
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		
		WebElement account1 = driver.findElement(By.id("credit2"));
		WebElement trgt1 = driver.findElement(By.id("bank"));
		ac.dragAndDrop(account1, trgt1).build().perform();

		WebElement amount1 = driver.findElement(By.id("fourth"));
		WebElement trgt2 = driver.findElement(By.id("amt7"));
		ac.dragAndDrop(amount1, trgt2).build().perform();
		
		WebElement account3 = driver.findElement(By.id("credit1"));
		WebElement trgt3 = driver.findElement(By.id("loan"));
		ac.dragAndDrop(account3, trgt3).build().perform();
		
		WebElement amount2 = driver.findElement(By.id("fourth"));
		WebElement trgt4 = driver.findElement(By.id("amt8"));
		ac.dragAndDrop(amount2, trgt4).build().perform();

	}
	
	public static void contextClick() {
		
		driver.get("https://www.amazon.com/");
		
		Actions ac = new Actions(driver);
		
		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(todayDeal).build().perform();
		
	}
	
	public static void moveToElementMethod() {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		Actions ac = new Actions(driver);

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		ac.moveToElement(dress).build().perform();

		WebElement evgDress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		evgDress.click();

	}
	
	public static void main(String[] args) throws InterruptedException {
	
		getDriver();
		
		bankSite();
		contextClick();
		moveToElementMethod();
		
	}
}
