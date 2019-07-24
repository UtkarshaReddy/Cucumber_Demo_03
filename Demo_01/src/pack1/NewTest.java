package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest 
{
  @Test(dataProvider = "dp")
  public void f(String n, String s)
  {
	 System.out.println("uname:" +n); 
	 System.out.println("pswd:" +s); 
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "demo1" , "demo1" },
      new Object[] { "demo2" , "demo2" },
      new Object[] { "demo3" , "demo3" },
    };
  }
  @AfterMethod
  public void Logout()
  {
	  System.out.println("after qa testing");
  }
  @BeforeMethod
  public void login()
  {
	  System.out.println("before qa testing");
  }
  
}
