package stepDefinationTest3;

import homepageActionTest3.HomepageActionTest3;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest3.BaseClassTest3;
import utilityTest3.UtilityTest3;

public class LoginTest3 extends BaseClassTest3{
	
	HomepageActionTest3 homepageActionTest3 = new HomepageActionTest3 ();

@When("user click login link")
public void user_click_login_link() throws Exception {
	
	homepageActionTest3.click_loginLink();
}

@When("enter username, password and click login button")
public void enter_username_password_and_click_login_button() throws Exception {

	homepageActionTest3.enter_username_password_and_click_login_button();
}

@Then("verify user can successfully logged in")
public void verify_user_can_successfully_logged_in() {
    
	homepageActionTest3.verify_user_can_successfull_loggedin();
	UtilityTest3.takeMyScreenshot(driver, "Profile page");
}

}
