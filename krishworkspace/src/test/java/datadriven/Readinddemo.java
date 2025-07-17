package datadriven;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readinddemo {

	public static void main(String[] args) throws IOException {
		       FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\Books.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				
				XSSFSheet sheet=workbook.getSheet("Sheet1");
				int rows = sheet.getLastRowNum();
				System.out.println(rows);
				int totalcells=sheet.getRow(1).getLastCellNum();
				System.out.println(totalcells);
				
				workbook.close();
				
				}

		}

