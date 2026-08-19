package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

 public static String captureScreenshot(WebDriver driver,String name) throws IOException {

 String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

 String path = System.getProperty("user.dir")+"/testoutput/screenshots/"+name+"_"+timestamp+".png";

File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

     FileUtils.copyFile(src,new File(path));

     return path;

 }
}
