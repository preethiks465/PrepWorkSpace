package Cypto.Cypto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	private static String[] columns = {"Name", "Password"};
    private static List<UserLoginDetail> users =  new ArrayList<>();
    private static String secretKey="secret";
 // Initializing employees data to insert into the excel file
    static {
    
    	users.add(new UserLoginDetail("Korish Chella", "korish"));
    	users.add(new UserLoginDetail("preethi", "preethi"));
    	users.add(new UserLoginDetail("abc", "abc123"));

    }
    
    public static void main(String ar[]) throws IOException,InvalidFormatException {
    	// Create a Workbook
        Workbook workbook = new XSSFWorkbook(); 
        
        /* CreationHelper helps us create instances of various things like DataFormat, 
        Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();
        
     // Create a Sheet
        Sheet sheet = workbook.createSheet("User");
        
     // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());
        
        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        
     // Create a Row
        Row headerRow = sheet.createRow(0);
        
     // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        
        int rowNum = 1;
        for(UserLoginDetail user: users) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(user.getName());
            
            row.createCell(1)
            .setCellValue( AES.encrypt(user.getPassword(), secretKey));
           
           /* row.createCell(1)
                    .setCellValue(user.getPassword());*/
        }
        
     // Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("D:\\programming explore\\user-details.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        
     // Closing the workbook
        workbook.close();
        
    }
    
}
