package com.as.TestNGListner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotFailed extends BaseClass {
	    
	    @Test
	    public void takeScreenShotTest() {
	    	Assert.assertEquals(false, false);
	    	
	    }
	   /* @Test
	    public void takeScreenShotTest1() {
	    	Assert.assertEquals(false, false);
	    	
	    }
	    @Test
	    public void takeScreenShotTest2() {
	    	Assert.assertEquals(false, false);
	    	
	    }*/


}
