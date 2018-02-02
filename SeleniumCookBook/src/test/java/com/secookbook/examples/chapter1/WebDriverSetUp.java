package com.secookbook.examples.chapter1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
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
				 
			}else if (browser.equals("ie")) {
			    System.setProperty("webdriver.ie.driver",
			            "c:/ToolsQA/webDrivers/IEDriverServer.exe");

			        //DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			        //InternetExplorerOptions ieOptions = new InternetExplorerOptions(caps);

//			        caps.setCapability(
//			            InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//			            true);
			        InternetExplorerOptions ieOpt = new InternetExplorerOptions();
			        //ieOpt.setCapability(
			        		//InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

			        // Launch Internet Explorer
			        driver = new InternetExplorerDriver(ieOpt);
			        driver.manage().window().maximize();
			        
			}else {
				
				 System.setProperty("webdriver.edge.driver",
					        "c:/ToolsQA/webDrivers/MicrosoftWebDriver.exe");

					    EdgeOptions options = new EdgeOptions();
					    options.setPageLoadStrategy("eager");

					    // Launch a new Edge instance *** ***
					    driver = new EdgeDriver(options);
			}
	}
	
	
}
