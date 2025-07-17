package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methoddemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());*/
		Set<String> id = driver.getWindowHandles();
		System.out.println(id);
		List<String> mylist = new ArrayList(id);
		String parentid = mylist.get(0);
		System.out.println(parentid);
		String parent1id = mylist.get(1);
		System.out.println(parent1id);
		
		
		
		for(String lists : mylist)
		{
			String title = driver.switchTo().window(lists).getTitle();
			System.out.println(title);
		}
		
		
		//driver.quit();
		driver.close();
		
		
	}

}
