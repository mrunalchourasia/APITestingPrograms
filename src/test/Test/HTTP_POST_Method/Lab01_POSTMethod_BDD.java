package HTTP_POST_Method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab01_POSTMethod_BDD {
     @Test
    public void test_BDD(){
         String payload= "{\n" +
                 "    \"username\" : \"admin\",\n" +
                 "    \"password\" : \"password123\"\n" +
                 "}";
         RestAssured.given()
                 .baseUri("https://restful-booker.herokuapp.com")
                 .basePath("/auth")
                 .contentType(ContentType.JSON)
                 .log().all().body(payload)

                 .when()
                   .log().all().post()

                 .then()
                   .log().all()
                 .statusCode(200);
     }
}
