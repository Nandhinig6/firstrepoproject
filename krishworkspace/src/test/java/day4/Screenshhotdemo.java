package day4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshhotdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=driver;
		//js.executeScript("document.body.stle.zoom='25%'");
		js.executeScript("document.body.style.zoom='25%'");
		
		//fullpage 
		TakesScreenshot ts = driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir")+ "\\screenshots\\test1.png");
	
	source.renameTo(target);
	
	
	//soecific area
	WebElement tt = driver.findElement(By.xpath("//div[@id='HTML12']"));
	File source1 =	tt.getScreenshotAs(OutputType.FILE);
File target1 = new File(System.getProperty("user.dir")+ "\\screenshots\\test2.png");
	
	source1.renameTo(target1);
	
	//specificelement
	WebElement rr = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
	File source2 =	rr.getScreenshotAs(OutputType.FILE);
	File target2 = new File(System.getProperty("user.dir")+ "\\screenshots\\test3.png");
		
		source2.renameTo(target2);
	
	
	
		
		
	}

}
