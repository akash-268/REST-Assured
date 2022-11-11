import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET {
	@Test
	void test_01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int sCode=response.getStatusCode();
		Assert.assertEquals(sCode,200);
	}
	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
}
