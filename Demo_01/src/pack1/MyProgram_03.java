package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_03
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(30000);  
		driver.manage().window().maximize();
		//
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
	    driver.findElement(By.linkText("REGISTER")).click();
		WebElement fname = driver.findElement(By.name("firstName"));
		WebElement lname = driver.findElement(By.name("lastName"));
		WebElement phone = driver.findElement(By.name("phone"));
		WebElement uname1 = driver.findElement(By.name("userName"));
		WebElement add1 = driver.findElement(By.name("address1"));
		WebElement add2 = driver.findElement(By.name("address2"));
		WebElement city = driver.findElement(By.name("city"));
		WebElement state = driver.findElement(By.name("state"));
		WebElement code = driver.findElement(By.name("postalCode"));
		WebElement country = driver.findElement(By.name("country"));
		WebElement uname2 = driver.findElement(By.name("email"));
		WebElement pswd = driver.findElement(By.name("password"));
		WebElement cpswd = driver.findElement(By.name("confirmPassword"));
		WebElement reg2 = driver.findElement(By.name("register"));
		Thread.sleep(5000);
		fname.sendKeys("qwerty");
		lname.sendKeys("asdfgh");
		phone.sendKeys("9999090909");
		uname1.sendKeys("qwerty@gmail.com");
		add1.sendKeys("Balaji nagar");
		add2.sendKeys("kukatpally");
		city.sendKeys("Hyderabad");
		state.sendKeys("Telangana");
		code.sendKeys("500072");
		Select Sel1 = new Select(country);
		Sel1.selectByVisibleText("GERMANY");
		//Sel1.selectByValue(242);
		uname2.sendKeys("passwordpassword");
		pswd.sendKeys("password");
		cpswd.sendKeys("password");
		reg2.click();
		driver.close();

	}

}
