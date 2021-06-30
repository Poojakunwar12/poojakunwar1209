package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata1 {
	
	public String filedata() throws IOException
	{
		String data = null;
		File src=new File("C:\\Exceldata\\TestData.xlsx");
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		//int colcount=sheet1.getRow(1).getLastCellNum();
		System.out.println("Total number of row is "+rowcount);
		//System.out.println("Total number of row is "+colcount);
		for(int i=0;i<rowcount+1;i++)
		{
			
				data=sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println("Data is "+data);
				
		
	}
	
		
		wb.close();
		
		return data;
	}
	public String filedata1() throws IOException
	{
		String data1 = null;
		File src=new File("C:\\Exceldata\\TestData.xlsx");
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		//int colcount=sheet1.getRow(1).getLastCellNum();
		System.out.println("Total number of row is "+rowcount);
		//System.out.println("Total number of row is "+colcount);
		for(int i=0;i<rowcount+1;i++)
		{
			
				data1=sheet1.getRow(i).getCell(1).getStringCellValue();
				System.out.println("Data is "+data1);
				
		
	}
	
		
		wb.close();
		
		return data1;
	}
}
