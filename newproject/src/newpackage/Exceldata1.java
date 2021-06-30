package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata1 {
	public static void main(String[] args) throws IOException
	{
		File src=new File("C:\\Exceldata\\TestData.xlsx");
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total number of row is "+rowcount);
		for(int i=0;i<rowcount+1;i++)
		{
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data is "+data);
		}
		wb.close();
	}
}
