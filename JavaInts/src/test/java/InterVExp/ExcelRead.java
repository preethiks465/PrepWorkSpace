package InterVExp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		int rowcount = 0;
		int colcount;
		FileInputStream fs = new FileInputStream("C:\\Users\\PreethikrishnaSankur\\Desktop\\JavaBooks.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fs);
		XSSFSheet wsheet = wbook.getSheetAt(0);
		Iterator<Row> rows = wsheet.rowIterator();
		while (rows.hasNext()) {
			Row row = rows.next();
			// colcount=0;
			Iterator<Cell> cells = row.cellIterator();
			while (cells.hasNext()) {
				Cell cell = cells.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				}

			}
		}

	}

}
