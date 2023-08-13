package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\saipadal\\Desktop\\today (2).xlsx");
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wb= new XSSFWorkbook(fis);
		
		Sheet sh=wb.getSheet("Sheet1");
		
		for(int i=0;i<=2;i++)
		{
			Row row= sh.getRow(i);
			
			for(int j=0;j<=3;j++)
			{
				Cell cell= row.getCell(j);
				CellType result=cell.getCellType();
				switch(result)
				{
				    case STRING: 
				    	System.out.print(cell.getStringCellValue());
				    	break;
				    case NUMERIC: 
				    	System.out.print(cell.getNumericCellValue());
				    	break;
				    case BOOLEAN: 
				    	System.out.print(cell.getBooleanCellValue());
				    	break;
			    }
				System.out.print("    ");
			}
			System.out.println();
			
		}
		
		//
		
		
		
		
		
		
		
	}

}
