package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="regression")
	void openapp()
	{
		System.out.println("opren app");
		Assert.assertTrue(false);
	}
	
	@Test(groups="sanity")
	void display()
	{
		System.out.println("display app");
	}
	
	@Test(groups="sanity")
	void login()
	{
		System.out.println("loggin in");
	}
@Test(groups="smoke")
	void close()
	{
		System.out.println("hhhh");
	}
}



