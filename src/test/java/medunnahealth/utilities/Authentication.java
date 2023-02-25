package medunnahealth.utilities;

import java.util.HashMap;
import java.util.Map;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(){
        Map<String,Object> map = new HashMap<>();
        map.put("password","Team06+");
        map.put("rememberMe",true);
        map.put("username","AdminTeam06");

        Response response = given().
                contentType(ContentType.JSON).
                body(map).
                when().
                post("https://https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");
    }
}