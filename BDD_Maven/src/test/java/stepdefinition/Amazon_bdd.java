package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_bdd {
	
static WebDriver driver = new ChromeDriver();
	
	@Given("Application needs to be launched")
	public void ApplicationLaunch() {
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}
	
	@When("user gives the website link")
	public void AmazonLaunch() {

	}
	
	@Then("user searches for the book")
	public void SearchBook()   {
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		Searchbox.click();
		Searchbox.sendKeys("The Art of war by sun tsu");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	}
	
	@And("user clicks on the book")
	public void ClickBookLink()   {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"search\"]//h2/a/span")).click();
	}
	
	@And("Set the quantity")
	public void SetQuantity()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id=\"selectQuantity\"]/span/div/div/span/span/span/span")).click();
		
	}
	
	@When("user sets the quantity to 2")
	public void FixQuantity()   {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@role=\"option\"]/a[@id=\"quantity_1\"]")).click();
	}
	
	@Then("add book to the cart")
	public void AddtoCart()  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"submit.add-to-cart\"]")).click();
	}
}
