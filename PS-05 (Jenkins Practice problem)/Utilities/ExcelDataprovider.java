package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xls_dataprovider {
	
	static Workbook book;
	static Sheet sheet;
   
	public static String sheet_path = "D:\\Testngxlfile\\logintest.xlsx";
	
	public static Object[][] getTestData(String sheetName ) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = null;
		file =	new FileInputStream(sheet_path);
		
		book = WorkbookFactory.create(file);
		
		sheet = book.getSheet(sheetName);
		
		Object[][] inputdata = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				inputdata[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return inputdata;
		
	}

}
