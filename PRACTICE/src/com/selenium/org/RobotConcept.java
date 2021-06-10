package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotConcept {

	public static WebDriver driver;

	public static void getDriver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\PracticeProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	public static void robotAction() throws AWTException, InterruptedException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}

	public static void robotAccess() throws AWTException, InterruptedException {

		Actions ac = new Actions(driver);

		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(todayDeal).build().perform();
		robotAction();

		WebElement help = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(help).build().perform();
		robotAction();

		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(registry).build().perform();
		robotAction();

		WebElement giftCard = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(giftCard).build().perform();
		robotAction();

		WebElement sell = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		ac.contextClick(sell).build().perform();
		robotAction();

		WebElement yourAmazon = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		ac.contextClick(yourAmazon).build().perform();
		robotAction();

	}

	public static void main(String[] args) throws AWTException, InterruptedException {

		getDriver();
		robotAccess();

	}
}
