package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertions {

	// hard assertion :after it failes ,it wont execute the next statements
	// Soft assertion will make everything pass, to see what is failed write assertAll();
	
	SoftAssert rv1= new SoftAssert();
	
	@Test
	public void test1()
	{
		System.out.println("login");
		rv1.assertEquals(true, false);
		System.out.println("enter extension number");
		System.out.println("select resort name");
		System.out.println("select rate");
		rv1.assertEquals(true, false);
		System.out.println("select room type");
		rv1.assertAll();
	}
}
