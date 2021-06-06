package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {

		
		public static WebDriver driver = null;
		  
	    @BeforeSuite
	    public void initialize() throws IOException {
	    	
	    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	  
	       
	        driver = new ChromeDriver();
	    
	        // To maximize browser
	        driver.manage().window().maximize();
	    
	          
	        // To open Gmail site
	        driver.get("localhost:8085/medicare/");
	    }
	
  
	    @AfterSuite
	    // Test cleanup
	    public void TeardownTest() {
	        testBase.driver.quit();
	    }
	}
