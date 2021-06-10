package com.selenium.concepts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

		public static WebDriver driver;
	
		public static void driver() {
			System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProjectTask\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.katalon.com/resources-center/blog/comparison-automated-testing-tools/");
		}
	
	public static void particularData() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int t = sc.nextInt();
		System.out.println("Enter the row");
		int r = sc.nextInt();
		System.out.println("Enter the column");
		int c = sc.nextInt();

		WebElement indData = driver.findElement(By.xpath("//table[" + t + "]/tbody/tr[" + r + "]/td[" + c + "]"));
		System.out.println(indData.getText());

	}

	public static void entireRow() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int t = sc.nextInt();
		System.out.println("Enter the row");
		int r = sc.nextInt();

		List<WebElement> row = driver.findElements(By.xpath("//table[" + t + "]/tbody/tr[" + (r) + "]/td"));
		for (WebElement word : row) {
			System.out.println(word.getText());
		}
	}

	public static void entireColumn() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int t = sc.nextInt();
		System.out.println("Enter the column");
		int c = sc.nextInt();

		List<WebElement> column = driver.findElements(By.xpath("//table[" + (t) + "]/tbody/tr/td[" + (c) + "]"));
		for (WebElement word : column) {
			System.out.println(word.getText());
		}

	}

	public static void allData() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int t = sc.nextInt();

		List<WebElement> entiretable = driver.findElements(By.xpath("//table[" + (t) + "]/tbody/tr/td"));
		for (WebElement individuals : entiretable) {
			System.out.println(individuals.getText());
		}

	}

	public static void main(String[] args) {

		driver();
		particularData();
		// entireRow();
		// entireColumn();
		// allData();
	}
	
	
}
