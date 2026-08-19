package listeners;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

import java.io.IOException;


public class TestListener implements ITestListener {

    WebDriver driver;
    public void onTestFailure(ITestResult result) {

        //Object TestClass = result.getInstance();


        driver = BaseClass.driver;

        String path = null;
        try {
            path = ScreenshotUtils.captureScreenshot(driver,result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("    SCREENSHOT: " + path);



    }

}
