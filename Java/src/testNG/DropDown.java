package testNG;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import selenium.CommonMethods;
import testNgListeners.FailedScreenShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


@Listeners(testNgListeners.Listeners.class)
public class DropDown {
	static WebDriver driver;
	 static Select result;
 @BeforeClass
     public void setUp() throws InterruptedException 
  	 {
      FailedScreenShot rv1= new FailedScreenShot();
      rv1.initization();
     }
  @Test(priority=1,groups= {"result"})
     public void selectionOfDropDown() 
     {
	  // @FindBy(xpath="(//div[@class='example'/select])[6]") 
	  WebElement result;
	  // result = new Select(driver.findElement(By.xpath("(//div[@class='example'/select])[6]")));	  
	  //result.selectByIndex(1);
	  // result.selectByVisibleText("A");
	  
     }
  @Test(priority=1,groups= {"result"})
  public void selectionOfOptions() 
  {	  
	// getting all options
	  
	  List<WebElement> list= result.getOptions();
	  for(int i=1;i<list.size();i++)
	  {
		 System.out.println("The options present are below");
	     System.out.println(list.get(i).getText());
	     System.out.println("*****************************");
	  }
	  // getting all selected options
	  
	  List<WebElement> list1= result.getAllSelectedOptions();
	  for(int i=1;i<list1.size();i++)
	  {
	     System.out.println("The selected options are");
	     System.out.println(list1.get(i).getText());
	     System.out.println("*****************************");

	  }
	  
  }
  
  @AfterClass
     public void afterMethod() 
     {
	  CommonMethods rv2= new CommonMethods();
	  rv2.quitDriver();
     }

}
