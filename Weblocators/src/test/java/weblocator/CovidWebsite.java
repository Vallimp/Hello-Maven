package weblocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CovidWebsite {
	WebDriver chromedriver;
	
	@Test 
	public void PrintHospName() {
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://westbengal.covidsafe.in/");
		chromedriver.manage().window().maximize();
		
		//To print the first hospital name in the list
		WebElement hospNameEle = chromedriver.findElement(By.xpath("//tr[1]//strong"));
		String hospName = hospNameEle.getText();

		System.out.println("Name of the first hospital is : "+hospName);

	}
	
	@Test
	public void PrintHospNames() {
	//	System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://westbengal.covidsafe.in/");
		chromedriver.manage().window().maximize();
		
		int numberOfhosp = chromedriver.findElements(By.xpath("//tbody/tr")).size();
		
		for(int i=1; i<=numberOfhosp;i++) {
			
			//To print the hospital names in the first page of the website
			WebElement hospNameEleAll = chromedriver.findElement(By.xpath("//tr["+i+"]//strong"));
			
			String hospNames = hospNameEleAll.getText();
			
			System.out.println("Name of the hospitals are : "+hospNames);
		}
		
		
		//WebElement LoadNextsetOfHosps = chromedriver.findElement(By.xpath("//button[contains(@text,'Load next 20']"));
		/*WebElement LoadNextsetOfHosps = chromedriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		LoadNextsetOfHosps.click();
		
		System.out.println("Load next 20 button is clicked");
		

			for(int i=21; i<=numberOfhosp;i++) {
			
			//To print the hospital names in the first page of the website
			WebElement hospNameEleAll = chromedriver.findElement(By.xpath("//tr["+i+"]//strong"));
			
			String hospNames = hospNameEleAll.getText();
			
			System.out.println("Name of the hospitals are : "+hospNames);
		}*/
		
	}
}
