package weblocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PathFinder {
WebDriver chromedriver;

	@Test (priority=1)
	public void LaunchNumpyNinja() {		
System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
chromedriver =new ChromeDriver(); // to launch the browser, import webdriver and chromedriver

chromedriver.get("https://numpyninja.com/contact");

	}
	
	@DataProvider 
	public Object[][] dataforcontact(){

		String contact[][]= {
				{"Pushpa", "Valli","valli@jgd","9866038"},
				{"java", "session","java@pgfs","9704072"},
				{"selenium","recording","selenium@lmno","995910181"},
		};
		return contact;
	}
	
	@Test (priority=2, dataProvider = "dataforcontact")
public void enterContactDetails(String frstName, String LastName, String mail, String phone) {
		WebElement frstNameEle = chromedriver.findElement(By.name("first-name")); //location of the first element
		WebElement LastNameEle = chromedriver.findElement(By.name("last-name"));
		WebElement emailEle = chromedriver.findElement(By.name("email"));
		WebElement mobileEle = chromedriver.findElement(By.name("phone"));
		
		frstNameEle.clear(); //action after location
		frstNameEle.sendKeys(frstName);
		LastNameEle.clear();
		LastNameEle.sendKeys(LastName);
		emailEle.clear();
		emailEle.sendKeys(mail);
		mobileEle.clear();
		mobileEle.sendKeys(phone);
	}
	
	@Test (priority=3)
public void submitEnquiry() {
		WebElement sendbtnEle = chromedriver.findElement(By.className("_1fbEI"));
		sendbtnEle.click();
		
	}
	
	@Test (priority = 4)
	public void launchCosmocode() {
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://cosmocode.io/automation-practice/");
	
	}
	
	@Test (priority=5)
	public void EnterDetails() {
		chromedriver.manage().window().maximize();
		
		chromedriver.findElement(By.id("firstname")).sendKeys("Valli");
		chromedriver.findElement(By.className("lastname")).sendKeys("Jangam");	
		chromedriver.findElement(By.name("gender")).click();
		chromedriver.findElement(By.name("language_java")).click();
		chromedriver.findElement(By.name("language_python")).click();
		
		chromedriver.findElement(By.linkText("Click here to reload this page")).click();
		
		chromedriver.findElement(By.partialLinkText("change-random-digit-123")).click();
		
		WebElement ageSelect = chromedriver.findElement(By.name("age"));
		
		Select age = new Select(ageSelect);
		
		age.selectByIndex(1);
		
		age.selectByValue("20 to 29");
		
		age.selectByVisibleText("Under 50");
		
	}
	
	@Test
	public void dynamicXpath() {
		System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		chromedriver = new ChromeDriver();
		
		chromedriver.get("https://westbengal.covidsafe.in/");
		chromedriver.manage().window().maximize();
		
		int numberOfhosp = chromedriver.findElements(By.xpath("//tbody/tr")).size();
		
		for(int i=1; i<=numberOfhosp;i++) {
			
			WebElement hospNameEle = chromedriver.findElement(By.xpath("//tr["+i+"]//strong"));
			
			String hospName = hospNameEle.getText();
			
			System.out.println("name of the hospital is : "+hospName);
		}
		
	}
	
}

	



