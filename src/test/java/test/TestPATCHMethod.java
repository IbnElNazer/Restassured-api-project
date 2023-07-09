package test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


    public class TestPATCHMethod {
        @Test
        public void testPatch() {


            JSONObject msg = new JSONObject();
            msg.put("first_name", "sameh");
            msg.put("last_name", "somaya");
            baseURI = "https://reqres.in/api";   //Base URl
            given().
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).      //to accept content of type json
                    body(msg.toJSONString()).
                    when().
                    patch("/users/2").                      //Api endpoint for patch requests
                    then().
                    statusCode(200);
        }
    }
