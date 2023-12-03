package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagedemo {
	
	@FindBy(xpath="//input[@class='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbutton;
	@FindBy(xpath="//input[@class='ico-logout']")
	WebElement logoutbutton;
	
	public loginpagedemo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Loginuser(String EmailID,String passkey) throws InterruptedException {
		
		//Email.clear();
		Email.sendKeys(EmailID);
		//password.clear();
		password.sendKeys(passkey);
		loginbutton.click();
		
	}

}
