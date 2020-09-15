package com.selenium;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");

		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtext_id","Harry Potter");
		
		elementClick("amazonsearchbutton_xpath");
		
		
	}

	

}
