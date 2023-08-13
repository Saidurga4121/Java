package testNgListeners;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListeners.Listeners.class)
public class ListenersDemo1 implements ITestListener
{
	@Test(priority=1)
	public void test1()
	{
		System.out.println("iam inside test1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("iam inside test2");
		System.out.println(10/0);
	}
	 @Test(priority=3, dependsOnMethods={"test2"})
	  public void test3()
	  {
	      System.out.println("iam inside test3");
	  }
}
