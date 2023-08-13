package selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class DragAndDrop
	{

	    static WebDriver driver;
	    public static void main(String[] args) throws InterruptedException
	    {
	       
		   CommonMethods rv1= new CommonMethods();
	       driver =rv1.OpenBrowser_Navigate("http://leafground.com/pages/drop.html", "chrome");
	   
	       Actions act = new Actions(driver);
	       WebElement dragObj= driver.findElement(By.id("draggable"));
	       
	       // dragAndDropBy drags and drops to particular position
	       act.dragAndDropBy(dragObj,50, 50).build().perform();
	       
	       
	       System.out.println("Color ::"  + dragObj.getCssValue("Color"));
	       System.out.println("Background Color ::"  + dragObj.getCssValue("background-color"));       
	       System.out.println("Font size ::"  + dragObj.getCssValue("font-size"));
	       
	       //
	       WebElement dragObjBy= driver.findElement(By.id("droppable"));
	       
	       act.dragAndDrop(dragObj,dragObjBy).build().perform();
	     

	    }

}
