package com.abc.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
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
