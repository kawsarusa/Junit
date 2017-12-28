package com.bit.support;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
WebDriver driver;
	
	
@Before
public void openBrowser() {
	System.setProperty("webdriver.gecko.driver", "/Users/jarrellsimon/Downloads/geckodriver");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
@After
public void closeBrowser() {
	driver.quit();
}
	
	

}
