package pckg1.launchbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {


	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream ff =new FileInputStream("./data/MayBatch.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ff);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcount" +rowcount);

		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("colcount  " +colcount);

		XSSFCell cell = sheet.getRow(3).getCell(1);	
		String cellvalue = cell.getStringCellValue();
		//System.out.println(cellvalue);


		XSSFCell cell2 = sheet.getRow(7).getCell(1);
		String result = cell2.getStringCellValue();
		//System.out.println(result);

		for (int i = 0; i <= rowcount; i++) 
		{
			for (int j = 0; j < colcount; j++) {


				XSSFCell cell3 = sheet.getRow(i).getCell(j);	
				String cellvalue3 = cell3.getStringCellValue();
				System.out.print(cellvalue3  +"	");
			}
			
			System.out.println();
		}


	}

}
