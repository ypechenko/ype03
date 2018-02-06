package com.secookbook.examples.chapter1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverSetUp {
	
	protected WebDriver driver;
	protected String browser = System.getProperty("browser");
	
	
	WebDriverSetUp(){
		
			
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
				        "c:/ToolsQA/webDrivers/chromedriver.exe");

				    // Launch Chrome
				    driver = new ChromeDriver();
				    driver.manage().window().maximize();
			}else if (browser.equals("ff")) {
				// Launch a new Firefox instance
			    System.setProperty("webdriver.gecko.driver", "c:/ToolsQA/webDrivers/geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				  driver = new FirefoxDriver();
				  driver.manage().window().maximize();
			        
			}else {
				
				System.out.println("Browser is not comfigured");
				
				
			}
	}
	
	
}
