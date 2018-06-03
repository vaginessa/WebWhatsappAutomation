package com.webwhatsapptest.profiles;
/**
 * @author H Sri Harsha
 * This class contains all the step defs related to CHeckLastSeen.feature
 */
import com.webwhatsapptest.pages.Profiles;
import cucumber.api.java.en.Then;

public class CheckLastSeen {

  private Profiles profilesPage=new Profiles();
  
  @Then("^checks for last seen$")
  public void checkLastSeen(){
    profilesPage.checkLastSeen();
  }
}
