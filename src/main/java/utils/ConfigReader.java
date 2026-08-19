package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

  private static Properties properties;
  private static FileInputStream fis;

  static{

      try{
          properties = new Properties();
          fis = new FileInputStream("src/test/resources/config.properties");
          properties.load(fis);


      }catch(Exception e){
          throw new RuntimeException("File not found");
      }


  }

  public static String get(String key){
      return properties.getProperty(key);
  }

}
