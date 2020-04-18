package ExtentReportUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile 
{
    public static void copyFileFromReports()
    {	
    	FileInputStream instream = null;
	FileOutputStream outstream = null;
 
    	try{
    		String fileName=ExtentReportManager.fileName1();
    	    File infile =new File(fileName);
    	    File outfile =new File("TestReport.html");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }
}