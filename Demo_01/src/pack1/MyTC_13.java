package pack1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyTC_13 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver,60);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='AboutUs']")));
	  WebElement E1 = driver.findElement(By.xpath("//span[text()='AboutUs']"));
	  Actions act1 = new Actions(driver);
	  act1.moveToElement(E1).build().perform();
	  WebElement E2 = driver.findElement(By.xpath("//span[contains (text( ),'Our')]"));
	  Actions act2 = new Actions(driver);
	  act1.moveToElement(E2).build().perform();
	  driver.findElement(By.xpath("//span[text() = 'Bangalore']")).click();
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
		Thread.sleep(5000);
	  driver.switchTo().frame(driver.findElement(By.name("main_page"))); 
	  String addr = driver.findElement(By.xpath("//div[@class='contact-info']")).getText();
	  System.out.println(addr);
	  
  }
}
