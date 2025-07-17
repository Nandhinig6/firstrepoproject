package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Javascriptdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		//WebElement inputbx= driver.findElement(By.xpath("//input[@id='name']"));
		
		//semdkeys
		JavascriptExecutor js = driver;
		//js.executeScript("arguments[0].setattribute('placeholder', 'nandhu')", inputbx);
		
			//click
		//WebElement rd = driver.findElement(By.xpath("//input[@id='male']"));
			//js.executeScript("arguments[0].click()",rd);
			
		//scrollbar BY PIXEL NUMBER
			js.executeScript("window.scrollBy(0,1500)", "");
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//scrollbar till elementvisible
			WebElement txt = driver.findElement(By.xpath("//h2[normalize-space()='Testimonials']"));
			js.executeScript("arguments[0].scrollIntoView();", txt);
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//TILL END
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//scrollup
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//zoomin
			js.executeScript("document.body.style.zoom='50%'");
			
			
			
		

	}

}
