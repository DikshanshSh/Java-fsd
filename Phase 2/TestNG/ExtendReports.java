package com.app.TestNGscripts;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeetupcheckExtendreport {
	
	@Test
	public void extentDemo2() throws IOException
	{
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush(); 
		
		// automatically open the report for you on your desktop browser
		
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}
	

}
