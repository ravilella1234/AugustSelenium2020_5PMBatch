package com.selenium;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if (report==null) 
		{
			report = new ExtentReports(projectpath + "//HtmlReports//" + "report.html");
			report.loadConfig(new File(projectpath + "//extentreportconfig.xml"));
			report.addSystemInfo("Selenium Language Binding", "3.141.59").addSystemInfo("Environment",parentProp.getProperty("env"));
		}
		return report;
	}

}
