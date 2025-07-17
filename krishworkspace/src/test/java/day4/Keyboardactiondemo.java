package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello world");
		
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		

	}

}
