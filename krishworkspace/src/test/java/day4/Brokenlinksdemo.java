package day4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinksdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver( );
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement ll : links)
		{
			String value = ll.getAttribute("href");
			//System.out.println(value);
			
			/*if(value==null || value.isEmpty())
					{
				System.out.println("not possible to check");
				continue;
					}
		
		//continue;*/
	try
	{
	URL link=new URL(value);
	HttpURLConnection conn=(HttpURLConnection) link.openConnection();
	conn.connect();
	
	if(conn.getResponseCode()>=400)
	{
		System.out.println("broken link");
	}
	else
	{
		System.out.println("not broken link");
	}
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	
		
		
		}
	}

}
