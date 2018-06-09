package com.webwhatsapptest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.webwhatsapptest.runner.Hook;

/**
 * 
 * @author H Sri Harsha This class has methods related to Contact Info screen
 *
 */
public class ContactInfo extends Hook {

  public void clickMenuOptionOnTopRight() {
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath(getLocator("RightMenuButton"))));
    driver.findElement(By.xpath(getLocator("RightMenuButton"))).click();
  }

  public void choseFromMenu(String option) {
    String tempXpath = getLocator("ActiveMessageMenuOptionPart1") + option
        + getLocator("ActiveMessageMenuOptionPart2");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tempXpath)));
    driver.findElement(By.xpath(tempXpath)).click();
  }

  public void verifyMediaLinksAndDocs() {
    try {
      wait.until(
          ExpectedConditions.visibilityOfElementLocated(By.xpath(getLocator("Media_Links_Docs"))));
      driver.findElement(By.xpath(getLocator("Media_Links_Docs")));
      System.out.println("Able to navigate to contact info screen");
    } catch (Exception e) {
      System.out.println("Unable to navigate contact info screen");
      return;
    }
  }
}
