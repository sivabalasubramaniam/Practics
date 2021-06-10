package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void screenShot() throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destfile = new File("F:\\Java\\SeleniumProject\\ScreenShot\\1.png");
		FileUtils.copyFile(source, destfile);

		System.out.println("ScreenShotTakenSuccessfully");

	}

	public static void main(String[] args) throws IOException {
		
		screenShot();
		
	}
}
