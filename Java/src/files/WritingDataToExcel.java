package files;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {
		File f;
		FileOutputStream fos;
		Sheet sh;
		Row row;
		Cell cell;
		
	    ///////////////////////////////////////
	    
	    int serial[]= new int[5];
	    for(int i=0;i<serial.length;i++)
	    {
	    	serial[i]=i+1;
	    }
	    ///////////////////////////////////////
	    
	    String name[]= new String[5];
	    name[0]="A";
	    name[1]="B";
	    name[2]="C";
	    name[3]="D";
	    name[4]="E";
	    ///////////////////////////////////////
	    
	    String result[]= new String[5];
	    result[0]="pass";
	    result[1]="pass";
	    result[2]="fail";
	    result[3]="pass";
	    result[4]="pass";	    
	    //////////////////////////////////////////
	    f= new File("C:\\Users\\saipadal\\Desktop\\karthik4.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook();
	    sh=wb.createSheet("Data");
	    /////////////////////////////////////////
	    
	    row=sh.createRow(0);
	    Cell cell0=row.createCell(0);
	    cell0.setCellValue("serial");
	    Cell cell1=row.createCell(1);
	    cell1.setCellValue("name");
	    Cell cell2=row.createCell(2);
	    cell2.setCellValue("result");
	    /////////////////////////////////////////
	    
	    for(int i=1;i<=serial.length;i++)
	    {
	    	row=sh.createRow(i);
	    	for(int j=0;j<3;j++)
	    	{
	    		cell=row.createCell(j);
	    		if(cell.getColumnIndex()==0)
		    	{
		    		cell.setCellValue(serial[i-1]);
		    	}
	    		else if(cell.getColumnIndex()==1)
	    		{
			    	cell.setCellValue(name[i-1]);
			    }
		       else if(cell.getColumnIndex()==2)
			    {
			    	cell.setCellValue(result[i-1]);
			    }
	    	}
	    	
	    	
	    }
	    fos = new FileOutputStream(f);
        wb.write(fos);
        fos.flush();
        fos.close();      
	    	    
	}

}


