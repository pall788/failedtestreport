package com.as.TestNGListner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public static WebDriver driver;
	
    @BeforeMethod	
    public static void setUp() throws InterruptedException					
    {		
    	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome\\79\\chromedriver_win32\\chromedriver.exe");
		 // step1: Create the driver
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
     }
        @AfterMethod
  		public void Cleanup() throws InterruptedException {
  			Thread.sleep(2000);
  			driver.close();
  		}
        
        public void failed(String testMethodName) {
        	File ScrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	try {
				FileUtils.copyFile(ScrFile, new File("C:\\Coding\\FailedTestScreenshot\\Screenshots\\" + testMethodName
						+ "_" +".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
}
