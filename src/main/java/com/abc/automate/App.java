package com.abc.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-mac");
    	WebDriver driver = new ChromeDriver();
    	    	    	
    	
    	driver.get("https://www.google.com/");
    	driver.findElement(By.xpath(".//input[@name='q']")).
                sendKeys("Hello world");

    	Thread.sleep(2000);
    	driver.quit();
    	
    	
    	// exit success
    	System.exit(0);
    }
}
