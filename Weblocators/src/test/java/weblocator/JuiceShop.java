package weblocator;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JuiceShop {
	WebDriver driver = new ChromeDriver();
	String URL = "https://juice-shop.herokuapp.com";
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);

	
	//1.User register elements
	@FindBy(xpath = "//button//span[text()='Dismiss']") WebElement DismissButton;
	@FindBy(xpath = "//a[@aria-label=\"dismiss cookie message\"]") WebElement DismissCookiesButton;
	@FindBy(xpath="//button[3]/span[1]/span")WebElement AccountbuttonElement;
	@FindBy(xpath ="//button[3]/span[1]/span")WebElement LoginbtnElement;
	@FindBy(xpath="//div[2]/a[contains(text(),'Not yet a customer?')]") WebElement Notyetcustomerbtn;



	@FindBy (id = "emailControl") WebElement EmailElement;
	@FindBy (id = "passwordControl") WebElement PasswordElement;
	@FindBy (id = "repeatPasswordControl") WebElement RepeatPasswordElement;
	@FindBy (xpath = "//div[@class=\"mat-form-field-infix ng-tns-c118-10\"]") WebElement SecurityQuestionElement;
	@FindBy (xpath = "//span[contains(text(),'maiden')]") WebElement SecurityQueSelectionElement;
	@FindBy (id = "securityAnswerControl") WebElement SecurityAnswerElement;
	@FindBy (xpath ="//button[@id=\"registerButton\"]") WebElement RegisterButtonElement;

	
	//Login and adding items elements
	@FindBy(xpath = "//input[@name=\"email\"]") WebElement LoginEmail;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement LoginPwd;
	@FindBy(xpath = "//button[@id=\"loginButton\"]/span/mat-icon") WebElement LoginBtnlement;
	
	@FindBy(xpath = "//button[@color=\"primary\"]/span/span") WebElement AddAppletoBasket;
	@FindBy(xpath = "//img[@alt=\"Lemon Juice (500ml)\"]/../../../div[2]/button/span/span") WebElement AddLemontoBasket;
	@FindBy(xpath = "//button[@aria-label=\"Next page\"]/span[1]") WebElement NextPageElement;
	@FindBy(xpath = "//img[@alt=\"OWASP Juice Shop Hoodie\"]/../../../div[2]/button/span/span") WebElement AddHoodietoBasket;

	//Increasing the cart ietms quantity
	
	@FindBy(xpath = "//mat-toolbar-row/button[4]") WebElement BasketElement;
	@FindBy(xpath = "//mat-table[@role=\"table\"]/mat-row/mat-cell[3]/button[2]/span[1]") WebElement ApplejuiceQuantity;
	@FindBy(xpath = "//mat-row[@role=\"row\"]/../mat-row[2]/mat-cell[3]/button[2]") WebElement LemonjuiceQuantity;
	@FindBy(xpath = "//mat-table[@role=\"table\"]/mat-row[3]/mat-cell[3]/button[2]") WebElement HoodieQuantity;
	
	
	//Checkinout and adding a new address
	@FindBy(xpath = "//button[@id='checkoutButton']/span") WebElement CheckoutElement;
	@FindBy(xpath = "//input[@data-placeholder=\"Please provide a country.\"]") WebElement CountryElement;
	@FindBy(xpath = "//input[@data-placeholder=\"Please provide a name.\"]") WebElement NameElement;
	@FindBy(xpath = "//input[@data-placeholder=\"Please provide a mobile number.\"]") WebElement MobileElement;
	@FindBy(xpath = "data-placeholder=\"Please provide a ZIP code.\"") WebElement ZipcodeElement;
	@FindBy(xpath = "data-placeholder=\"Please provide an address.\"") WebElement AddressElement;
	@FindBy(xpath = "data-placeholder=\"Please provide a city.\"") WebElement CityElement;
	@FindBy(xpath = "data-placeholder=\"Please provide a state.\"") WebElement StateElement;
	@FindBy(xpath = "//button[@id=\"submitButton\"]data-placeholder=\"Please provide a state.\"") WebElement SubmitElement;
	
	//Select Address and delivery speed elements 
	@FindBy(xpath = "//span[@class=\"mat-radio-outer-circle\"]") WebElement SelectAddressElement;
	@FindBy(xpath = "//span[text()=\"Continue\"]") WebElement ContinueElement;
	@FindBy(xpath = "//mat-radio-button[@id=\"mat-radio-42\"]/label/span[1]") WebElement SelectDeliveryElement;
	@FindBy(xpath = "//span[text()=\"Continue\"]") WebElement Continue1Element;

	//Add new card and place the order
	@FindBy(xpath = "//span[@class=\"mat-content ng-tns-c149-54\"]") WebElement CardElement;
	@FindBy(xpath = "//div[@class=\"mat-form-field-infix ng-tns-c118-55\"]/input") WebElement CardNameElement;
	@FindBy(xpath = "//div[@class=\"mat-form-field-infix ng-tns-c118-56\"]/input") WebElement CardNumElement;
	@FindBy(xpath = "//div[@class=\"mat-form-field-infix ng-tns-c118-57\"]/select") WebElement ExpiryMonthElement;
	@FindBy(xpath = "//div[@class=\"mat-form-field-infix ng-tns-c118-58\"]/select") WebElement ExpiryYearElement;
	@FindBy(xpath = "//mat-panel-title[text()=' Add a coupon ']") WebElement CouponElement;
	@FindBy(xpath = "//mat-icon[contains(text(),'redeem')]") WebElement RedeemElement;
	@FindBy(xpath = "//mat-error[text()=' Coupon code must be 10 characters long. ']") WebElement CouponErrorElement;
	@FindBy(xpath = "//button[@id=\"submitButton\"]") WebElement SubmitButton;


	//Verify the order 
	@FindBy(xpath = "//*[@id=\"mat-radio-44\"]/label/span[1]/span[1]") WebElement SelectCardElement;
	@FindBy(xpath = "//span[text()=\"Continue\"]") WebElement ContinueElement1;
	@FindBy(xpath = "//span[text()=\"Place your order and pay\"]") WebElement PlaceOrderElement;
	
	// Track the order
	@FindBy(xpath = "//span[text()=\" Account \"]") WebElement AccountElement1;
	@FindBy(xpath = "//span[1][text()=\" Orders & Payment \"]") WebElement PaymentOrderElement;
	@FindBy(xpath = "//span[text()=\" Order History \"]") WebElement OrderHistoryElement;
	@FindBy(xpath = "//button[@aria-label='Print order confirmation']/span") WebElement PrintOrderElement;
	@FindBy(xpath = "//button[@aria-label='Track Your Order']") WebElement TrackOrderElement;
	
	// Logout from the application 
	@FindBy(xpath = "//*[@id=\"navbarLogoutButton\"]") WebElement LogoutElement;

	
//1. Create a user in Juiceshop website
	
@Test
public void CreateUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, this);
		DismissButton.click();
		DismissCookiesButton.click();
		AccountbuttonElement.click();
		LoginbtnElement.click();
		Notyetcustomerbtn.click();
		
		EmailElement.click();
		EmailElement.sendKeys("valliqq@gmail.com");
		PasswordElement.click();
		PasswordElement.sendKeys("Karuna7*");
		RepeatPasswordElement.click();
		RepeatPasswordElement.sendKeys("Karuna7*");
		SecurityQuestionElement.click();
		SecurityQueSelectionElement.click();
		SecurityAnswerElement.click();
		Thread.sleep(2000);
		SecurityAnswerElement.sendKeys("Jangam");
		Thread.sleep(2000);
		RegisterButtonElement.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

//2.login to the website and Add one or two items to basket (from each page) – scroll, navigate and select product 

@Test
public void Login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//PageFactory.initElements(driver, this);
		LoginEmail.click();
		LoginEmail.sendKeys("valliqq@gmail.com");
		LoginPwd.click();
		LoginPwd.sendKeys("Karuna7*");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginBtnlement.click();
		AddAppletoBasket.click();
		Thread.sleep(1000);
		//To scroll into view where Lemon juice is present on the page
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddLemontoBasket);
		AddLemontoBasket.click();
		Thread.sleep(1000);

		//To move to Element in the next page
		NextPageElement.click();
		Thread.sleep(1000);
		
		/*actions.moveToElement(AddHoodietoBasket);
		actions.perform();
		Thread.sleep(1000);
		AddHoodietoBasket.click();*/
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddHoodietoBasket);
		AddHoodietoBasket.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

		
	}

//3.Go to your basket and increase the quantity of all items by 2 

@Test
public void ChangeQuantity() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		//PageFactory.initElements(driver, this);
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",BasketElement);

		BasketElement.click();
		
		Thread.sleep(1000);
		ApplejuiceQuantity.click();
		LemonjuiceQuantity.click();
		HoodieQuantity.click();	

	}

//4.Press checkout and add a new address (for all inputs generate random values using code and don’t hard code) 

@Test
public void CheckoutandAddress() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		PageFactory.initElements(driver, this);

		CheckoutElement.click();
		Thread.sleep(1000);
		
		//Country
		String country = RandomStringUtils.randomAlphabetic(20);
		CountryElement.sendKeys(country);
		
		//Name
		String name = RandomStringUtils.randomAlphabetic(20);
		NameElement.sendKeys(name);
		Thread.sleep(1000);
		
		//Mobile
		String mobile = RandomStringUtils.randomNumeric(10);
		MobileElement.sendKeys(mobile);
		Thread.sleep(1000);
		
		//Pincode
		String zip = RandomStringUtils.randomNumeric(5);
		ZipcodeElement.sendKeys(zip);
		
		//Address
		Thread.sleep(2000);
		String address = RandomStringUtils.randomAlphabetic(20);
		AddressElement.sendKeys(address);
		
		//City
		String city = RandomStringUtils.randomAlphabetic(10);
		CityElement.sendKeys(city);
		
		//State
		String state = RandomStringUtils.randomAlphabetic(10);
		StateElement.sendKeys(state);
		
		SubmitElement.click();
	}
//5. Select the address and any delivery speed 

@Test
public void Addressselection() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		PageFactory.initElements(driver, this);
		
		SelectAddressElement.click();
		Thread.sleep(2000);
		ContinueElement.click();	
		SelectDeliveryElement.click();
		Thread.sleep(2000);
		ContinueElement1.click();	
		
	}

//6.Add a new card, try to add a fake coupon (10 digits) and verify error message. Select card, review and place the order. 
@Test
public void AddNewCard() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		PageFactory.initElements(driver, this);
		
		CardElement.click();
		
		//CardName
		String Cardname = RandomStringUtils.randomAlphabetic(10);
		CardNameElement.sendKeys(Cardname);
		
		//CardNumber
		String cardnumber = RandomStringUtils.randomNumeric(16);
		CardNumElement.sendKeys(cardnumber);
		
		//ExpiryMonth
		ExpiryMonthElement.click();
		Select ExpMon=new Select(ExpiryMonthElement);
		ExpMon.selectByValue("7");
		
		//ExpiryYear
		ExpiryYearElement.click();
		Select ExpYear=new Select(ExpiryYearElement);
		ExpYear.selectByValue("2085");
		Thread.sleep(2000);
		
		//Submit
		SubmitButton.click();
		Thread.sleep(3000);
		
		//Add a coupon
		CouponElement.click();
		
		//CouponCode
		String Coupon = RandomStringUtils.randomNumeric(10);
		CouponElement.sendKeys(Coupon);
		
		//RedeemButton
		RedeemElement.click();
		
		//Error message
		String CouponError = CouponErrorElement.getText();
		System.out.println("Coupon Error Message :" +CouponError); 
		
		//Select Card
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", SelectCardElement);
		SelectCardElement.click();
		
		//Continue
		ContinueElement1.click();
		
		//Place your order
		PlaceOrderElement.click();
		
	}
		
//7.Verify in Account, order history -> print order, track order.
@Test
public void VerifyOrder() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		PageFactory.initElements(driver, this);
		
		//Account
		AccountElement1.click();
		
		//Orders and Payments mouse hover
		PaymentOrderElement.click();
		Thread.sleep(2000);
		
		//Orders history
		OrderHistoryElement.click();				
		
		//Print order
		PrintOrderElement.click();
		Thread.sleep(2000);
		
		/*Set<String> windowHandles = driver.getWindowHandles();
		List<String> print = new ArrayList<String>(windowHandles);
		driver.switchTo().window(print.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(print.get(0));
		Thread.sleep(2000);*/
	
		//Track order
		TrackOrderElement.click();
		Thread.sleep(2000);
	}

//8. Then logout from the application 
@Test
public void Logout() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		PageFactory.initElements(driver, this);
		
		LogoutElement.click();
		Thread.sleep(2000);
		
	}	

}


