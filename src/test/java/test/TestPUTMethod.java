package test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class TestPUTMethod {
    @Test
    public void testPut(){


        JSONObject msg =new JSONObject();
        msg.put("ali","salah@gmail.com");
        msg.put("first_name","ahmed");
        msg.put("last_name","shady");
        baseURI= "https://reqres.in/api";   //Base URl
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).      //to accept content of type json
                body(msg.toJSONString()).
                when().
                put("/users/2").                      //Api endpoint for put requests
                then().
                statusCode(200);
    }
}
