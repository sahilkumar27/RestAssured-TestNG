import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ColorAPITest extends BaseAPITest{
    @Test
    public void testFetchAllColors() {
        given()
                .param("format", "json")
                .when()
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", not(empty()));
    }

//    @Test
//    public void testFetchNewColors() {
//        given()
//                .param("format", "json")
//                .when()
//                .get("/new")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)
//                .body("id", not(empty()));
//    }
//
//    @Test
//    public void testFetchTopColors() {
//        given()
//                .param("format", "json")
//                .when()
//                .get("/top")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)
//                .body("id", not(empty()));
//    }
//
//    @Test
//    public void testFetchRandomColors() {
//        given()
//                .param("format", "json")
//                .when()
//                .get("/random")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)
//                .body("id", not(empty()));
//    }


}
