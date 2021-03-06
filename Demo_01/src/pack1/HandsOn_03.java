package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HandsOn_03 
{
  @Test(dataProvider = "loginData")
  public void testLogin(String n, String s) 
  {
	  System.out.println("username is:" +n);
	  System.out.println("password is:" +s);
  }

  @DataProvider
  public Object[][] loginData()
  {
    return new Object[][] 
    {
      new Object[] { "uname1", "pswd1" },
      new Object[] { "uname2", "pswd2" },
      new Object[] { "uname3", "pswd3" },
    };
  }
}
