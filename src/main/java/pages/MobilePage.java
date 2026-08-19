package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MobilePage {

        private WebDriver driver;
        private WebDriverWait wait;

        private By nextbutton = By.xpath("//a[text()='Next']");
        private By products = By.xpath("//span[@class='a-declarative']//h2");


        public MobilePage(WebDriver driver){
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void scrolltobottom(WebElement element){

            JavascriptExecutor jse =(JavascriptExecutor)driver;
            //jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            jse.executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'});", element);

        }

        public void clickonnextbutton(int targetpage){
        int currentpage=1;
        while(currentpage<targetpage){
            WebElement nxtbutton = wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
            scrolltobottom(nxtbutton);
            nxtbutton.click();
            wait.until(ExpectedConditions.stalenessOf(nxtbutton));
            currentpage++;
        }
        }

        public String clickonproducts(){

            wait.until(ExpectedConditions.elementToBeClickable(products));
            List<WebElement> allproducts = driver.findElements(products);
            WebElement thirdproduct = allproducts.get(2);
            String name = thirdproduct.getText();
            thirdproduct.click();
            return name;

        }


}
