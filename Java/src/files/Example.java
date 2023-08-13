package files;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example {
	public static void main(String[] args) throws IOException, InvalidFormatException  {
		File f= new File("C:\\Users\\saipadal\\Desktop\\today.xlsx");
		Workbook wb= new XSSFWorkbook(f);
		
		
		Iterator<Sheet> sh= wb.iterator();
		while(sh.hasNext())
		{
			Sheet sheet=sh.next();
			System.out.println(sheet.getSheetName());
			System.out.println("*****************");
			
			Iterator<Row> row = sheet.iterator();
			while(row.hasNext())
			{
				Row r=row.next();   // 0 th row
				
				Iterator<Cell> cell= r.iterator();
				while(cell.hasNext())
				{
					Cell c=cell.next();   // 0 th column
					System.out.print(c+"         ");
				}
				System.out.println();
			}
		}
		
		
		

}
}

