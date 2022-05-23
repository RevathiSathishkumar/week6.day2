package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelDatas {
	
	
	public static String[][] readData(String excelfilename) throws IOException
	{
		//open the Excel sheet
		XSSFWorkbook book=new XSSFWorkbook("./TestData/"+excelfilename+".xlsx");
		System.out.println(book);
		// get the sheet where the date is available
		XSSFSheet sheetAt = book.getSheetAt(0);
		//get the row count
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println("RowCount:"+lastRowNum);
		//Get the column count
		XSSFRow row = sheetAt.getRow(0);
		short lastCellNum = row.getLastCellNum();
		System.out.println("lastCellNum:"+lastCellNum);
		
		//for storing and sending data to data provider ,creating 2D array
		
		String[][] data=new String[lastRowNum][lastCellNum];
		
		for(int i=1;i<=lastRowNum;i++)
		{
			//get each row out of the method
			XSSFRow row2 = sheetAt.getRow(i);
			
			for (int j=0;j<lastCellNum;j++)
			{
				XSSFCell cell = row2.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.print(stringCellValue+"\t");
				data[i-1][j]=stringCellValue;
				
			}
			System.out.println();
			
		}
		
		return data;
	}


}
