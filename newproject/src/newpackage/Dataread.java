package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataread {

	public static void main(String[] args) throws IOException
	{
		File src=new File("C:\\Exceldata\\TestData.xlsx");
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from sheet " +data);
		wb.close();
	}
}
