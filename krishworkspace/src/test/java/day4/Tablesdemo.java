package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tablesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//no of rows
		int tablerows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(tablerows);
		
		//no of columns 
		int tablecolumns = driver.findElements(By.xpath("//table[@name='BookTable']//td")).size();
		System.out.println(tablecolumns);
		
		//specific value
		String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tbody//tr[3]//td[3]")).getText();
		System.out.println(value);
		
		//specifix bobok
		for(int i=1;i<=tablerows;i++)
		{
			String value2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+2+"]")).getText();
			System.out.println(value2);
		}
		
		//find totalprice 
		for(int i=1;i<=tablerows;i++)
		{
			String value2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+4+"]")).getText();
			int tot = Integer.parseInt(value2);
			int total=0;
			int tottal = tot+total;
		}
		//table[@name="BookTable"]//tbody//tr[5]//td[4]
		
		
		for(int i=1;i<=tablerows;i++) //i
		{
			for(int j=1;j<=tablecolumns;j++) //1
			{
				String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value1);
			}
			System.out.println(" ");
		}
		
	}

}
