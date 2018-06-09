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
    System.setProperty("webdriver.chrome.driver",
        "F:\\Harsha_Software\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
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
}
