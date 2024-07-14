import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ColorAPITest extends BaseAPITest{
    @Test
    public void testFetchAllColors() {
        given()
                .param("format", "xml")
                .when()
                .get("http://www.colourlovers.com/api/colors")
                .then()
                .statusCode(200)
                .header("Content-Type", "test/xml; charset=utf-8")
                .body("id", not(empty()));
    }

    @Test
    public void testFetchNewColors() {
        given()
                .param("format", "xml")
                .when()
                .get("http://www.colourlovers.com/api/colors/new")
                .then()
                .statusCode(200)
                .header("Content-Type", "test/xml; charset=utf-8")
                .body("id", not(empty()));
    }

    @Test
    public void testFetchTopColors() {
        given()
                .param("format", "xml")
                .when()
                .get("http://www.colourlovers.com/api/colors/top")
                .then()
                .statusCode(200)
                .header("Content-Type", "test/xml; charset=utf-8")
                .body("id", not(empty()));
    }

    @Test
    public void testFetchRandomColors() {
        given()
                .param("format", "xml")
                .when()
                .get("http://www.colourlovers.com/api/colors/random")
                .then()
                .statusCode(200)
                .header("Content-Type", "test/xml; charset=utf-8")
                .body("id", not(empty()));
    }


}
