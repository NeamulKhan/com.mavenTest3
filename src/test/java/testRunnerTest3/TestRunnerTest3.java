package testRunnerTest3;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilityTest3.BaseClassTest3;


@CucumberOptions(features= {"src/test/resources/FeatureFolderTest3"},
plugin={"json:target/cucumber.json"},
glue="stepDefinationTest3", tags= "@Launchurl3"
		)

public class TestRunnerTest3 extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	 
	 public void setup()throws IOException {
		 
		 BaseClassTest3 test = new BaseClassTest3();
		 
		 test.test3browserinit();
	 }
		 
		 @AfterTest
		 
		 public void closerURL() throws IOException{
			 
			 BaseClassTest3 test = new BaseClassTest3();
			 
			// test.driver.quit();
			 
			
		 
	 }
	 


}
