package testNgListeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import selenium.CommonMethods;

public class FailedScreenShot {
	static WebDriver driver;
	public void initization() throws InterruptedException
	{
		CommonMethods rv1= new CommonMethods();
		driver=rv1.OpenBrowser_Navigate("http://leafground.com/pages/Dropdown.html", "chrome");
	}
	public void failed(String screenShotName)
	{
	  	
	  	    TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("./ScreenShots/"+screenShotName+".jpeg");
			//
			try {
				Files.copy(src, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	

}
