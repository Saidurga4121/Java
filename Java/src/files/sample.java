package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileOutputStream fos;
		Workbook wb;
		Sheet sh;
		Row row;
		Cell cell;
		///////////////////////////////////
		
		File f =new File("C:\\Users\\saipadal\\Desktop\\today1.xlsx");
		wb= new XSSFWorkbook();
		sh= wb.createSheet("Login");
		
		/////////////////////////////////////
		int SerialNo[]= new int[4];
		for(int i=0;i< 4;i++)
		{
			SerialNo[i]= i+1;
		}
		///////////////////////////////////////
		String userName[]= new String[4];
		userName[0]="A";
		userName[1]="B";
		userName[2]="C";
		userName[3]="D";
		//////////////////////////////////////
		String passWord[]= new String[4];
		passWord[0]="World@01";
		passWord[1]="World@02";
		passWord[2]="World@03";
		passWord[3]="World@04";
		/////////////////////////////////////
		row= sh.createRow(0);
		Cell cell0= row.createCell(0);
		cell0.setCellValue("SerialNo");
		Cell cell1= row.createCell(1);
		cell1.setCellValue("UserName");
		Cell cell2= row.createCell(2);
		cell2.setCellValue("Password");
		/////////////////////////////////////
		for(int i=1;i<5;i++)
		{
		    row= sh.createRow(i);
		    for(int j=0;j<3;j++)
		    {
		       cell=row.createCell(j);
		       if(cell.getColumnIndex()==0)
		       {
		    	   cell.setCellValue(SerialNo[i-1]);
		       }
		       else if(cell.getColumnIndex()==1)
		       {
		    	   cell.setCellValue(userName[i-1]);
		       }
		       else if(cell.getColumnIndex()==2)
		       {
		    	   cell.setCellValue(passWord[i-1]);
		       }
		    }
		}
		fos = new FileOutputStream(f);
	        wb.write(fos);
	        fos.flush();
	        fos.close(); 
	        
	        
	        
	    //////////////////////////////////////////////////
		
		
		
		
		
		
	}

}
