import org.junit.BeforeClass;
import io.restassured.RestAssured;
public class BaseAPITest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://www.colourlovers.com/api/colors";
    }
}
