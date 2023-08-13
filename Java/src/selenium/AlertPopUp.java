package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		CommonMethods rv1= new CommonMethods();
		driver=rv1.OpenBrowser_Navigate("http://leafground.com/pages/Alert.html", "chrome");

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		// gets the text present in alert box
		String alertMessage=alert.getText();
		
		alert.sendKeys("Traning name");
		
		System.out.println(alertMessage);
		
		// clicks on OK button
		alert.accept();
		
		

		
		
	}

}
