package pckg1.launchbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDhana {
	
	public static String[][]datasheet() throws IOException {
		String[][] dd = null;
		
		FileInputStream data = new FileInputStream(".\\data\\dhana.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(data);
		XSSFSheet ds = book.getSheetAt(0);
		
		int lastrw = ds.getLastRowNum();
		
		System.out.println(lastrw);
		
		int lastcell = ds.getRow(0).getLastCellNum();
		System.out.println(lastcell);
		
		for (int j = 0; j < lastrw; j++) {
			XSSFRow yurow = ds.getRow(j);
		
		for (int i = 0; i < lastcell; i++) {
			String cellvalu = yurow.getCell(i).getStringCellValue();
			System.out.print(cellvalu + " ");	
		}
		System.out.println();
		}
		
		return dd;
	}
	
	public static void main(String[] args) throws IOException {
		ExcelDhana dd = new ExcelDhana();
		dd.datasheet();
	}

}
