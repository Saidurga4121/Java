package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class writeToExcel {

	public static void main(String[] args) throws IOException {
		File f;
		FileOutputStream fos;
		Sheet sh;
		Row row;
		Cell cell;
		
		f= new File("C:\\Users\\saipadal\\Desktop\\karthik4.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook();
	    
	    Object empData[][]= {  {"SNO", "Username" , "Password" },
	     
	                           {1,     "saipadala", "World@01" },
	                         
	                           {2,     "sidama" ,   "World@03" },
	                           
	                           {3,     "rissac" ,   "World@04" },

	                      };
	    
	    sh=wb.createSheet("Data");
	    for(int i=0;i<=3;i++)
	    {
		    row=sh.createRow(i);
		    for(int j=0;j<=2;j++)
		    {
		    	 cell=row.createCell(j);
		    	 
		    	 Object value=empData[i][j];
		    	 
		    	 if( value instanceof String)
				     cell.setCellValue((String)value);
		    	 if( value instanceof Integer)
				     cell.setCellValue((Integer)value);
		    	 if( value instanceof Boolean)
				     cell.setCellValue((Boolean)value);
		    	 
		    	 
		    }
		   
	    }
	    fos = new FileOutputStream(f);
        wb.write(fos);
        fos.flush();
        fos.close();
        
        System.out.println("sucess");

}
}
