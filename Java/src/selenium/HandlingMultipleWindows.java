package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods rv1= new CommonMethods();
		driver=rv1.OpenBrowser_Navigate("https://demoqa.com/browser-windows", "chrome");

		// getting the refernce of parentWindow
		String parentWindow= driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> openedWindows=driver.getWindowHandles();
		
		int totalWindows=openedWindows.size();
		
		
		
		Iterator<String> list=openedWindows.iterator();
		while(list.hasNext())
		{
			String childWindow=list.next();
			if(parentWindow!=childWindow)
			{
				driver=driver.switchTo().window(childWindow);
				System.out.println(driver.getPageSource());
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
			WebElement text=driver.findElement(By.xpath("//body/h1"));
         	System.out.println(text);
			}
			else
			{
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String parentwindow = driver.getWindowHandle();
//		
//		//Click on New Tab button
//				driver.findElement(By.id("tabButton")).click();
//		//wait time
//				Thread.sleep(6000);
//		//Click on New window message button
//				// driver.findElement(By.id("messageWindowButton")).click();
//		//wait time
//				Thread.sleep(6000);
//				
//		//Get the all opened windows reference
//				Set<String> mwins = driver.getWindowHandles();
//		
//		//Get the number of windows opened
//				int Noofwins =mwins.size();
//				Noofwins = Noofwins-1;
//				System.out.println("The number of sub windows/tabs opened are : "+Noofwins);
//		
//		//Read the sub windows reference one after the other
//				Iterator<String> mwin = mwins.iterator();
//			
//				System.out.println("**************************");
//			while(mwin.hasNext())
//			{
//				String childwindow = mwin.next();
//				if(!parentwindow.equals(childwindow))
//				{
//					driver =driver.switchTo().window(childwindow);
//					System.out.println("The title of the child window is : "+driver.getTitle());
//					System.out.println("The URL of the child window is : "+driver.getCurrentUrl());
//					
//					if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/browser-windows"))
//					{
//						String text = driver.findElement(By.xpath("//html/body")).getText();
//						System.out.println("The text message of the window is : "+text);
//					}
//					driver.close();					
//				}
//				System.out.println("**************************");
//				Thread.sleep(6000);
//			}
//		
//			
//			//Back to parent window
//			driver= driver.switchTo().window(parentwindow);
//			System.out.println("The title of the parent window is : "+driver.getTitle());
//			System.out.println("The URL of the parent window is : "+driver.getCurrentUrl());
//			
//				
		

	}

}
