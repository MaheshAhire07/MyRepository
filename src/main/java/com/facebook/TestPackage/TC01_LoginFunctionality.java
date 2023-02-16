package com.facebook.TestPackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.POMPackage.HomePagePOMClass;

public class TC01_LoginFunctionality extends TestBase
{
    @Test
	public void verifyTheLoginFunctionality() 
	{
    	
   // Validation 
    	
       log.info("Apply the Validation");	
    	
	  String ExpectedText = "Mahesh Ahire";
	  
	  HomePagePOMClass hp = new HomePagePOMClass(driver);
  
	  String ActualText = hp.getTextofUserProfile();
    	
      Assert.assertEquals(ActualText, ExpectedText);
     
	  
	}
	
}
