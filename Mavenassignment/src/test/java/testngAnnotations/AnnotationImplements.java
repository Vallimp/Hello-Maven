package testngAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;


public class AnnotationImplements {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite is executed before the suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest is executed before all the tests");
	}
	
	@BeforeGroups
	public void beforegroups() {
		System.out.println("BeforeGroups is executed before all the groups");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass is executed before all the classes");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod is executed before all the methods");
	}
	
	@Test
	public void test() {
		System.out.println("ActualTest is executed");
	}
	
	@DataProvider
	public Object[][] data01()
	{
		Object[][] data= {{"Numpy","Ninja"},{"Selenium","sessions"}};
		return data;
	}
	
	@Test(dataProvider="data01")
	public void Test1(String username, String password) {
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
		System.out.println("This is Data Provider execution");
	}
	
	@Test(groups= {"Functional"})
	public void test2() {
		System.out.println("This is Funtioinal test execution");
	}
	
	@Test(groups={"Regression"})
	public void test3() {
		System.out.println("This is Regression test execution");
	}
	
	@Test(groups= {"Sanity"})
	public void test4() {
		System.out.println("This is Sanity test execution");
	}

	@Test
	public void Reporter() {
		System.out.println("This is Reporter test case execution");
		Reporter.log("I am exceuting Reporter testcase");
	}
	
	@Test
	public void Assert() {
		System.out.println("This is Assert test case execution");
		Assert.assertEquals(false, true); //compares actual result and expeced result//
	}
	
	@Parameters({"book","author"})
	@Test
	public void testparameter(String book, String author) {
		System.out.println("This is test case for data parameters");
		System.out.println("Name of the book is" +book);
		System.out.println("Name of the author is" +author);
	}
		
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod is executed after all the methods");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass is executed after all the classes");
	}
	@AfterGroups
	public void aftergroups() {
		System.out.println("AfterGroups is executed after all the groups");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest is executed after all the tests");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite is executed after the suite");
	}
	
}




