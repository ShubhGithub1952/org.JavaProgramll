package interviewTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheetTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fin = new FileInputStream(".\\src\\test\\resources\\ICCRankingData.xlsx");
		Workbook workbook = WorkbookFactory.create(fin);
		Sheet sheet = workbook.getSheet("TeamRanking");
		int lastRow = sheet.getLastRowNum();
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <= row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				DataFormatter dataformat = new DataFormatter();
				String data1 = dataformat.formatCellValue(cell);
				System.out.print(data1+"    ");
			}
			System.out.println();
		}
	}
}
