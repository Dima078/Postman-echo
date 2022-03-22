package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostEchoTest {
    @Test
    void shouldPostTest() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("\"birthday\": \"13.06.1999\"")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("\"birthday\": \"13.06.1999\""))
        ;
    }
}
