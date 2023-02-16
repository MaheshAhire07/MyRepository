package com.facebook.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
 private WebDriver driver;
 
//Web Elements
 
// LoginID
 
 @FindBy(xpath="//input[@id='email']")
 private WebElement LoginID;
 public void enterLoginID()
 {
   LoginID.sendKeys("ahiremahesh832@gmail.com"); 
 }
 
//Password
 @FindBy(xpath="//input[@id='pass']")
 private WebElement Password;
 public void enterPassword()
 {
	 Password.sendKeys("Mahesh@7797"); 
 }
	
//LoginButton
 @FindBy(xpath="//button[@name='login']")
 private WebElement Login;
 public void clickOnLoginButton()
 {
	 Login.click(); 
 }
 
 public void isLoginButtonDisplayed()
 {
	if(Login.isDisplayed()==true) 
	{
	  System.out.println("- User logged out successfully");	 
	}
	else
	{
	  System.out.println("- User Failed to Logout");	
	}
 }
 
 
 public LoginPagePOMClass(WebDriver driver)
 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 
}
