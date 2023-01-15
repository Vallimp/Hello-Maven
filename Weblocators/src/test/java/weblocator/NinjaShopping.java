package weblocator;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NinjaShopping {
	WebDriver chromedriver;
	
	@Test
	public void ShoppingDifferentOptions() throws InterruptedException {		
		chromedriver = new ChromeDriver();

	System.setProperty("webdriver.chrome.driver","C:\\users\\janga\\eclipse-workspace\\Hello-Maven\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
	chromedriver.get("http://tutorialsninja.com/demo/index.php");
	chromedriver.manage().window().maximize();
	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	JavascriptExecutor js = (JavascriptExecutor) chromedriver;
	
	//Clicking on the Cuirrency dropdown
	WebElement ChangeCurrency = chromedriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button"));
	ChangeCurrency.click();
	Thread.sleep(2000);
	
	//Changing the currency to Euro on the top left corner
	WebElement ToEuro = chromedriver.findElement(By.xpath("//ul/li//button[@name=\"EUR\"]"));
	ToEuro.click();
	System.out.println("Currency is changed to Euro");
	Thread.sleep(2000);
	
	//Ordering a Canon camera
	WebElement AddCanon = chromedriver.findElement(By.xpath("//*[@id=\"content\"]//div//h4//a[contains(text(),\"Canon EOS 5D\")]"));
	AddCanon.click();
	Thread.sleep(2000);

	//Selection of camera quantity
	WebElement AddQuantity = chromedriver.findElement(By.xpath("//input[@id=\"input-quantity\"]"));
	AddQuantity.click();
	
	//Entering the camera quantity
	AddQuantity.clear();
	AddQuantity.sendKeys("2");
	Thread.sleep(2000);
	
	//Adding the Camera to cart and capturing the error message
	chromedriver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	chromedriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	Thread.sleep(3000);
	String CaptureScreen = chromedriver.findElement(By.xpath("//div[@class=\"text-danger\"]")).getText();
	System.out.println("Error occured     :"+CaptureScreen);
	
	//Moving to Home screen and clicking on iPhone
	chromedriver.findElement(By.xpath("//h1//a[contains(text(),\"Your Store\")]")).click();
	chromedriver.findElement(By.xpath("//a[contains(text(),\"iPhone\")]")).click();
	
	//Setting the quantiy of iPhone to 2 and clikcing on AddtoCart
	WebElement iPhoneQuantity= chromedriver.findElement(By.xpath("//input[@id=\"input-quantity\"]"));
		iPhoneQuantity.click();	
		iPhoneQuantity.clear();	
		iPhoneQuantity.sendKeys("2");
		Thread.sleep(2000);
		chromedriver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-lg btn-block\"]")).click();
		System.out.println("You have added iPhone to your shopping cart!");

	//Clicking on the cart to view items added
		chromedriver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
		chromedriver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
		Thread.sleep(2000);
	
	//Updating the iphone quantity in cart from 2 to 3
		WebElement UpdateQuantity=chromedriver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
		UpdateQuantity.click();
		UpdateQuantity.clear();
		UpdateQuantity.sendKeys("3");
		Thread.sleep(2000);
		chromedriver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//To print Eco Tax and VAT  
		WebElement PrintEcoTax = chromedriver.findElement(By.xpath("//*[@class=\"col-sm-4 col-sm-offset-8\"]//table//tbody//tr[2]//strong"));
		String GetEcoTax = PrintEcoTax.getText();
		System.out.println("EcoTax charged for 3 iPhones is : "+GetEcoTax );
		
		WebElement PrintVAT = chromedriver.findElement(By.xpath("//*[@class=\"col-sm-4 col-sm-offset-8\"]//table//tbody//tr[3]//strong"));
		String GetVAT=PrintVAT.getText();
		System.out.println("VAT for 3 iPhones is  :"+GetVAT);
		
	//Checkout, print the error message and delete items in the cart
		chromedriver.findElement(By.xpath("//div//a[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		WebElement ErrorMsg = chromedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String GetErrorMsg = ErrorMsg.getText();
		System.out.println("Error Message :" +GetErrorMsg);
		chromedriver.findElement(By.xpath("//i[@class=\"fa fa-times-circle\"]")).click();
		
	//Moving to Home screen and clicking on Macbook
		chromedriver.findElement(By.xpath("//div[@id=\"logo\"]/h1/a")).click();
		chromedriver.findElement(By.xpath("//div[@id=\"logo\"]/h1/a")).click(); 
		Thread.sleep(2000);
		chromedriver.findElement(By.xpath("//h4//a[contains(text(),\"MacBook\")]")).click();
		
	//Checking if the MacBook quantity is 1 and adding it to cart
		WebElement MacQuantity = chromedriver.findElement(By.xpath("//div[@class='form-group']/input[@name='quantity']"));
		String GetMacQuantity = MacQuantity.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Quantity of MacBook is        :"+GetMacQuantity);
		
		chromedriver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
		WebElement SuccessMsg =chromedriver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
		String GetSuccessMsg = SuccessMsg.getText();
		System.out.println("Message for MacBook :" +GetSuccessMsg);	
		
		chromedriver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
		Thread.sleep(2000);
		chromedriver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
		Thread.sleep(2000);
		
	//Entering the coupon value
		chromedriver.findElement(By.xpath("//a[contains(text(),\"Use Coupon Code\")]")).click();
		chromedriver.findElement(By.xpath("//div[@class='input-group']/input[@name='coupon']")).click();
		chromedriver.findElement(By.xpath("//div[@class='input-group']/input[@name='coupon']")).sendKeys("ABCD123");
		Thread.sleep(2000);
		
	//Applying the coupon and displaying the error message
		chromedriver.findElement(By.xpath("//input[@id=\"button-coupon\"]")).click();	
		WebElement ErrorMsgMac = chromedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String GetErrorMsgMac = ErrorMsgMac.getText();
		System.out.println("Error Message :" +GetErrorMsgMac);
		
	//Enter AXDFGH123 as gift certificate and perform apply to check, print error message
		chromedriver.findElement(By.xpath("//a[contains(text(),\"Use Gift Certificate\")]/i")).click();	
		chromedriver.findElement(By.xpath("//input[@id=\"input-voucher\"]")).click();
		chromedriver.findElement(By.xpath("//input[@id=\"input-voucher\"]")).sendKeys("AXDFGH123");
		Thread.sleep(2000);
		
		chromedriver.findElement(By.xpath("//input[@id=\"button-voucher\"]")).click();	
		WebElement ErrorMsgMac1 = chromedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String GetErrorMsgMac1= ErrorMsgMac1.getText();
		System.out.println("Error Message :" +GetErrorMsgMac1);
		Thread.sleep(2000);
	
		//Clear both coupon and voucher textbox values and proceed to checkout
		chromedriver.findElement(By.xpath("//input[@name=\"voucher\"]")).click();
		chromedriver.findElement(By.xpath("//input[@name=\"voucher\"]")).clear();
		System.out.println("Voucher code cleared");
		Thread.sleep(2000);
		
		chromedriver.findElement(By.xpath("//a[contains(text(),\"Use Coupon Code\")]")).click();
		chromedriver.findElement(By.xpath("//input[@id=\"input-coupon\"]")).click();
		chromedriver.findElement(By.xpath("//input[@id=\"input-coupon\"]")).clear();
		Thread.sleep(2000);
		System.out.println("Coupon code cleared");

		chromedriver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);

		//Select register account option and enter all account and billing details, click continue
		chromedriver.findElement(By.xpath("//input[@value=\"register\"]"));
		chromedriver.findElement(By.xpath("//input[@id=\"button-account\"]")).click();

		//Fill account and billing info		
		chromedriver.findElement(By.xpath("//input[@id=\"input-payment-firstname\"]")).sendKeys("Pushpavalli");	
		chromedriver.findElement(By.xpath("//input[@id=\"input-payment-lastname\"]")).sendKeys("Mandimala");
		chromedriver.findElement(By.xpath("//input[@id=\"input-payment-email\"]")).sendKeys("pushpavallim@infotechsw.com");
		chromedriver.findElement(By.xpath("//input[@id=\"input-payment-telephone\"]")).sendKeys("7034791934");
		
		chromedriver.findElement(By.xpath("//input[@id=\"input-payment-password\"]")).sendKeys("Jangam7");
		chromedriver.findElement(By.name("confirm")).sendKeys("Jangam7");
		
		chromedriver.findElement(By.name("company")).sendKeys("Cognizant");
		chromedriver.findElement(By.name("address_1")).sendKeys("Prescott Drive");
		chromedriver.findElement(By.name("address_2")).sendKeys("Apt no T1");
		chromedriver.findElement(By.name("city")).sendKeys("Vienna");
		chromedriver.findElement(By.name("postcode")).sendKeys("22180");
		
		WebElement Country = chromedriver.findElement(By.xpath("//select[@id=\"input-payment-country\"]"));
	    Select selectcountry = new Select(Country);
	    selectcountry.selectByVisibleText("United States");

	    WebElement Region = chromedriver.findElement(By.xpath("//select[@id=\"input-payment-zone\"]"));
	    Select selectzone = new Select(Region);
	    selectzone.selectByVisibleText("Virginia");
	    
	     //Agreeing to terms and conditions and clicking continue
	  chromedriver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/div[3]/div/input[1]")).click();
	  chromedriver.findElement(By.xpath("//input[@id=\"button-register\"]")).click();
	  
	  //Add comments, click continue and check the error message related to payment method
	  chromedriver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("MacBook is ordered");
	  chromedriver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")).click();
	  chromedriver.findElement(By.xpath("//input[@id=\"button-payment-method\"]")).click();
	  
	  WebElement WarningText = chromedriver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
	  String GetWarningText = WarningText.getText();
	  System.out.println("Message displayed is : " +GetWarningText);
	  
	  //Click on contact us hyperlink and submit a contact request and click continue
	  chromedriver.findElement(By.xpath("//a[contains(text(),\"Contact Us\")]")).click();
	  chromedriver.findElement(By.xpath("//textarea[@name=\"enquiry\"]")).sendKeys("I need my MacBook tracking details");
	  chromedriver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  chromedriver.findElement(By.xpath("//a[contains(text(),\"Continue\")]")).click();
	  
	}
}
