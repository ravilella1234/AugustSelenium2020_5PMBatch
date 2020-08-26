package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLauncher 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		//webdriver.edge.driver
		//webdriver.ie.driver

	}

}
