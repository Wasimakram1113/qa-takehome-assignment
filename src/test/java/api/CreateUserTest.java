package api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUserSuccessfully() {

        String payload = """
                {
                  "name": "Wasim",
                  "username": "wasimqa"
                }
                """;

        Response response =
                given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post("https://jsonplaceholder.typicode.com/users");

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "Wasim");
        Assert.assertEquals(response.jsonPath().getString("username"), "wasimqa");
    }
}