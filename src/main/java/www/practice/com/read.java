package www.practice.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C://Users//TMARNE//Downloads//TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet  sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		

		System.out.println(rowcount);
		
		
		for(int i=0;i<rowcount+1;i++)
		{
			Row row = sheet1.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+" ");
			}
			
			System.out.println();
		}
		wb.close();
		
	}

}
