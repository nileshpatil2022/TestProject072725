package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Testing Notes\\ExcelSheet\\ExcelSheetTest1.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		   int rowCount= sheet.getLastRowNum(); //5
		   
		   int cellCount= sheet.getRow(1).getLastCellNum(); //4
		    
		    
		    System.out.println(rowCount);
		    System.out.println(cellCount);
		    
		    for(int i=0; i<=rowCount; i++)
		    {
		      XSSFRow row=	sheet.getRow(i);
		    	
		    	for(int j=0; j<cellCount; j++)
		    	{
		    	 XSSFCell cell=  row.getCell(j);
		    	 System.out.print(cell.toString()+"\t");
		    	}
		    	System.out.println();
		    }
		    
		    book.close();
		    file.close();
		

	}

}
