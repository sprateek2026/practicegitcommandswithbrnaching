package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;


public class BaseClass {

    public static WebDriver driver;

    @BeforeMethod
    public WebDriver setUp() {


        String browsername = ConfigReader.get("browser");

        switch (browsername.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Browser not recognized");

        }

         driver.manage().window().maximize();

       return driver;

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();

    }


}
