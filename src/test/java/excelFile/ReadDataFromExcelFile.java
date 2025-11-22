package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testData//ExcelSheetTest1.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int totalRowCount=sheet.getLastRowNum();
		
		int totalCellCount=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		
		for(int i=0; i<totalRowCount; i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<totalCellCount; j++)
			{
			  XSSFCell cell=	row.getCell(j);
			  System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		book.close();
		file.close();
		                
		
	}

}
