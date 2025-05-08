package HTTP_GET_Method_NonBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab01_GetMethod {

    RequestSpecification r ;
    Response response;
    ValidatableResponse vr;

    @Test

    public void test_GetMethod_NonBDD(){

        String pincode = "560066";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode);


response= r.when().log().all().get();

        System.out.println(response.toString());

        vr= response.then().log().all();
        vr.statusCode(200);


    }
}
