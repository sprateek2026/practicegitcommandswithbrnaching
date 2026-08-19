package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

import java.time.Duration;

public class AmazonHomePage {
  private WebDriver driver;
  private WebDriverWait wait;

  private By searchbox = By.id("twotabsearchtextbox");
  private By searchbutton = By.id("nav-search-submit-button");


  public AmazonHomePage(WebDriver driver){
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  public void gotoamazonpage(){

      driver.get(ConfigReader.get("url"));
      wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
  }

  public void clicksearchbutton(String text){
    driver.findElement(searchbox).clear();
    driver.findElement(searchbox).sendKeys(text);
    driver.findElement(searchbutton).click();
  }

}
