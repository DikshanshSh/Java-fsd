package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.testBaseclass;

public class Homepagedemo extends testBaseclass{
	
	
	Actions a = new Actions(driver);
	
	@FindBy(linkText = "Log in")
	WebElement login;
	
	public Homepagedemo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);	
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	
}
