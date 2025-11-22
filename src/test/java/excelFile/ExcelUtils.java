package excelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static int getRowCount(String xlFile,String xlSheet) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		int rowCount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;
		
	}
	
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
	int cellCount=ws.getRow(rowNum).getLastCellNum();
	return cellCount;
	}
	
	public static String getData(String xlFile, String xlSheet, int rowNoum, int cellNum) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=   ws.getRow(rowNoum);
		cell=  row.getCell(cellNum);
		
		String data;
		
		try {
			data =cell.toString();
		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;	
	}
	
	
	
	
	
	
	
	
	

}
