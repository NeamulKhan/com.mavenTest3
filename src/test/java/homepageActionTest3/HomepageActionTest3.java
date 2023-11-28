package homepageActionTest3;

import homepageLocatorTest3.HomepageLocatorTest3;
import utilityTest3.BaseClassTest3;

public class HomepageActionTest3 extends BaseClassTest3{
	
	HomepageLocatorTest3 homepageLocatorTest3 =new HomepageLocatorTest3();

	public void click_signupLink() throws Exception {
		
		Thread.sleep(3000);
		homepageLocatorTest3.signup.click();
	}
	
	public void enter_username_password_and_click_signup_button() throws Exception{
		
		Thread.sleep(3000);
		homepageLocatorTest3.sign_username.sendKeys("raisa");
		homepageLocatorTest3.sign_password.sendKeys("123456");
		Thread.sleep(2000);
		homepageLocatorTest3.signupButton.click();
		
	}
	
}
