package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class Dynamictable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//mouse hover
				WebElement act = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
WebElement act2 = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
Actions act1 = new Actions(driver);
act1.moveToElement(act).moveToElement(act2).click().build().perform();
//act1.d
Thread.sleep(5000);

//double clic
WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
field1.clear();
field1.sendKeys("Hello !!");
WebElement act3= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
act1.doubleClick(act3).build().perform();
WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
field2.getAttribute("id");

Thread.sleep(5000);


//drag and drop
WebElement field3 = driver.findElement(By.xpath("//div[@id='droppable']"));
WebElement fiel4 = driver.findElement(By.xpath("//div[@id='draggable']"));
act1.dragAndDrop(field3, fiel4).build().perform();

	}

}
