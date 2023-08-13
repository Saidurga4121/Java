package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonMethods {
	public static WebDriver driver;
	public  WebDriver OpenBrowser_Navigate(String url, String browser) throws InterruptedException {
		////////////////////////////////////////////////////
		if(browser.equalsIgnoreCase("FF")||browser.equalsIgnoreCase("firefox") )
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\saipadal\\Documents\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("google chrome") )
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("IE")||browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\saipadal\\Documents\\drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
		return driver;
	}
	public WebDriver quitDriver()
	{
		driver.close();
		return driver;
		
	}

}
