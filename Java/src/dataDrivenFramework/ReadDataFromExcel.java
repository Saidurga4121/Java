package dataDrivenFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//public class ReadDataFromExcel{
//	XSSFWorkbook wb;
//	XSSFSheet sh;
//		public ReadDataFromExcel(String excelfilePath) throws IOException
//		{
//				File f = new File("C:\\Users\\saipadal\\Desktop\\excel.xlsx");
//				FileInputStream fis = new FileInputStream(f);
//				wb = new XSSFWorkbook(fis);
//		}
//		public String getData(String sheetName, int row, int column)
//		{
//			sh = wb.getSheet(sheetName);
//			String data = sh.getRow(row).getCell(column).getStringCellValue();
//			return data;
//		} 
//		public int getRowCount(String sheetName)
//		{
//			int row = wb.getSheet(sheetName).getLastRowNum();
//			row = row + 1;
//			return row;
//	    }
}