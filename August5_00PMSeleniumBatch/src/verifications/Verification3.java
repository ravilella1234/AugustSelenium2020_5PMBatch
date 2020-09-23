package verifications;

import com.relevantcodes.extentreports.LogStatus;
import com.selenium.BaseTest;

public class Verification3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("Verification3");
		test.log(LogStatus.INFO, "Initilizing properties files....");
				
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launching browser :- " + dp.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl") );
		
		//String actualLink = driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).getAttribute("innerHTML");
		String expectedLink = "New Release";

		if(!isLinkEqual(expectedLink))
		{
			reportFailure("Both links are not equal...");
		}	
		else
		{
			reportSuccess("Both links are equal...");
		}
			
		
		
		report.endTest(test);
		report.flush();
	}

	

}
