package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties dp;
	public static Properties parentProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath +"//data.properties");
		dp = new Properties();
		dp.load(fis);
		
		fis = new FileInputStream(projectpath +"//environment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectpath + "//" + e + ".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
	}
	
	public static void launch(String browser)
	{
		if(dp.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(dp.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	

}
