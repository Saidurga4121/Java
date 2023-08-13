package files;

import java.io.File;

public class Renaming {

	public static void main(String[] args) {
		File oldName = new File("C:\\Users\\saipadal\\Desktop\\Files2.txt");
	      File newName = new File("C:\\Users\\saipadal\\Desktop\\FilesRenamed.txt");
	      
	      if(oldName.renameTo(newName)) {
	         System.out.println("renamed");
	      } else {
	         System.out.println("Error");
	      }
		   

	}

}
