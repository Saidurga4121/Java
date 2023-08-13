package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Documents\\drivers\\chromedriver.exe");

	    driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
		
		// since getScreenShotAs() is not available in WebDriver, we are gonna downcast the driver to TakesScreenshot interface
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./ScreenShots/sai.jpeg");
		//
		Files.copy(src, destination);
		//
		
		

	}

}
