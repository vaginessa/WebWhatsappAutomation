package com.webwhatsapptest.chats;

import com.webwhatsapptest.pages.Chats;
import com.webwhatsapptest.pages.Commons;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifySearchContactAndSendMsg {

  private Commons commonsPage = new Commons();
  private Chats chatsPage = new Chats();

  @Given("^user is logged into whatsapp$")
  public void loginIntoWhatsapp() throws Throwable {
    commonsPage.loginIntoWhatsapp();
    commonsPage.verifyLogin();
  }

  @When("^user searches for a contact \"([^\"]*)\"$")
  public void searchForAContact(String contact) throws Throwable {
    commonsPage.searchContact(contact);
  }

  @Then("^user chooses the contact \"([^\"]*)\"$")
  public void chooseContact(String contact) throws Throwable {
    commonsPage.selectSearchedContact(contact);
  }

  @Then("^sends the message \"([^\"]*)\"$")
  public void sendMessage(String message) throws Throwable {
    chatsPage.sendMessage(message);
  }

}
