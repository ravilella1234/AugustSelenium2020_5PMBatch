package excelDataDriven;

import org.testng.annotations.Test;

import com.project.September5PMMavenProject.BaseTest;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class facebookWithDataProvider extends BaseTest
{
	
  @Test(dataProvider = "dp")
  public void f(Hashtable<String, String> data) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Sept Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	  
	  if(data.get("RunMode").equals("N"))
		  throw new SkipException("Execution is set as No....");
	  
			driver.findElement(By.id("email")).sendKeys(data.get("UserName"));
			driver.findElement(By.id("pass")).sendKeys(data.get("Pasword"));
	 
  }

  @DataProvider
  public Object[][] dp() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  sheetName = "Data";
	  testName = "LoginTest";
      return DataUtils.getTestData(e, sheetName, testName);
     
  }
}
