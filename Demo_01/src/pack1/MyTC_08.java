package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTC_08 
{
  @Test
  public void f() throws InterruptedException
  {
	    WebDriver driver;
	    System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href = '/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm']")).click();
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
		driver.findElement(By.xpath("")).click();
		String actual_text = driver.findElement(By.xpath("//li[text()='Attractive interest rates ']")).getText();
		String expected_text = "Attractive interest rates";
		Assert.assertEquals(actual_text,expected_text);
		System.out.println("text found");
		
  }
}
