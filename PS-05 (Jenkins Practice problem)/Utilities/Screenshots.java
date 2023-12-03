package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.testBaseclass;

public class Screenshots extends testBaseclass {
	
	public String takescreenshots() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String path = "D:\\Testngxlfile\\Screenshot"+System.currentTimeMillis()+".png";
        File target = new File(path);
        FileUtils.copyFile(source, target);
        String targetPath = target.getAbsolutePath();
        return targetPath;
	
	
	}

}
