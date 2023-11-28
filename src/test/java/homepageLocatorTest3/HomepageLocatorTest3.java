package homepageLocatorTest3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest3.BaseClassTest3;

public class HomepageLocatorTest3 extends BaseClassTest3 {
	
	public HomepageLocatorTest3() {
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (id="signin2")
		public WebElement signup;
		
		@FindBy (id="sign-username")
		public WebElement sign_username;
	
		@FindBy (id="sign-password")
		public WebElement sign_password;
		
		@FindBy (xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
		public WebElement signupButton;
	

}
