package Runner;

/*import org.testng.annotations.DataProvider;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin= {"pretty","html:target/Amazon_report.html"}, //reports using pretty plugin
		monochrome=false, //colorful console output
		tags = "@launch", //tags from the feature file
		features= {"src/test/resources/features/Amazon.feature"}, //location of feature file
		glue="stepdefinition" //location of step definition file
				)

public class Testrunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	}*/


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/programModule",
        glue = {"com.api.hackathon.steps"},
        monochrome = true,
        plugin = { "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                + "Jvm"}
)
public class Testrunner {
}