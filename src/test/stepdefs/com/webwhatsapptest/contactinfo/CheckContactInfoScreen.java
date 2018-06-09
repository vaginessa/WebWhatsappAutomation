package com.webwhatsapptest.contactinfo;

import com.webwhatsapptest.pages.ContactInfo;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Sri Harsha
 * This class has stepdefs related to VerifyContactInfo feature
 *
 */

public class CheckContactInfoScreen {

  private ContactInfo contactInfo=new ContactInfo();
  
  @When("^user clicks on menu option on active chat window$")
  public void clickMenuOptionOnTopRight() throws Throwable {
    contactInfo.clickMenuOptionOnTopRight();
  }

  @Then("^chooses \"([^\"]*)\" from menu option$")
  public void choseFromMenu(String option) throws Throwable {
    contactInfo.choseFromMenu(option);
  }

  @Then("^verifies Media,Links and Docs in contact info screen$")
  public void verifyMediaLinksAndDocs() throws Throwable {
    contactInfo.verifyMediaLinksAndDocs();
  }
}
