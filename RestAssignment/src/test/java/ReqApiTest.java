import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class ReqApiTest {

//    @Test
//    void test1(){
//        Response response = RestAssured.get("https://reqres.in/api/user?page=2");
//
//        System.out.println("Response: "+response.asString());
//        System.out.println("Status Code: "+response.getStatusCode());
//        System.out.println("Body: "+response.getBody().asString());
//        System.out.println("Time Taken: "+response.getTime());
//        System.out.println("Header :"+response.getHeader("content-type"));
//
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
//    }
//
//    @Test
//    void test2(){
//        given().get("https://reqres.in/api/user?page=2").then().statusCode(200);
//    }

    @Test
    public static void main(String[] args) {
        RestAssured.baseURI = "http://www.colourlovers.com/api";

        // Make the GET request and get the response
        Response response = given()
                .when()
                .get("/colors")
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Print the response
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }
}

// if you want to generate the report in TestNG, then go to
// Run -> Edit Configuration -> TestNG -> Listners -> Create Report -> Run
