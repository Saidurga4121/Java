package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		File f= new File("C:\\\\Users\\\\saipadal\\\\eclipse-SeleniumPrograms\\\\Java\\\\src\\\\properties\\\\config.properties");
		FileInputStream fis= new FileInputStream(f);
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
