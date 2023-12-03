package test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import BaseClass.testBaseclass;
import pages.Homepagedemo;

public class Homepagetest extends testBaseclass{
	
Homepagedemo Lp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		Lp = new Homepagedemo(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		Lp.gettitle();
	}
	
	@Test(priority='2')
	public void testRegisterLink()
	{
		Lp.clickonlogin();  // click on login
		Lp.gettitle();  // get title
	}

}
