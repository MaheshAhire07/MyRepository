package com.facebook.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

 public static void takeScreenShot(WebDriver driver, String name) throws IOException
 {
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy hh-mm-ss");
	 
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	File destfile = new File("./ScreenShots/"+name+sdf.format(d)+".jpg");
	FileHandler.copy(sourcefile, destfile);
	
 }
	
}
