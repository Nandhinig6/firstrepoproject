package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assetion {
	
	@Test
	 void dd()
	 {
		System.out.println("startes test...");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,2);
		
		//Assert.assertTrue(false);
		
		System.out.println("hii");
		
		//Assert.fail();
		
	 }
	

}
