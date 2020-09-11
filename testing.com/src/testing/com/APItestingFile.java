package testing.com;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APItestingFile {

	public static void main(String[] args) {

        Response re= RestAssured.given().get("https://reqres.in/api/users?page=2");
		
		int sc= re.getStatusCode();
		
		System.out.println("Status Code is"+ sc);
	}

}
