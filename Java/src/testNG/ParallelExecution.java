package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	static WebDriver driver;
	@BeforeClass
		  public void setUp() throws InterruptedException
		  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Documents\\drivers\\chromedriver.exe");
			driver= new ChromeDriver(); 
			driver.manage().window().maximize();
		  }
	  @Test(invocationCount = 3 )
		  public void YahooTest() throws InterruptedException 
	      {
		    driver.get("https://login.yahoo.com/?.intl=us");
			Thread.sleep(5000);
			String title= driver.getTitle();
			System.out.println(title);
		  }
	  @Test
	  public void GmailTest() throws InterruptedException 
      {
	    driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
	  }
	  @AfterClass
		  public void tearDown() 
		  {
		     driver.close();
		  }
}
