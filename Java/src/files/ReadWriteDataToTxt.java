package files;

import java.io.*;

public class ReadWriteDataToTxt {
	static File f1;
	static FileWriter fw;
	static BufferedWriter bw;
	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\saipadal\\Desktop\\File2.txt");
		if(f.exists())
		{
			System.out.println("file already exists");
		}
		else
		{
			if(f.createNewFile())
			{
				System.out.println("created new file");
			}
		}
		fw=new FileWriter(f); // write in the text file
		fw.write("firstLine");
		fw.flush();
		//
        // fw=new FileWriter(f,true); // uses to append in the existing text file
        // fw.append("typing the second line");
		// fw.flush();
		//
		bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("typing the thrid line in the new line");
		bw.flush();
		// Reading the lines of code
		fr=new FileReader(f);
		int c;
		while((c=fr.read())!=-1)  
		{
		System.out.print((char)(c));
		  
		System.out.println();
		// Reading the data from console
		InputStreamReader r=new InputStreamReader(System.in);  
		System.out.println("enter name");
		br=new BufferedReader(r);
		String name=br.readLine();
		System.out.println((char)(c)+" "+name);
		
		}
		
		

		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
