package testNgListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListeners.Listeners.class)

public class ListenersDemo2
{
  @Test(priority=1)
  public void Login()
  {
      System.out.println("Login into bank account");
  }
 
  @Test(priority=5)
  public void Logout()
  {
      System.out.println("Logout bank account");
  }
 
  @Test(priority=2, enabled=false)
  public void NEFTTransfer()
  {
      System.out.println("Transfer the amount via NEFT option");
      System.out.println(10/0);
  }
 
  @Test(priority=3)
  public void BalanceCheck()
  {
       System.out.println("Check the balance amount.. Balance amout is less than transferring amount");
      Assert.assertEquals("Balance amount is less than transferring amount", "Balance amout should grereat than transferring amount");
     
  }
 
  @Test(priority=3, dependsOnMethods={"BalanceCheck"})
  public void IMPSTransfer()
  {
      System.out.println("Transfer the amount via IMPS option");
  }
 
  @Test(priority=4, enabled=false)
  public void RTGSTransfer()
  {
      System.out.println("Transfer the amount via RTGS option");
  }
}