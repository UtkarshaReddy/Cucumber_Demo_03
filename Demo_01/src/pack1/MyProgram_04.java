package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_04 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.xpath("//a[contains (text( ),'SignIn')]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mbczkhfs");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mnbvcxz");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
