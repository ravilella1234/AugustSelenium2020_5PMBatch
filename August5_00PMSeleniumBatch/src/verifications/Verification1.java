package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//String actualLink = driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).getText();
		String actualLink = driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).getAttribute("innerHTML");
		String expectedLink = "New Release";
		
		System.out.println("Actual Link : " + actualLink);
		System.out.println("Expected Link :" + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
		{
			System.out.println("both links are equal...");
		}
		else
		{
			System.out.println("both links are not equal...");
		}
	}

}
