package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAfterSuite_TestNG
{
      @BeforeSuite
	  public void beforeSuite()
	  {
	      System.out.println("Login into bank account");
	  }
		     @Test()
		      public void IMPSTransfer()
		      {
		          System.out.println("Transfer the amount via IMPS option");
		      }
		     
		      @Test()
		      public void RTGSTransfer()
		      {
		          System.out.println("Transfer the amount via RTGS option");
		      }
		     
		      @Test()
		      public void NEFTTransfer()
		      {
		          System.out.println("Transfer the amount via NEFT option");
		      }

	  @AfterSuite
	  public void afterSuite()
	  {
	      System.out.println("Logout from bank account");
	  }



}
