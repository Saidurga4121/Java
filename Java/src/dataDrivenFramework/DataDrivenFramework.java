package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import selenium.CommonMethods;

public class DataDrivenFramework {

	// static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
				
		
		CommonMethods rv11= new CommonMethods();
		// driver=rv11.OpenBrowser_Navigate("http://automationpractice.com/index.php", "chrome");
		
		 ReadDataFromExcel rv1= new ReadDataFromExcel("C:\\Users\\saipadal\\Desktop\\excel.xlsx");
		 
		 //
		 for(int i=1;i<=rv1.getRowCount("Sheet1");i++)
		 {
			 String emailId= rv1.getData("Sheet1", i, 0);
			 System.out.println(emailId);
			 String firstName= rv1.getData("Sheet1", i, 1);
			 System.out.println(firstName);
			 String lastName= rv1.getData("Sheet1", i, 2);
			 System.out.println(lastName);
			 String password= rv1.getData("Sheet1", i, 3);
			 System.out.println(password);

			 
			// click on sign in
				// driver.findElement(By.linkText("Sign in")).click();
				Thread.sleep(5000);
		// enter email address
				// driver.findElement(By.id("email_create")).sendKeys(emailId);
				Thread.sleep(5000);
		// click on "create an account"
				// driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
				Thread.sleep(5000);
		// select title
				Thread.sleep(5000);
//				driver.findElement(By.name("customer_firstname")).sendKeys(firstName);
//				driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
//				driver.findElement(By.name("email")).click();
//				driver.findElement(By.id("passwd")).sendKeys(password);
//			 
		 }
		 
					
					
			       

	}

}
