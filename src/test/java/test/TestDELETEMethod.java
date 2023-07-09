package test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestDELETEMethod {
    @Test
    public void testDelete() {


        baseURI = "https://reqres.in/api";   //Base URl

                 when().
                    delete("/users/2").                      //Api endpoint for patch requests
                 then().
                    statusCode(204);    // status code for delete request is 204
    }
}
