package testdemo;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Application1 
{
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize the screen
	}

	@Test
	public void registerNewUser()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']"))).click();
		System.out.println(driver.getTitle()); // Get the title of the page
		driver.findElement(By.id("FirstName")).sendKeys("Naveen");
		driver.findElement(By.id("LastName")).sendKeys("Ravalavalasa");
	}
	
	@Test
	public void launchGoogle()
	{
		driver.get("https://www.google.com/");
	}

	@AfterClass
	public void tearDown() // close the browser
	{
		if (driver != null) // means my browser is open
		{
			driver.quit();
		}

	}

}
