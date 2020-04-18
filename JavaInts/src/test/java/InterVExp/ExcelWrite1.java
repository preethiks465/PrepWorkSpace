package InterVExp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		int rowcount = 0;
		int colcount;
		Object[][] javabooks = { { "book1", "author1", 123 }, { "book2", "author2", 456 } };
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet wsheet = wbook.createSheet();
		Row Header = wsheet.createRow(0);
		Header.createCell(0).setCellValue("BookName");
		Header.createCell(1).setCellValue("AuthorName");
		Header.createCell(2).setCellValue("Price");
		for (Object[] books : javabooks) {
			Row row = wsheet.createRow(++rowcount);
			colcount = 0;
			for (Object b : books) {
				Cell cell = row.createCell(colcount++);
				if (b instanceof String) {
					cell.setCellValue((String) b);
				} else if (b instanceof Integer) {
					cell.setCellValue((Integer) b);
				}
			}
		}
		FileOutputStream fout = new FileOutputStream("C:\\Users\\PreethikrishnaSankur\\Desktop\\bees.xlsx");
		wbook.write(fout);
	}

}
