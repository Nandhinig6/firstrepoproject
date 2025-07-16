package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Httpsrequests {
	
	
	@Test
	void setup()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users/1")
		
		.then()
		.statuscode(200);
		.body("page",equalTo(2))
		
		
		
	}

	private Object equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
