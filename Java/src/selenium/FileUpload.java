package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload
{

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		
		// TODO Auto-generated method stub
		
		
		CommonMethods rv1= new CommonMethods();
		driver=rv1.OpenBrowser_Navigate("http://demo.guru99.com/selenium/upload/", "chrome");
				
		//Enter the file location in the File text box
				driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Jaya\\OneDrive\\Documents\\sample.txt");
		
				//wait time
				Thread.sleep(6000);
				
		//Check the terms check bpx
				driver.findElement(By.id("terms")).click();
				
		//wait time
				Thread.sleep(6000);
				
		//Click on Submit button
				driver.findElement(By.id("submitbutton")).click();
				
			//Read the file uploaded success message
			String succtxt =	driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[2]/h3[1]/center[1]")).getText();

				System.out.println("The  success message text is :: "+succtxt);
				
			if(succtxt.contains("has been successfully uploaded"))
				System.out.println("The  file has been uploaded successfully");
			else
				System.out.println("The  file has NOT been uploaded successfully");
				
	
			//Close the browser
			driver.close();
	}

}
