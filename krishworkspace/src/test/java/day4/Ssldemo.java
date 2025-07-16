package day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ssldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//options.addArguments("--incognito");
		//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
	ChromeDriver driver= new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	
	//if(title.equals("Downloads | Selenium



}
}