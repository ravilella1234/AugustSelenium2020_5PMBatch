package screenshots;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.selenium.BaseTest;

public class Screenshot5 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
			   String linkname=links.get(i).getText();
			   Date dt = new Date();
			   String d = dt.toString().replace(':', '_').replace(' ','_');
			   
			   links.get(i).click();
			   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileHandler.copy(srcFile,new File("C:\\Users\\DELL\\Desktop\\Screenshots1234\\"+linkname+"_"+d+".jpeg"));
			   driver.navigate().back();
			   Thread.sleep(3000);
			  links=driver.findElements(By.tagName("a"));
		    }
		}

	}

}
