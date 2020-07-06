package pckg1.launchbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("sheet001");

		Object[][] completedata = {  {"vipin","80"},{"yuvaraj","75"},{"ashok","79"}  };

		int rowcount =0;
		for (Object[] onebyonedata : completedata)
		{
			XSSFRow row = sheet.createRow(rowcount++);

			int colcount=0;
			for (Object cellvalue : onebyonedata) 
			{
				XSSFCell createCell = row.createCell(colcount++);
				createCell.setCellValue( (String) cellvalue);
			}
		}

		FileOutputStream op = new FileOutputStream("./data/NewExcelSheet.xlsx");
		wb.write(op);
		op.close();


	}

}
