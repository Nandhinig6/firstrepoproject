package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conditionalmethoddemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Boolean check = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(check);
		
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"FirstName\"]")));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		
		
				

	}

	
}
