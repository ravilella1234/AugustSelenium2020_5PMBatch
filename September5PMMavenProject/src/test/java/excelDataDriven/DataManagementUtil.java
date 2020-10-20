package excelDataDriven;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.September5PMMavenProject.BaseTest;

public class DataManagementUtil extends BaseTest
{
  @Test(dataProvider = "getData")
  public void testCase(Hashtable<String, String> data) 
  {
	  
  }
 
  @DataProvider
  public Object[][] getData() throws Exception
  {
	  
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  sheetName = "Data";
	  testName = "TestA";
	  return DataUtils.getTestData(e, sheetName, testName);
	  
  }
  
  
}
