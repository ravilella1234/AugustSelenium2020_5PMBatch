package pom;

import org.testng.annotations.Test;

import com.project.September5PMMavenProject.BaseTest;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
  
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  init();
	  launch("chromebrowser");
	  navigateUrl("automationurl");
  }
  
  
  @Test
  public void login() 
  {
	  LoginPage page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals("Authentication failed.", page.getActualError());
  }

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
