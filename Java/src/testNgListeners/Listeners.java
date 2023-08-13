package testNgListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener{

	// executes on the @test execution
    @Override
    public void onTestStart(ITestResult result)
    {
       
        System.out.println(result.getName()+ "++++++++++ Test Case Execution is started");
    }
     
    // executes on the if @test is passed 
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println(result.getName()+ "++++++++++++ Test Case Execution is success");
       
    }

    // executes on the if @test is failed 
    @Override
    public void onTestFailure(ITestResult result) 
    {
    	System.out.println(result.getName()+ "++++++++++ Test Case Execution is Faileds");
        FailedScreenShot rv1= new FailedScreenShot();
    	rv1.failed(result.getName());
    }
    
    
    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println(result.getName()+ "+++++++++++ Test Case Execution is skipped");
             
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
       
    }

    // executes before the testcase executes
    @Override
    public void onStart(ITestContext context)
    {
        System.out.println(context.getName()+ "++++++++++++ Execution is started");
       
    }

    @Override
    public void onFinish(ITestContext context)
    {
        System.out.println(context.getName()+ "++++++++++ Execution is Finished");
       
    }
 
}