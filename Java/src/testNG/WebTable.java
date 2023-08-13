package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import selenium.CommonMethods;

public class WebTable {
	
	WebDriver driver;
	@Test(priority=1)
	  public void selectionOfOptions() 
	  {	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> headervalues=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		System.out.println(headervalues.size());
		
		for (WebElement values : headervalues) 
		{ 
		    String result=values.getText();
		    System.out.println(result);
		    
		    // check whether the value is present in the table or not
		    if(result.contains("Ernst Handel"))
		    {
		    	System.out.println(result+" is present");
		    	break;
		    }
		}
		
		//
		
		
		
		
	  }
	  

}
