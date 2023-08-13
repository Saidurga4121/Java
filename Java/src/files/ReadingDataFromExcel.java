package files;

import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		File f= new File("C:\\Users\\saipadal\\Desktop\\today (2).xlsx");
		
		
		FileInputStream fis= new FileInputStream(f);

		Workbook wb= new XSSFWorkbook(fis);
		Sheet sh= wb.getSheet("Sheet1");

		Row ro = sh.getRow(0);
		Cell ce = ro.getCell(1);
		String data = ce.getStringCellValue();
		System.out.println(data);
		}
		
		
	}

 
