package acc.br;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FrutasResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/frutas")
          .then()
             .statusCode(is(200));
    }

}