package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	}

	public static void simpleAlert() throws InterruptedException {

		WebElement simpleButton = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));

		simpleButton.click();
		Thread.sleep(2000);

		WebElement alertButton1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

		alertButton1.click();
		Thread.sleep(2000);

		Alert alertSimple = driver.switchTo().alert();
		alertSimple.accept();
	}

	public static void confirmAlert() throws InterruptedException {

		WebElement confirmButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));

		confirmButton.click();
		Thread.sleep(2000);

		WebElement alertButton2 = driver
				.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));

		alertButton2.click();
		Thread.sleep(2000);

		Alert alertConfirm = driver.switchTo().alert();

		alertConfirm.dismiss();
	}

	public static void promptAlert() throws InterruptedException {

		WebElement promptButton = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));

		promptButton.click();
		Thread.sleep(2000);

		WebElement alertButton3 = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));

		alertButton3.click();

		Alert promptAlert = driver.switchTo().alert();

		promptAlert.sendKeys("prompt alert text");
		Thread.sleep(2000);

		promptAlert.accept();

	}

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		// simpleAlert();
		// confirmAlert();
		promptAlert();
	}
}
