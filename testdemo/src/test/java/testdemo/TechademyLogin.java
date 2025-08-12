package testdemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TechademyLogin 
{
	WebDriver driver;
	
	@BeforeClass
	public void browserLaunch()
	{
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTechademy() 
	{
        driver.get("https://u12856613.ct.sendgrid.net/ls/click?upn=u001.Zf645-2BU4MQ9qO6g9WuT4qmaS9IILYMdjC-2BIrEfnX3-2FZvrDl-2BAk-2F3vY1zP0I5Sqntgut5_t4iQ1lP5UEDYh4TjwO9o5CFYGUkeKwl-2Fsvl1NvbHxYS9hhNM2aBLJPSJe0vR-2BvtUti1FVbpHbEvpWjDXzvIethB-2BdQ2pNiUlwQSCFYgs7UAQquIKE65YOr3z3ZjDZa-2BsH5iPmzezE7ulXScuQ0oTmKRscHtqjXMbfJtKBa-2BqmZLwAwJqR0QvM8glCNKrExPQWzeYhVKsKWE3xyTGLbgI8ibvPbZA23p0oXyZRnTu7as-3D");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']"))).sendKeys("ravalavalasanaveen5@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("Naveen@1503");
		
		// Click Login Button
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
