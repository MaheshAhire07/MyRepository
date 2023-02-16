package com.facebook.TestPackage;


import org.testng.annotations.Test;

import com.facebook.POMPackage.HomePagePOMClass;
import com.facebook.POMPackage.LoginPagePOMClass;

public class TC02_LogOutFunctionality extends TestBase
{
  @Test
  public void verifyLogOutFunctionality()
  {
	HomePagePOMClass hp = new HomePagePOMClass(driver);
	hp.clickOnUserProfile();log.info("- Clicked on User Profile");
	hp.clickOnLOgout();log.info("Clicked on Logout");
	log.info("User Went on sign up page");
	log.info("Apply the Validation");
	
// Validation
     LoginPagePOMClass lp = new LoginPagePOMClass(driver);
     lp.isLoginButtonDisplayed();
     
     
  }

}
