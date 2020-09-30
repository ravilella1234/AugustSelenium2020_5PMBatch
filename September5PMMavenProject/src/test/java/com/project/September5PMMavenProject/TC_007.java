package com.project.September5PMMavenProject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_007 extends BaseTest
{
	
 
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  	init();
		test = report.startTest("TC_007");
		test.log(LogStatus.INFO, "Initilizing properties files....");
				
		launch(bType);
		test.log(LogStatus.INFO, "Launching browser :- " + dp.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl") );
	  
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazonTest() 
  {
	    selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id"));
				
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test Harry Potter by Using the locator :- " +orProp.getProperty("amazonsearchtext_id") );
		
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Button by using the locator :- "+ orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess()
  {
	  driver.quit();
	  
	    report.endTest(test);
		report.flush();
	  
  }

}
