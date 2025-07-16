package day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}

}
