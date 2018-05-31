/**
 * @author Hosur Sri Harsha
 *
 */
package com.webwhatsapptest.runner;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook {

  public static WebDriver driver;

  /**
   * This method is used to initialize the webdriver
   * 
   */
  @BeforeTest
  public void initialize() {
    System.setProperty("webdriver.chrome.driver",
        "F:\\Harsha_Software\\chromedriver\\chromedriver.exe");
    // FirefoxOptions options = new FirefoxOptions();
    // options.setProfile(getProfile("default"));
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  // /**
  // * This method returns the profile for firefox
  // * @param profileName
  // * @return FirefoxProfile
  // */
  // private static FirefoxProfile getProfile(String profileName) {
  // if (profileName == null || profileName.trim().isEmpty()) {
  // return new FirefoxProfile();
  // }
  // return new ProfilesIni().getProfile(profileName);
  // }

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
