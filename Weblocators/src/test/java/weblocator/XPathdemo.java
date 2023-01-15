package weblocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class XPathdemo {
	WebDriver chromedriver;

	@Test
	public void AbsoluteXpath() {
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://cosmocode.io/automation-practice/");
		chromedriver.manage().window().maximize();
		
		//To click on the menu option 'Selenium Tutorials'
		WebElement sel = (WebElement) chromedriver.findElement(By.xpath("//*[text(),'Selenium Tutorials']"));
		sel.click();
		
		//To hover over the menu option 'Selenium Tutorials'
		/*//Creating object of an Actions class
		Actions action = new Actions(chromedriver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(sel).perform();*/
}
	@Test
		public void RelativeXpath() {
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://cosmocode.io/automation-practice/");
		chromedriver.manage().window().maximize();
		
		WebElement elementOpen = chromedriver.findElement(By.linkText("JavaScript Tutorials"));

		//To click on the menu option 'Javascript Tutorials'
				elementOpen.click();
	}
	@Test
	public void RelativeXpath1() {
	System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");

	chromedriver = new ChromeDriver();
	
	chromedriver.get("https://cosmocode.io/automation-practice/");
	chromedriver.manage().window().maximize();
	
	WebElement elementOpen = chromedriver.findElement(By.xpath("//*[contains(@href,'https://cosmocode.io/about-us/')]"));
	//WebElement elementOpen = chromedriver.findElement(By.xpath("//*[containscontains(text(),'About Us')]"));

	//To click on the menu option 'About Us'
			elementOpen.click();
}

}


