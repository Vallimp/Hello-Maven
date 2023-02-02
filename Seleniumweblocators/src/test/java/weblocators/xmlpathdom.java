package weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xmlpathdom {
	
	Webdriver chromedriver;
	
	@Test (priority=1)
	public void LaunchNumpyNinja() {
	System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
	chromedriver = new ChromeDriver();
	
	chromedriver.get("https://www.numpyninja.com/contact");
	
}

}

