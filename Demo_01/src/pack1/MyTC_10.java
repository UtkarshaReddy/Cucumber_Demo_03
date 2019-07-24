package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTC_10 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	  Thread.sleep(10000);
	  String S=driver.switchTo().alert().getText();
	  System.out.println(S);
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
  }
}
