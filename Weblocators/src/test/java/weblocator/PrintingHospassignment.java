package weblocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintingHospassignment {
	WebDriver chromedriver;

	@Test
	public void PrintHospNames() throws InterruptedException {			
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://westbengal.covidsafe.in/");
		chromedriver.manage().window().maximize();
		
		int numberOfhosp = chromedriver.findElements(By.xpath("//tbody/tr")).size();
		
		for(int i=1; i<=numberOfhosp;i++) {
			
			//To print the hospital names in the first page of the website
			WebElement hospNameEleAll = chromedriver.findElement(By.xpath("//tr["+i+"]//strong"));
			String hospNames = hospNameEleAll.getText();
			System.out.println("Name of the hospitals are : "+hospNames);
			
			//To print the hospital names without oxygen
			WebElement WithoutOxygenEle = chromedriver.findElement(By.xpath("//tr["+i+"]/td[2]//span"));
			String WithoutOxygen = WithoutOxygenEle.getText();
			System.out.println("Number of Beds Without Oxygen : "+WithoutOxygen);
			
			//To print the hospital names with oxygen
			WebElement WithOxygenEle = chromedriver.findElement(By.xpath("//tr["+i+"]/td[3]//span"));
			String WithOxygen = WithOxygenEle.getText();
			System.out.println("Number of Beds Without Oxygen : "+WithOxygen);
		
			//To print the hospital names without ICU Ventilator
			WebElement ICUwithoutVenEle = chromedriver.findElement(By.xpath("//tr["+i+"]/td[4]//span"));
			String ICUwithoutVen = ICUwithoutVenEle.getText();
			System.out.println("Number of Beds Without ICU Ventilator : "+ICUwithoutVen);
			
			//To print the hospital names with ICU Ventilator
			WebElement ICUwithVenEle = chromedriver.findElement(By.xpath("//tr["+i+"]/td[5]//span"));
			String ICUwithVen = ICUwithVenEle.getText();
			System.out.println("Number of Beds With ICU Ventilator : "+ICUwithVen);
			
			int j= i+1;
			
			chromedriver.findElement(By.xpath("//tr["+i+"]//strong")).click();  
			
			JavascriptExecutor js = (JavascriptExecutor) chromedriver;
  
			Thread.sleep(1000);
			
			WebElement PhoneEle = chromedriver.findElement(By.xpath("//tr["+j+"]/td/p[2]/span"));
			String Phone = PhoneEle.getText();
			System.out.println("Hospital "+Phone);
			
			WebElement PinCodeEle = chromedriver.findElement(By.xpath("//tr["+j+"]/td/p[3]//span"));
			String PinCode = PinCodeEle.getText();
			System.out.println("Hospital " +PinCode);
			js.executeScript("arguments[0].scrollIntoView();", PinCodeEle);
			
			WebElement AddressEle = chromedriver.findElement(By.xpath("//tr["+j+"]/td/p[4]//span"));
			String Address = AddressEle.getText();
			System.out.println("Hospital "+Address);
	
			chromedriver.findElement(By.xpath("//tr["+i+"]//strong")).click();
	    
			if (i==numberOfhosp)
			{
				chromedriver.findElement(By.xpath("//button[contains(text(),'Load next 20')]")).click();
				int numberOfhospload = chromedriver.findElements(By.xpath("//tbody/tr")).size();
				numberOfhosp = numberOfhospload;
			}
			//scroll down to the hospital name element
			js.executeScript("arguments[0].scrollIntoView();", hospNameEleAll);
		
		}
			
		}
}
	

	
	