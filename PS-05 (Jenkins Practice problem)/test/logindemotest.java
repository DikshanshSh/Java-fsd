package test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.testBaseclass;
import pages.Homepagedemo;
import pages.loginpagedemo;
import utilities.MyListener;
import utilities.Xls_dataprovider;



@Listeners(value= {MyListener.class})
public class logindemotest extends testBaseclass {
	
	Homepagedemo Lp;
	loginpagedemo xp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			Lp = new Homepagedemo(driver);
			xp = new loginpagedemo(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		@Test(priority='1', dataProvider="testdata")
		public void testregisterUser(String EmailID,String passkey) throws InterruptedException
		{
			Lp.clickonlogin();
			xp.Loginuser(EmailID,passkey);
			//xp.clicklogin();
		}

		@DataProvider(name="testdata")
		public Object[][] datasupplier() throws EncryptedDocumentException, IOException
		{
			
			Object[] [] input = Xls_dataprovider.getTestData("Sheet1");
			return input;
			
		}
	}
