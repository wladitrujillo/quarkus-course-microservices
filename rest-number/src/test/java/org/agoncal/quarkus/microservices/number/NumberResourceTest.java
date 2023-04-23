package org.agoncal.quarkus.microservices.number;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class NumberResourceTest {

    @Test
    public void testNumbersEndpoint() {
        given()
                .when().get("/api/numbers")
                .then()
                .statusCode(200)
                .body("isbn13", containsString("13-"))
                .body("isbn10", containsString("10-"));
    }

}