package com.webwhatsapptest.pages;

/**
 *@author H Sri Harsha
 * This method contains methods related to Chats
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.webwhatsapptest.runner.Hook;

public class Chats extends Hook {

  private int messagesCountBeforeNewMessage;
  private int messagesCountAfterNewMessage;

  public void sendMessage(String message) {

    List<WebElement> messages = driver.findElements(By.xpath(getLocator("Messages")));
    messagesCountBeforeNewMessage = messages.size();
    driver.findElement(By.xpath(getLocator("MessageBox"))).sendKeys(message);
    Actions action = new Actions(driver);
    action.sendKeys(Keys.ENTER).perform();
    messages = driver.findElements(By.xpath(getLocator("Messages")));
    messagesCountAfterNewMessage = messages.size();
    if (messagesCountAfterNewMessage - messagesCountBeforeNewMessage == 1) {
      System.out.println("Message sent successfully");
    } else {
      System.out.println("Message sending failed");
    }
  }
}
