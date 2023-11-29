package utilityTest3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityTest3 {
	
public static void takeMyScreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		String correntdir = System.getProperty("user.dir");
		try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/screenShotTmavenTest3/"+screenshot+".png"));
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}

		
}


