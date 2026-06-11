package api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserTest {

    @Test
    public void getInvalidUser() {

        Response response =
                given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/999");

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}