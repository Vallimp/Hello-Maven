package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld 
{
	
	public static void main (String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
WebDriver chromedriver =new ChromeDriver(); // to launch the browser, import webdriver and chromedriver
chromedriver.get("https://amazon.com");

	}
}

