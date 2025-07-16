package practiseflow;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\register.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		int totalcells=sheet.getRow(1).getLastCellNum();
		System.out.println(totalcells);
		
		for(int i=1;i<=rows;i++) //1 //2 //3
		{
			XSSFRow row=sheet.getRow(i); //1
			for (int c=1;c<=totalcells;c++) //1 to 6
			{
				XSSFCell cell=row.getCell(c);  //1 //1
				System.out.println(cell.toString());
			}
		}
	
		workbook.close();
		file.close();
		

	}

}
