package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	    driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=us");
		
		// will wait for 10 seconds until the page gets loaded.
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		// every web element in the web page that is getting interacted with the driver will wait for 10 sec, if loads before 1 sec , then 9 sec wil get ignored.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title= driver.getTitle();
		System.out.println(title);
		//
		WebElement username= driver.findElement(By.id("login-username"));

	     // explict wait
		
		// By using the Explicit Wait command, the WebDriver is directed to wait until it meets desired condition 
	     sendKeys(username,"sai");
		

	}
	public static void sendKeys(WebElement locator, String value)
	{
		new WebDriverWait(driver,10 ).until(ExpectedConditions.visibilityOf(locator)).sendKeys(value);
	}
	
	
	

}
