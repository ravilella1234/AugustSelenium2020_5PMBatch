package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");

		navigateUrl("amazonurl");
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		WebElement loc = driver.findElement(By.name("field-keywords"));
		loc.sendKeys("sony");
		Thread.sleep(3000);
		loc.clear();
		Thread.sleep(3000);
		loc.sendKeys("Harry Potter");
		
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		//driver.findElement(By.linkText("Computers")).click();
		
		//driver.findElement(By.partialLinkText("Computer")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}

}
