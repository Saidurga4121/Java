package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass_TestNG
{
    
  @BeforeClass
  public void beforeClass()
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
 
  @AfterClass
  public void afterClass()
  {
      System.out.println("Logout from bank account");
  }

}


