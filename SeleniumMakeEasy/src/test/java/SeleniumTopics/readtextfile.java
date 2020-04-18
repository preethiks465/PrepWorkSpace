package SeleniumTopics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class readtextfile {

	public static void main(String[] args) throws IOException {
		/*
		 * FileReader fr = new
		 * FileReader("C:\\Users\\PreethikrishnaSankur\\Desktop\\Read.txt"); int i = 0;
		 * while ((i = fr.read()) != -1) { System.out.print((char)i);
		 * 
		 * }
		 */
		
		 FileWriter fw = new FileWriter("C:\\Users\\PreethikrishnaSankur\\Desktop\\oceans.txt",true);
	        PrintWriter out = new PrintWriter(fw);

	        // Append the name of ocean to the file
	        out.println("Southern");

	        // Close the file.
	        out.close();
	}

}
