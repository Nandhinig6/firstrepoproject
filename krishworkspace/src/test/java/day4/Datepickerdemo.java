package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Datepickerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
///
//find number of rows
		/*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
		int sizes = rows.size();
		System.out.println(sizes);
	
		
		//find number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='productTable']//thead//tr"));
		int columns1 = rows.size();
		System.out.println(columns1);
		
		//totalpages
		int totalpages=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
	  System.out.println(totalpages);*/
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/10/1997");
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s=new Select(month);
		s.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("2015");
		
	  driver.findElement(By.xpath("//a[normalize-space()='13']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='start-date']")).click();
	  String year1="2024";
	  String Month1="May";
	  String date1="23";
	  
		
		
	}
	

}
