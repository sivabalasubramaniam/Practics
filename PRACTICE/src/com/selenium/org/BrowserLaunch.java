package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void chromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	public static void iEBrowser() {

		System.setProperty("webdriver.ie.driver", "F:\\Java\\SeleniumProject\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}
	
	public static void fireFox() {

		System.setProperty("webdriver.gecko.driver", "F:\\Java\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

	public static void main(String[] args) throws InterruptedException {
		
	//	chromeBrowser();
	//	iEBrowser();
		fireFox();
		
	}
}
