package tests;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import pages.MobilePage;
import utils.RandomPageSelector;

public class Amazontest extends BaseClass {

    @Test
    public void amazontest(){

        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.gotoamazonpage();
        amazonHomePage.clicksearchbutton("Mobile");

        MobilePage mobilePage = new MobilePage(driver);
        //mobilePage.scrolltobottom();
        int targetpage = RandomPageSelector.randompage(3,10);
        mobilePage.clickonnextbutton(targetpage);
        String name =mobilePage.clickonproducts();
        System.out.println(name);
    }



  @Test
  public void amazontest1(){

      AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
      amazonHomePage.gotoamazonpage();
      amazonHomePage.clicksearchbutton("Mobile");

      MobilePage mobilePage = new MobilePage(driver);
      //mobilePage.scrolltobottom();
      int targetpage = RandomPageSelector.randompage(3,10);
      mobilePage.clickonnextbutton(targetpage);
      String name =mobilePage.clickonproducts();
      System.out.println(name);
  }


}
