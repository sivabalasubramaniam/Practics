package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProjectTask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("abc@gmail.com");

		WebElement dis = driver.findElement(By.id("email"));
		System.out.println(dis.isDisplayed());

		WebElement isenbl = driver.findElement(By.id("u_0_7"));
		System.out.println(isenbl.isEnabled());
		
		WebElement slt = driver.findElement(By.id("u_0_7"));
		System.out.println(slt.isSelected());
		
		WebElement txt = driver.findElement(By.xpath("//span[text()='Create an account']"));
		System.out.println(txt.getText());

		WebElement att = driver.findElement(By.id("email"));
		System.out.println(att.getAttribute("id"));
		
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();

	}
}
