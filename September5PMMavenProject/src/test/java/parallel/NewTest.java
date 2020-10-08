package parallel;

import org.testng.annotations.Test;

public class NewTest 
{
  @Test
  public void test1() 
  {
	  System.out.println("iam test1 " +Thread.currentThread().getId());
  }
  
  
  @Test
  public void test2() 
  {
	  System.out.println("iam test2 "+ Thread.currentThread().getId());
  }
  
}
