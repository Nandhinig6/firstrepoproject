package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		WebElement tt=driver.findElement(By.xpath("//h2[normalize-space()='Upload Files']"));
		js.executeScript("arguments[0].scrollIntoView();", tt);
		//js.executeScript("arguments[0].scrollIntoView();", txt);

		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Mylocal\\NANDHINI G.pdf");
	
		driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
		
		WebElement gg =driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		System.out.println(gg.getText());
	}

}
