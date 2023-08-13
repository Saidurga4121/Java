package dataProvider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WriteDataToExcel {
	static WebDriver driver;
	 @BeforeClass
		  public void setUp() throws InterruptedException
		  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipadal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver= new ChromeDriver(); 
			 System.out.println("browser launchedd");
			 driver.manage().window().maximize();
		  }
	 
	 @DataProvider(name="loginTest")
	 
		 public String[][] getMyData() throws InvalidFormatException, IOException 
		 {
//			String loginData[][]=
//				   {
//					     
//						{"admin@yourstore.com", "admin","valid" }, // 0
//                     
//                       {"sidama" ,   "World@03","invalid" },  // 1
//                       
//                       {"rissac" ,   "World@04","invalid" },  // 2
//					};
		 
		     String path="C:\\Users\\saipadal\\Desktop\\karthik4.xlsx";
		     GetDataFromExcel rv1= new GetDataFromExcel(path);
		     int rows=rv1.getRowCount("Data");// 2
		     int cols=rv1.getCellCount("Data",rows); // 2
		     String loginData[][]=new String[rows][cols];
		     for(int i=1;i<=rows;i++)
		     {
		    	 for(int j=0;j<cols;j++)
		    	 {
		    		 loginData[i-1][j]=rv1.getCellData("Data", i, j);
		    	 }
		     }
		     
		     
		     
					
		     return loginData;
			 
		 }
	 // @test will run only once but since we have used data provider ,it wil run the same method with multiple data sets.
	 
	  @Test(dataProvider="loginTest")
		  public void login(String username, String password, String value)
	      {
				driver.get("https://admin-demo.nopcommerce.com/login");
				WebElement userName=driver.findElement(By.id("Email"));
				userName.clear();
				userName.sendKeys(username);
				
				WebElement Password=driver.findElement(By.id("Password"));
				Password.clear();
				Password.sendKeys(password);
				
				WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Log in']"));
				
				if(value.equals("valid"))
				{
					loginbtn.click();
				}
				else
				{
					System.out.println("invalid data");
				}
		  }
	  @AfterClass
		  public void tearDown() 
		  {
		    // 
		  }
		
}
