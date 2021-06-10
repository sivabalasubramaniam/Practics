package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingConcept {

	public static WebDriver driver;

	public static void getDriver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\PracticeProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	public static void robotActionWin() throws AWTException, InterruptedException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void robotAccessWin() throws AWTException, InterruptedException {

		Actions ac = new Actions(driver);

		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(todayDeal).build().perform();
		robotActionWin();

		WebElement help = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(help).build().perform();
		robotActionWin();

		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(registry).build().perform();
		robotActionWin();

		WebElement giftCard = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(giftCard).build().perform();
		robotActionWin();

		WebElement sell = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		ac.contextClick(sell).build().perform();
		robotActionWin();

		WebElement yourAmazon = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		ac.contextClick(yourAmazon).build().perform();
		robotActionWin();
		
	}

	public static void switchingToWindow() {

		Set<String> allID = driver.getWindowHandles();

		for (String id : allID) {

			System.out.println(id);
			String titles = driver.switchTo().window(id).getTitle();
			System.out.println(titles);

		}

		String switchString = "Amazon Sign-In";

		for (String id : allID) {

			if (driver.switchTo().window(id).getTitle().equals(switchString)) {
				break;
			}
		}
	}

	public static void signin() {

		WebElement signInTxt = driver.findElement(By.id("ap_email"));
		signInTxt.sendKeys("aaa@gmail.com");
		driver.findElement(By.id("continue")).click();

	}

	public static void main(String[] args) throws AWTException, InterruptedException {

		getDriver();
		robotAccessWin();
		switchingToWindow();
//		signin();

	}
}
