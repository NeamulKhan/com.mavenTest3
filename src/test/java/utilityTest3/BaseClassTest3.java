package utilityTest3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassTest3 {
	
	public static Properties test3_prop;
	public static WebDriver driver;
	
	public BaseClassTest3() {
		
	try {
		FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\mavenTest3\\config\\com.mavenTest3.Properties");	
			
		test3_prop = new Properties();
		test3_prop.load(file);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	public void test3browserinit() {
		
	String browser = test3_prop.getProperty("Browser1");
	
	if (browser.equalsIgnoreCase("Chrome")) {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDriverTest3\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataTest3.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataTest3.pageLoadwait));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
	}
	else if(browser.equalsIgnoreCase("FireFox")) {
		
		}
		
	}
	public static void test3launchURL(String URL) {
		
		driver.get(test3_prop.getProperty("URL"));
	}
}



