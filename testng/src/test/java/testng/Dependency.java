package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test(groups="smoke")
	void openapp()
	{
		System.out.println("opren app");
		//Assert.assertTrue(false);
	}
	
	@Test(groups="regression")
	void login()
	{
		System.out.println("loggin in");
	}
@Test(groups="sanity")
	void close()
	{
		System.out.println("hhhh");
	}
}
