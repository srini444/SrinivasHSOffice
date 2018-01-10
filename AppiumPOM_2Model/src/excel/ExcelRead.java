package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {

	public static  String[] [] readExcel(String filePath, String fileName, String sheetName) throws BiffException, IOException
	{
		File f = new File("E:/Selenium Online Class/Class21/POM_JXL/JXLTestsheet.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s =w.getSheet(sheetName);
		
		int rows = s.getRows();
		int columns = s.getColumns();
		
		String inputData [][] = new String [rows][columns];
		
		for (int i=0 ; i<rows ; i++) 
		{
			for (int j=0 ; j<columns ; j++) 
			{
				
				Cell c = s.getCell(j,i);
				inputData [i][j] = c.getContents();
			}
		}
		
		return inputData;
		

	}

}
