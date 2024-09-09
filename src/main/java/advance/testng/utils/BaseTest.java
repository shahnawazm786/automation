package advance.testng.utils;


import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class BaseTest extends TestListenerAdapter {
    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
        System.out.println(testContext.getName() +"\t");
        System.out.println(testContext +" Test Started");
        System.out.println(testContext.getHost());

    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        System.out.println(tr+"\t => Test Skipped");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println(tr+"\t => Test Failed");
    }

    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
        System.out.println(result.getName()+"\tTest started");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out.println(tr.getName()+"\t success");
    }
}
