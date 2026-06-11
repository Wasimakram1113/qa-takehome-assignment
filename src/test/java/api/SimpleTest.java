package api;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void testApi() {

        Response response =
                given()
                    .header("x-api-key", "reqres-free-v1")
                .when()
                    .get("https://reqres.in/api/users/2");

        System.out.println("Status Code = " + response.getStatusCode());
        response.prettyPrint();
    }
}