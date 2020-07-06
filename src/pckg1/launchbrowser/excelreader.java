package pckg1.launchbrowser;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelreader {


	public static String[][] getSheet(String sheetname) {

		String[][] data = null ;
		

		try {
			FileInputStream fis = new FileInputStream(sheetname);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			System.out.println(rowCount);

			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println(columnCount);
			
		
			
			
			
			/*data = new String[rowCount][columnCount];
			XSSFRow row1 = sheet.getRow(1);
			String ss = row1.getCell(1).getStringCellValue();
			System.out.println(ss +"   dummy");*/

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {

							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
								System.out.print(cellValue +"   ");
							}catch(NullPointerException e){

							}
							//data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();

			}
			fis.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public static void main(String[] args) {
		excelreader r = new excelreader();
		r.getSheet("./data/yuvaraj.xlsx");
	}
}



