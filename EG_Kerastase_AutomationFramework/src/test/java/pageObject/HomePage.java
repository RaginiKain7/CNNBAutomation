package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement headerLogo(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//strong[@class='logo']"));
		return element;
		
	}
	
	public static WebElement headerCountrychanger(WebDriver driver)
	{
		element = driver.findElement(By.xpath(""));
		return element;
		
	}
	
	public static WebElement headerLanguagechanger(WebDriver driver)
	{
		element = driver.findElement(By.xpath(""));
		return element;
		
	}
}
