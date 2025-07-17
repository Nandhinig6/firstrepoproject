package day4;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiseproblem {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		//driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println(links.size());
		for(int i=0;i<3;i++)
		{
			links.get(i).click();
		}}
		
		
		
		/*//count number oflinks
		List<WebElement> link = driver.findElements(By.xpath("//div[@class=\"wikipedia-search-results\"]//a)"));
		System.out.println(link.size());
		
		//print all links
		for( WebElement links : link)
		{
			links.click();
			Set<String> ids=driver.getWindowHandles();
			
			List<String> mylist = new ArrayList(ids);
			System.out.println(mylist.get(1));
			
		}*/
		
		//driver.quit();

	}


