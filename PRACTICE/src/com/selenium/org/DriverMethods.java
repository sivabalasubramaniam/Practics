package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void drivers() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.close();

/*		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

		driver.quit();
		*/
	}

	public static void manage() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
	}

	public static void navigate() {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.get("https://www.gmail.com/");

		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

	public static void main(String[] args) {

		drivers();
		manage();
		navigate();
	}

}
