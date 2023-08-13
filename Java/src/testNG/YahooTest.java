package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooTest {
	static WebDriver driver;
  @BeforeClass
  @Parameters("url")
	  public void setUp(String url) throws InterruptedException
	  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Documents\\drivers\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
	  }
  @Test
  @Parameters("userId")
	  public void test(String userId) 
      {
	     driver.findElement(By.id("login-username")).sendKeys(userId);
	  }
  @AfterClass
	  public void tearDown() 
	  {
	     driver.close();
	  }
  
}
