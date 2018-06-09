package com.webwhatsapptest.pages;

/**
 * @author H Sri Harsha This class contains methods which containd re-usable methods
 */
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.webwhatsapptest.runner.Hook;

public class Commons extends Hook {

  public void loginIntoWhatsapp() {
    driver.navigate().to("https://web.whatsapp.com/");
  }

  public void verifyLogin() {
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath(getLocator("NewMessageIcon"))));
  }

  public void searchContact(String contact) {
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath(getLocator("SearchContact"))));
    driver.findElement(By.xpath(getLocator("SearchContact"))).click();
    driver.findElement(By.xpath(getLocator("SearchContact"))).sendKeys(contact);

  }

  public void selectSearchedContact(String contact) {
    String dynamicXpath =
        getLocator("SearchContactResult_Part1") + contact + getLocator("SearchContactResult_Part2");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dynamicXpath)));
    driver.findElement(By.xpath(dynamicXpath)).click();
  }
}
