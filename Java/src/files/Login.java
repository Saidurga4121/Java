package files;
import java.io.*;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Login {

	public static void main(String[] args) throws IOException {
		File f;
		FileOutputStream fos;
		FileInputStream fis;
		Sheet sh;
		Row row;
		Cell cell;
		/////////////////////////////////////////////////////////
		
		f = new File("C:\\Users\\saipadal\\Desktop\\CreateExcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		sh=wb.createSheet("login");
		
		//////////////////////////////////////////////////////////
		int serial[]= new int[4];
		for(int i=0;i<serial.length;i++)
		{
			serial[i]=i+1;
		}
		///////////////////////////////////////////////////////////
		String userName[]= new String[4];
		userName[0]="saipadal";
		userName[1]="sidama";
		userName[2]="kkovvuri";
		userName[3]="rissac";
		///////////////////////////////////////////////////////////
		String passWord[]= new String[4];
		passWord[0]="System@01";
		passWord[1]="System@02";
		passWord[2]="System@03";
		passWord[3]="System@04";
		////////////////////////////////////////////////////////////
		String status[]= new String[4];
		status[0]="Logged in";
		status[1]="Logged off";
		status[2]="Logged off";
		status[3]="Logged in";
		////////////////////////////////////////////////////////////
		row=sh.createRow(0);
		Cell cell0=row.createCell(0);
		cell0.setCellValue("Serial No");
		Cell cell1=row.createCell(1);
		cell1.setCellValue("UserName");
		Cell cell2=row.createCell(2);
		cell2.setCellValue("Password");
		Cell cell3=row.createCell(3);
		cell3.setCellValue("Status");
		////////////////////////////////////////////////////////////
        for(int i=1;i<=serial.length;i++)
        {
        	row=sh.createRow(i);
        	for(int j=0;j<4;j++)
        	{
            	cell=row.createCell(j);
            	if(cell.getColumnIndex()==0)
            	{
            		cell.setCellValue(serial[i-1]);
            	}
            	if(cell.getColumnIndex()==1)
            	{
            		cell.setCellValue(userName[i-1]);
            	}
            	if(cell.getColumnIndex()==2)
            	{
            		cell.setCellValue(passWord[i-1]);
            	}
            	if(cell.getColumnIndex()==3)
            	{
            		cell.setCellValue(status[i-1]);
            	}

        	}
        	
        }
        
        
        fos = new FileOutputStream(f);
        wb.write(fos);
        fos.flush();
        fos.close(); 
       /////////////////////////////////////////////////////////////////
       
       fis= new FileInputStream(f);
       wb= new XSSFWorkbook(fis);
       /////////////////////////////////////////////////////////////////
       Iterator<Sheet> sh1= wb.iterator();
		while(sh1.hasNext())
		{
			Sheet sheet=sh1.next();
			System.out.println(sheet.getSheetName());
			System.out.println("*****************");
			
			Iterator<Row> row1 = sheet.iterator();
			while(row1.hasNext())
			{
				Row r=row1.next();   // 0 th row
				
				Iterator<Cell> cell4= r.iterator();
				while(cell4.hasNext())
				{
					Cell c=cell4.next();   // 0 th column
					System.out.print(c+"         ");
				}
				System.out.println();
			}
		}
       
       

	}

}
