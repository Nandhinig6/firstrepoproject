package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dtdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int columns = driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
         System.out.println(columns);

 		int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
          System.out.println(rows);
         
          //specific element
          String bb=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[2]//td[2]")).getText();
         System.out.println(bb);
         
         
         //for loop
         for(int i=1;i<=rows;i++)
         {
        	 for(int j=1;j<=columns;j++)
        	 {
        		WebElement ty= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td["+j+"]"));
        		System.out.print(ty.getText());
        		driver.findElement(By.xpath("//td//input[@type='checkbox']")).isSelected();
        		//td//input[@type='checkbox']
        	 }
        	 System.out.println(  );
         }
         
         //pagination
         int page = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
         System.out.println(page);
         
        for(int p=1;p<=page;p++)
        {
        	if(p>1)
        	{
        		WebElement activepage = driver.findElement(By.xpath("//ul[@id='pagination']//li//a[@href='#'][normalize-space()="+p+"]"));
        		activepage.click();
        	}
        	  for(int i=1;i<=rows;i++)
              {
             	 for(int j=1;j<=columns;j++)
             	 {
             		WebElement ty= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td["+j+"]"));
             		System.out.print(ty.getText());
             		driver.findElement(By.xpath("//td//input[@type='checkbox']")).isSelected();
             		//td//input[@type='checkbox']
             	 }
             	 System.out.println(  );
              }
        }
	}

}
