package firstday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chromium.ChromiumOptions;

public class Firstscript {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
		
	ChromeDriver driver= new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	String title = driver.getTitle();
	if(title.equals("Downloads | Selenium"))
	{
		System.out.println("both are equal");
	}
	
	
	}

}
