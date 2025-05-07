package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab03_ConceptTestNG {
    String pincode="440002";
    @Test
            public void positive_TC1()
    {
        pincode="440002";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/440001")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void positive_TC2()
    {
        pincode="@";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/440001")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void positive_TC3()
    {
        pincode="";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/440001")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

}
