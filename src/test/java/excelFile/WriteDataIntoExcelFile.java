package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcelFile
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myTestSheet.xlsx");
		
		
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(144134);
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("c#");
		row2.createCell(1).setCellValue(144134);
		row2.createCell(2).setCellValue("playwright");
		
		book.write(file);
		book.close();
		file.close();
		
		
		
	}

}
