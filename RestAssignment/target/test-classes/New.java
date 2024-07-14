import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static java.util.Optional.empty;
import static java.util.function.Predicate.not;
import static org.hamcrest.CoreMatchers.equalTo;

public class New {

    @Test
    void textXMLResponse(){
//        given()
//                .when()
//                .get("http://www.colourlovers.com/api/colors")
//                .then()
//                .statusCode(200)
//                .header("Content-Type", "test/xml; charset=utf-8")
//                .body("color", equalTo("14"));

        Response res=
        given()
                .when()
                .get("http://www.colourlovers.com/api/colors");
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertEquals(res.header("Content-Type"),"test/xml; charset=utf-8");

        String id = res.xmlPath().get("color.colors[0]").toString();
        Assert.assertEquals(id, "14");



    }

}
