package retryLogic;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test(retryAnalyzer =retryLogic.RetryAzalyzer.class)
    public void test1() 
    {
	 Assert.assertEquals(false, true);
    }

}
