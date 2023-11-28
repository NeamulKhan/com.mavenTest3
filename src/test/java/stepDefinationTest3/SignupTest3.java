package stepDefinationTest3;

import homepageActionTest3.HomepageActionTest3;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest3.BaseClassTest3;

public class SignupTest3 extends BaseClassTest3{
	
	HomepageActionTest3 homepageActionTest3 = new HomepageActionTest3();

@When("user click signup link")
public void user_click_signup_link() throws Exception {
  
	homepageActionTest3.click_signupLink();
	
}

@When("enter username, password and click signup button")
public void enter_username_password_and_click_signup_button() throws Exception {
  
	homepageActionTest3.enter_username_password_and_click_signup_button();
}

@Then("verify user can successfully signup")
public void verify_user_can_successfully_signup() {
    
	
}


}
