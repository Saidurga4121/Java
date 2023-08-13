package selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;

import okhttp3.HttpUrl;

public class FindAllLinks {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	    driver =  new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://login.yahoo.com/?.intl=us");
		driver.get("https://www.google.com/");
		
	   
		// collect all links
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
	
		System.out.println(links.size());
         // String ele = links.get(1).getText();

//		System.out.println(ele+"***********");
		
		for(int i=0;i<=links.size();i++)
		{
			WebElement ele = links.get(i);
			
			String url=ele.getAttribute("href");
			//
			URL rv1= new URL(url);
			HttpsURLConnection httpUrlConnect=( HttpsURLConnection)rv1.openConnection();
			
			httpUrlConnect.connect();
			
			if(httpUrlConnect.getResponseCode()==200)
			{ 
				System.out.println(url+"-"+httpUrlConnect.getResponseMessage());
			}
			
			
			
		}
//		
		

	}

}
