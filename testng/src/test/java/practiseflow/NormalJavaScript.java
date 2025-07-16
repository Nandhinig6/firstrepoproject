package practiseflow;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalJavaScript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Nandhini");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("gaja");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("nandhu123@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("987654");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Nandhu@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Nandhu@123");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String acttext = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		if(acttext.equals("Your Account Has Been Created!"))
		{
			System.out.println("both are equal");
		}
		;
	}

}
