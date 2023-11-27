package stepDefinationTest3;

import io.cucumber.java.en.Given;
import utilityTest3.BaseClassTest3;

public class Launchurl3 extends BaseClassTest3{
	
	@Given("Launch {string}")
	public void launch(String URL) {
	   
		test3launchURL(URL);
	}


}
