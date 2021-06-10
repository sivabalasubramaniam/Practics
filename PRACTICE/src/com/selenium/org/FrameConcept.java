package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static WebDriver driver;

	public static void driver() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	}

	public static void singleFrame() throws InterruptedException {

		WebElement sinleFrameButon = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		sinleFrameButon.click();

		WebDriver frame = driver.switchTo().frame("SingleFrame");

		WebElement textBox = frame.findElement(By.xpath("(//input[@type='text'])[1]"));
		textBox.sendKeys("Sample Text");
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
	}

	public static void nestedFrame() {

		WebElement button = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		button.click();

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);

		WebElement innrerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innrerFrame);

		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
		txtBox.sendKeys("Testing");

		driver.switchTo().defaultContent();

	}

	public static void main(String[] args) throws InterruptedException {

		driver();
		singleFrame();
		nestedFrame();

	}

}
