package com.selenium;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initilizing properties files....");
		
		launch("chromebrowser");
		log.info("Launching browser :- " + dp.getProperty("chromebrowser"));

		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + childProp.getProperty("amazonurl") );
		
		selectOption("amazondropbox_id","Books");
		log.info("Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		log.info("Entered the test Harry Potter by Using the locator :- " +orProp.getProperty("amazonsearchtext_id") );
		
		elementClick("amazonsearchbutton_xpath");
		log.info("Clicked on Button by using the locator :- "+ orProp.getProperty("amazonsearchbutton_xpath"));
		
		
	}

	

}
