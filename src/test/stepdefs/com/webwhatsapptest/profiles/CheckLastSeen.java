package com.webwhatsapptest.profiles;

import com.webwhatsapptest.pages.Profiles;
import cucumber.api.java.en.Then;

public class CheckLastSeen {

  private Profiles profilesPage=new Profiles();
  @Then("^checks for last seen$")
  public void checkLastSeen(){
    profilesPage.checkLastSeen();
  }
}
