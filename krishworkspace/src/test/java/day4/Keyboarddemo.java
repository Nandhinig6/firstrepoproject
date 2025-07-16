package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboarddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement aa1=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("location is before moving : "+ aa1.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(aa1, 200, 700).build().perform();
		
		
		WebElement aa=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("location is before moving : "+ aa.getLocation());
		Actions act1 = new Actions(driver);
		act.dragAndDropBy(aa, 200, 2019).build().perform();
	}
	//"location is before moving : "+ aa.getLocation());


}
