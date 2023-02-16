package com.facebook.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
  private WebDriver driver;
  
//UserProfileName
  
  @FindBy(xpath="(//div[@class='xu06os2 x1ok221b'])[1]")
   private WebElement UserProfileName;
  public String getTextofUserProfile()
  {
	String ActualText = UserProfileName.getText();
	return ActualText;
  }
  
// UserProfile 
  
  @FindBy(xpath="//div[@class='x78zum5 x1n2onr6']")
  private WebElement UserProfile;
  public void clickOnUserProfile()
  {
	  UserProfile.click();  
  }
  
//  Logout 
  
  @FindBy(xpath="(//div[@role='listitem'])[5]")
  private WebElement Logout;
  public void clickOnLOgout()
  {
	  Logout.click();  
  }
  
  
  
public HomePagePOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
  
	
}
