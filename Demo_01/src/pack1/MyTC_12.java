package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyTC_12 
{
  @Test
  public void f() 
  {
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("");
	  driver.manage().window().maximize();
	  WebElement E1 = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions act1 = new Actions(driver);
	  act1.moveToElement(E1).build().perform();
  }
}
