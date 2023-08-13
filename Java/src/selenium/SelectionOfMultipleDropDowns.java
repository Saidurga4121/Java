package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectionOfMultipleDropDowns {

	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			CommonMethods rv1= new CommonMethods();
			driver=rv1.OpenBrowser_Navigate("http://leafground.com/pages/Dropdown.html", "chrome");
					
			Select actualResult = new Select(driver.findElement(By.xpath("(//div[@class='example']/select)[6]")));
			
			actualResult.selectByIndex(1);
			
			actualResult.selectByValue("3");
			
			actualResult.selectByVisibleText("Appium");
			
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

			List<WebElement> list = actualResult.getOptions();
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
			}
				
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

            List<WebElement> list1 = actualResult.getAllSelectedOptions();
			
			for(int i=0;i<list1.size();i++)
			{
				System.out.println(list1.get(i).getText());
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

            
			
			
					driver.quit();
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
	}

}
