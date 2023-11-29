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
	
		@FindBy (id="login2")
		public WebElement login;
		
		@FindBy (id="loginusername")
		public WebElement login_username;
		
		@FindBy(id="loginpassword")
		public WebElement login_password;
		
		@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
		public WebElement loginButton;
		
		@FindBy(id="nameofuser")
		public WebElement verifyLogin;
		
}
