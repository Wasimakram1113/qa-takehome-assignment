package api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest {

    @Test
    public void getUserDetails() {

        Response response =
                given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertEquals(response.jsonPath().getString("username"), "Bret");
    }
}