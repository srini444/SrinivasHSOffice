package excelobjects;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
	
	//readExcel method will return string type array
	public static String[][] readExcel(String filePath, String fileName,String sheetName) throws BiffException, IOException
	{
		
		File f = new File("E:/Selenium Online Class/Class21/POM_JXL/JXLTestsheet.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(sheetName);
		int rows = s.getRows();
		System.out.println(rows);
		int columns = s.getColumns();
		System.out.println(columns);
		
		String inputdata [][] = new String[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				Cell c = s.getCell(j,i);
				inputdata [i][j] = c.getContents();
				//System.out.println(inputdata [i][j]);
				
				
			}
		}
		return inputdata;
		
		
	}
	
}


