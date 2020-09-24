package com.project.September5PMMavenProject;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_005");
		test.log(LogStatus.INFO, "Initilizing properties files....");
				
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launching browser :- " + dp.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl") );
		
		selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id"));
				
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test Harry Potter by Using the locator :- " +orProp.getProperty("amazonsearchtext_id") );
		
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Button by using the locator :- "+ orProp.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();
		
	}
}
