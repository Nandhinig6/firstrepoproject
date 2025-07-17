package day4;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enableextension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Mylocal\\SelectorsHub-Chrome-Web-Store.crx");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(file);
		
		
		ChromeDriver driver = new ChromeDriver(options );
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		

	}

}
