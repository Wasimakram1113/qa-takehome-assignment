package api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class basetest {

    protected RequestSpecification request;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = "https://reqres.in/api";

        request = RestAssured.given()
                .header("x-api-key", "reqres-free-v1")
                .header("Content-Type", "application/json");
    }
}