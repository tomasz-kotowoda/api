package FunctionalTesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class GetRequestAutomation{
//@Test
public void getRequestAutomation(){
    RestAssured.baseURI="https://api.github.com/users/octocat";
    
    Response response = RestAssured.given().param("login","").when().get();
    
    RestAssured.given().param("login", "")
    .when()
    .get()
    .then()
    .assertThat()
    .log()
    .all()
    .statusCode(200);
    
}

    @Test
 public void validateProperties() {
given()
.when()
.get("https://api.github.com/users/octocat")
.then()
  .body("gravatar_id", equalTo(""))
  .body("location", equalTo("San Francisco"))
  .body("blog", equalTo("https://github.blog"));
}

    private Object then() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}