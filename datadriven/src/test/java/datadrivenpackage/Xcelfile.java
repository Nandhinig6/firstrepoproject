package datadrivenpackage;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Xcelfile {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	 driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider="logindata")
	public void action(String Username, String Password, String Status)
	{
		  System.out.println("Testing with: " + Username + " / " + Password + " / " + Status);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean acttext=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		System.out.println(acttext);
		
		if(Status.equalsIgnoreCase("Valid"))
		{
			if(acttext==true)
			{
				driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(Status.equalsIgnoreCase("InValid"))
		{
			if(acttext==true)
			{
				driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}}
		
	
		
	@DataProvider(name="logindata")
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
			for (int c=0;c<columncount;c++) //1 to 3
			{
				XSSFCell cell=row.getCell(c);
				//1,1 2 3 4 5 6 
				data[i-1][c]= (cell != null)? cell.toString() : "";
				//cell.toString();
			}
		}
		workbook.close(); // Close resources
	    file.close();
		return data;
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}


