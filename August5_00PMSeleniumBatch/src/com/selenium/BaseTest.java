package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

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
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 14");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
		}
		else if(dp.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/drivers/geckodriver.exe");
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("SeptemberFFProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			driver = new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	

}
