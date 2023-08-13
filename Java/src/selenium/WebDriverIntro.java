package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverIntro extends CommonMethods{
 
	static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		
		CommonMethods rv1= new CommonMethods();
		driver=rv1.OpenBrowser_Navigate("http://automationpractice.com/index.php", "chrome");

			// click on sign in
					driver.findElement(By.linkText("Sign in")).click();
					Thread.sleep(5000);
			// enter email address
					driver.findElement(By.id("email_create")).sendKeys("kkkkk@gmail.com");
					Thread.sleep(5000);
			// click on "create an account"
					driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
					Thread.sleep(5000);
			// select title
		        	driver.findElement(By.id("id_gender2")).click();
					Thread.sleep(5000);
					driver.findElement(By.name("customer_firstname")).sendKeys("kkk");
					driver.findElement(By.id("customer_lastname")).sendKeys("llll");
					driver.findElement(By.name("email")).click();
					driver.findElement(By.id("passwd")).sendKeys("kkkllll");
					WebElement data=driver.findElement(By.name("days"));
					data.sendKeys("4");
					data.sendKeys(Keys.ARROW_DOWN);
					data.sendKeys(Keys.ENTER);
					
			//////////////////////////////////////////////////////////////////////////////////////
		    /////////////////////////////////////////////////////////////////////////////////////
					
					WebElement result = driver.findElement(By.name("months"));
					
					//Getting the option tagnames present under months 'select' tagname
					List<WebElement> subResult = result.findElements(By.tagName("option"));
					
					
					int Noofopts = subResult.size();				
					
					// To print all the drop down values.
					for(int i=0;i<Noofopts;i++)
					{
						System.out.println(subResult.get(i).getText());
					}		
					
					
			//////////// hidden elements
				
					
		}

	}
