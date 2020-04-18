package Cypto.Cypto;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private static String secretKey="secret";
	private static void modifyExistingWorkbook() throws InvalidFormatException, IOException {
		// Obtain a workbook from the excel file
	    Workbook workbook = WorkbookFactory.create(new File("D:\\programming explore\\user-details.xlsx"));
	    
	 // Get Sheet at index 0
	    Sheet sheet = workbook.getSheetAt(0);
	    
	    Iterator<Row> row= sheet.iterator();
	    if(row.hasNext()) {
            Row newRow=row.next();
	    	
	    	Iterator<Cell> cell=newRow.cellIterator();
	    	
	    	while(cell.hasNext()) {
	    		System.out.print(cell.next()+" ");
	    		System.out.print(cell.next());
	    	}
	    	System.out.println("");
	    }
	    while(row.hasNext()) {
	    		    	
	    	Row newRow=row.next();
	    	
	    	Iterator<Cell> cell=newRow.cellIterator();
	    	
	    	while(cell.hasNext()) {
	    		System.out.print(cell.next()+", ");
	    		System.out.print(AES.decrypt(cell.next().toString(),secretKey));
	    	}
	    	System.out.println("");
	    }
	}
	
	public static void main(String ar[]) throws InvalidFormatException, IOException {
		modifyExistingWorkbook();
	}
}
