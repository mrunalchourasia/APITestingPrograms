package org.example;

import io.restassured.RestAssured;

public class Lab02_RA {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/440001")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
