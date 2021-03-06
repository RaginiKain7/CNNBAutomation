package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EGHomePageTest {
	
	static WebDriver driver =null;
	
	@BeforeMethod
	public void setup() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.kerastase.com.eg/en/");
		
	}
	
	@Test(priority = 1)
	public void kerEGLogoTest()
	{
		boolean flag = false;
		flag = pageObject.HomePage.headerLogo(driver).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void kerEGTitleTest()
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Kerastase Egypt | Hair Treatments for all Hair Types");	
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
		
	}
	

}
