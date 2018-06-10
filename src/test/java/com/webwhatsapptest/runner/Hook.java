/**
 * @author Hosur Sri Harsha
 *
 */
package com.webwhatsapptest.runner;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook {

  public static WebDriver driver;
  public static WebDriverWait wait;

  /**
   * This method is used to initialize the webdriver
   * 
   */
  @BeforeTest
  public void initialize() {
    String browserToTest = getConfig("browserToTest");
    if (browserToTest.equals("chrome")) {
      System.setProperty("webdriver.chrome.driver", getConfig("browserDriverLocation"));
      driver = new ChromeDriver();
    }
    wait = new WebDriverWait(driver, 60);
  }

  /**
   * This method closes the browser
   */
  @AfterTest
  public void tearDown() {
    driver.quit();
  }

  /**
   * This method returns the value of locators
   * 
   * @param key
   * @return value of key from properties file
   */
  public String getLocator(String key) {
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream("./src/test/resources/properties/Locator.properties"));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return prop.getProperty(key);
  }

  /**
   * This method returns the value of config properties value
   * 
   * @param config key
   * @return value of config property value
   * 
   */

  public String getConfig(String configkey) {
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream("./src/test/resources/properties/config.properties"));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return prop.getProperty(configkey);
  }
}
