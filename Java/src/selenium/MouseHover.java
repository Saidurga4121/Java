package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static WebDriver driver;
	 static Actions acts; ;
		public static void main(String[] args) throws InterruptedException {
			
			CommonMethods rv1= new CommonMethods();
			driver=rv1.OpenBrowser_Navigate("http://www.facebook.com/", "chrome");
			//
			
			Actions acts= new Actions(driver);
			acts.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).build().perform();
			//
			
			acts.moveToElement(driver.findElement(By.xpath("//a[text()='TESTING TOOLS']"))).build().perform();
            //
			
			driver.findElement(By.linkText("SELENIUM")).click();
			
		// right click
//			Actions action = new Actions(driver);  
WebElement element = driver.findElement(By.id("elementId"));  
		acts.contextClick(element).perform();  
			
			// double click
		//	action.doubleClick(element).build().perform();
			
	
		}
}
