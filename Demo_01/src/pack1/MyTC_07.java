package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MyTC_07 
{
  @Test
  public void sbi() throws InterruptedException
  {
	WebDriver driver; 
	System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	Thread.sleep(10000);
	
	//displays parent window id or the current window id
	
	String id = driver.getWindowHandle();
	System.out.println(id);
	Set<String> T_windows = driver.getWindowHandles();
	int count = T_windows.size();
	System.out.println(count); 
	for (String S:T_windows)
	{
		driver.switchTo().window(S);
		System.out.println(driver.getWindowHandle());	
	}
	driver.findElement(By.linkText("Apply Now")).click();
  }
}
