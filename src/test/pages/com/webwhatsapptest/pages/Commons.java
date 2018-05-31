package com.webwhatsapptest.pages;

import org.openqa.selenium.By;
import com.webwhatsapptest.runner.Hook;

public class Commons extends Hook {

  public void loginIntoWhatsapp() {
    driver.navigate().to("https://web.whatsapp.com/");
  }

  public void verifyLogin() {
    try {
      driver.findElement(By.xpath(getLocator("NewMessageIcon")));
      Thread.sleep(30000);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  public void searchContact(String contact)
  {
    driver.findElement(By.xpath(getLocator("SearchContact"))).click();
    driver.findElement(By.xpath(getLocator("SearchContact"))).sendKeys(contact);
    
  }
  
  public void selectSearchedContact(String contact)
  {
   String dynamicXpath=getLocator("SearchContactResult_Part1")+contact+ getLocator("SearchContactResult_Part2");
   driver.findElement(By.xpath(dynamicXpath)).click();
  }
}
