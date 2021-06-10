package com.selenium.concepts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static WebDriver driver;
	
	public static int s_firstColumnNumber;
	public static int s_nameNum;
	public static int s_secondColumnNumber;
	public static String reqfield1;
	public static String reqfield2;
	public static String reqfield3;
	public static int m_firstColumnNumber;
	public static int m_secondColumnNumber;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumProjectTask\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
	}

	public static void allData() {

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));

		for (int i = 1; i <= row.size(); i++) {

			List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td"));

			for (int j = 0; j < column.size(); j++) {

				String detail = column.get(j).getText();
				System.out.println(detail);

			}
		}
	}

	public static void scaning() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the field to lookup");
		String reqfielda = sc.nextLine();

		System.out.println("Enter the field required against lookup");
		String reqfieldb = sc.nextLine();

		reqfield1 = reqfielda;
		reqfield2 = reqfieldb;
	}

	public static void singleData() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value");
		String reqfieldc = sc.nextLine();

		reqfield3 = reqfieldc;

		List<WebElement> head = driver.findElements(By.xpath("//table/thead/tr/th"));

		for (int i = 0; i < head.size(); i++) {

			if (head.get(i).getText().equals(reqfield1)) {

				s_firstColumnNumber = i + 1;
				System.out.println("Column1 Number is : " + s_firstColumnNumber);
			
			}
		}

		for (int i = 0; i < head.size(); i++) {

			if (head.get(i).getText().equals(reqfield2)) {

				s_secondColumnNumber = i + 1;
				System.out.println("Column2 Number is : " + s_secondColumnNumber);
			
			}
		}

		List<WebElement> coumnnList1 = driver.findElements(By.xpath("//table/tbody/tr/td[" + s_firstColumnNumber + "]"));

		for (int i = 0; i < coumnnList1.size(); i++) {

			if (coumnnList1.get(i).getText().equals(reqfield3)) {
				s_nameNum = i + 1;
				System.out.println("Sl.No in Table is : " + s_nameNum);
			
			}

		}

		WebElement nameOfTheEmployee = driver
				.findElement(By.xpath("//table/tbody/tr[" + s_nameNum + "]/td[" + s_firstColumnNumber + "]"));

		WebElement salaryOfTheEmployee = driver
				.findElement(By.xpath("//table/tbody/tr[" + s_nameNum + "]/td[" + s_secondColumnNumber + "]"));

		System.out.println("Name : " + nameOfTheEmployee.getText());

		System.out.println("Salary : " + salaryOfTheEmployee.getText());

	}

	public static void multiData() {

		List<WebElement> headList = driver.findElements(By.xpath("//table/thead/tr/th"));

		for (int i = 0; i < headList.size(); i++) {
		
			if (headList.get(i).getText().equals(reqfield1)) {
			
				m_firstColumnNumber = i + 1;
				System.out.println("Column1 Number is : " + m_firstColumnNumber);

			}
		}
		
		for (int j = 0; j < headList.size(); j++) {
		
			if (headList.get(j).getText().equals(reqfield2)) {
			
				m_secondColumnNumber = j + 1;
				System.out.println("Column2 Number is : " + m_secondColumnNumber);

			}
		}

		List<WebElement> m_columnList1 = driver
				.findElements(By.xpath("//table/tbody/tr/td[" + m_firstColumnNumber + "]"));

		List<WebElement> m_columnList2 = driver
				.findElements(By.xpath("//table/tbody/tr/td[" + m_secondColumnNumber + "]"));

		for (int i = 0; i < m_columnList1.size(); i++) {
		
			System.out.println(m_columnList1.get(i).getText() + "----" + m_columnList2.get(i).getText());
	
		}

	}

	public static void main(String[] args) {
		getDriver();
//		allData();
		scaning();
		singleData();
//		multiData();
	}
}
