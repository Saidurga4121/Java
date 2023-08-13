package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod_TestNG {
	

	 @BeforeMethod
	 public void beforeMethod()
	 {
	      System.out.println("Login into bank account");
	 }
	 
	     @Test(groups= {"transfer data","transfer details"})
	      public void IMPSTransfer()
	      {
	          System.out.println("Transfer the amount via IMPS option");
	      }
	     
	      @Test(groups= {"transfer data"})
	      public void RTGSTransfer()
	      {
	          System.out.println("Transfer the amount via RTGS option");
	      }
	     
	      @Test(groups= {"transfer details"})
	      public void NEFTTransfer()
	      {
	          System.out.println("Transfer the amount via NEFT option");
	       
	      }
	 

	  @AfterMethod
	  public void afterMethod()
	  {
	      System.out.println("Logout bank account");
	  }


}
