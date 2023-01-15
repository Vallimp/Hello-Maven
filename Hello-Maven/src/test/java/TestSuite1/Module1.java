package TestSuite1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module1 {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am exceuting before every method");
	}
	
	@Test
	public void test001(){
		System.out.println("I am exceuting testcase001");
		//Assert.assertEquals(false, true); //compares actual result and expeced result//
	}
	@Test
	public void test002(){
		System.out.println("I am exceuting testcase002");
		//Reporter.log("I am exceuting test case 002"); for the messages to appear in the output
	}
	@Test //(groups = {"smoke", "sanity"}) //group of test cases to be executed"
	public void test003(){
		System.out.println("I am exceuting testcase003");
	}
	
	/*@DataProvider 
	public Object[][] data001(){
	Object[][] data	= {{"Valli","pass001"},{"Prasanth","pass002"}};
	return data;
	}
		@Test (dataProvider ="data001")	
	public void login(String username, String password){
		System.out.println(username +"  and  " + password);
	}*/
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I am exceuting after every method");
	}
	
}
