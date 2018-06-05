package com.webwhatsapptest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.webwhatsapptest.runner.Hook;

public class Profiles extends Hook {

  public void checkLastSeen() {
    try {
      WebElement lastSeen = driver.findElement(By.xpath(getLocator("LastSeen")));
      System.out.println("Last seen status is displayed and is : " + lastSeen.getText());
    } catch (Exception ex) {
      System.out.println("Last Seen not there");
      return;
    }
  }
}
