package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    public String endpoints = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set POST api endpoints")
    public String iSetPOSTApiEndpoints() {
        return endpoints ;
    }

    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","tes");
        requestBody.put("body","tes dulu");
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }

    @Step("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        restAssuredThat(response -> response.body("title", equalTo("tes")));
        restAssuredThat(response -> response.body("body", equalTo("tes dulu")));
    }
}
