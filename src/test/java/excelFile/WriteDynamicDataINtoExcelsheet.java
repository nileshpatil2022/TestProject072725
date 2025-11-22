package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicDataINtoExcelsheet 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"//testdata//DynamicDatasheet.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet= book.createSheet("DynamicSheet");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows? ");
		int noOfRows=sc.nextInt();
		System.out.println("How many cells? ");
		int noOfCell=sc.nextInt();
		
		for(int i=0; i<noOfRows; i++)
		{
			XSSFRow rows=sheet.createRow(i);
			
			for(int j=0; j<noOfCell; j++)
			{
			  XSSFCell cell=	rows.createCell(j);
			  cell.setCellValue(sc.next());
				
			}
		}
		
		book.write(file);
		book.close();
		file.close();
		
	}

}
