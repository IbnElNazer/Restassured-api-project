package test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class TestPOSTMethod {
    @Test
    public void testPost(){


        JSONObject msg =new JSONObject();
            msg.put("email","salah@gmail.com");
            msg.put("first_name","salah");
            msg.put("last_name","hany");
        baseURI= "https://reqres.in/api";   //Base URl
                given().
                        contentType(ContentType.JSON).
                        accept(ContentType.JSON).      //to accept content of type json
                        body(msg.toJSONString()).
                when().
                        post("/users").                      //Api endpoint for Post requests
                then().
                        statusCode(201);                    // status code 201 for created requests
    }
}
