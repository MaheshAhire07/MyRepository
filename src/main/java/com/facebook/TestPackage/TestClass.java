package com.facebook.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.POMPackage.HomePagePOMClass;
import com.facebook.POMPackage.LoginPagePOMClass;

public class TestClass extends TestBase
{
	@Test
	public void verifyTheLoginFunctionality() 
	{
    	
   // Validation  	
    	
	  String ExpectedText = "Mahesh Ahire";
	  
	  HomePagePOMClass hp = new HomePagePOMClass(driver);
  
	  String ActualText = hp.getTextofUserProfile();
    	
      Assert.assertEquals(ActualText, ExpectedText);
       
	}
	
	@Test(dependsOnMethods={"verifyTheLoginFunctionality"})
	  public void verifyLogOutFunctionality()
	  {
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickOnUserProfile();System.out.println("- Clicked on User Profile");
		hp.clickOnLOgout();System.out.println("- Clicked on Logout");
		
	// Validation
	     LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	     lp.isLoginButtonDisplayed();
	     
	     
	  }
	
	
	
}
