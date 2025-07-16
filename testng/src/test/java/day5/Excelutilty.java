package day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelutilty {
	
	WebDriver driver;
	
	    @BeforeClass
		void start()
		{
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		}
		
		@Test(dataProvider="registerdata")
		public void action(String fname, String lname,String email,String telephone, String pwd, String cpwd)
		{
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(cpwd);
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String acttext = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		if(acttext.equals("Your Account Has Been Created!"))
		{
			System.out.println("both are equal");
		}
		
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
			driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
			
		}
		
		
		@AfterClass
		void close()
		{
			driver.close();
		}
		
	
	@DataProvider(name="registerdata")
    public Object[][] register() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\logindata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//rows
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		//column
		int columncount=sheet.getRow(1).getLastCellNum();
		System.out.println(columncount);
		
		Object data[][]= new Object[rows][columncount];
		for(int i=1;i<=rows;i++) //1 //2 //3
		
		{
			XSSFRow row=sheet.getRow(i); //1
			for (int c=1;c<=columncount;c++) //1 to 6
			{
				XSSFCell cell=row.getCell(c);//1,1 2 3 4 5 6 
				cell.toString();
			}
		}

		return data;
	}
}


