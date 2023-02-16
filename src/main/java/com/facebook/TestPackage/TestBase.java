package com.facebook.TestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.facebook.POMPackage.LoginPagePOMClass;
import com.facebook.UtilityPackage.UtilityClass;

public class TestBase 
{
    WebDriver driver;
    ChromeOptions options;
    
    Logger log = Logger.getLogger("Facebook");
  
  @Parameters("BrowserName")
  @BeforeMethod  
  public void setUp(String BrowserName) throws IOException
  {  
	if(BrowserName.endsWith("chrome")) 
	{
	options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver(options);
	}
	else
	{
      System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
      driver = new FirefoxDriver();
	}	
	driver.manage().window().maximize();
	
	PropertyConfigurator.configure("log4j.properties");
	
	log.info("Browser Open and Maximized");
	
// Implicit wait
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	log.info("- URL is open");
	
// Login
	
	LoginPagePOMClass login = new LoginPagePOMClass(driver);
    login.enterLoginID(); log.info("Login Id Entered");
    login.enterPassword();log.info("Password Entered");
    login.clickOnLoginButton();log.info("Clicked on Login");
    log.info("User went on Home page");
	UtilityClass.takeScreenShot(driver, "LoginPage");		  
  } 
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
	  log.info("- Browser Clossed");
  }
  
	
}
