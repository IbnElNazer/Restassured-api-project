package test;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

public class TestGETMethod {
    @Test
    public void testGETOneItem(){
        baseURI= "https://reqres.in";
        given().
                get("/api/users?page=2").
                then().body("data[3].email",equalTo("byron.fields@reqres.in"));
    }
    @Test
    public void testGETAnyItem(){
        baseURI= "https://reqres.in";
                    given().
                         get("/api/users?page=2").
                    then().
                         body("data.last_name",hasItems("Edwards","Howell"));
    }
}
