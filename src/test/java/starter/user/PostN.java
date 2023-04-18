package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostN {
    public String endpoints = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set POST api Invalid Id endpoints")
    public String iSetPOSTApiInvalidIdEndpoints() {
        return endpoints + "/sip";
    }
    @Step("I'm send POST HTTP request with number")
    public void iMNotSendPOSTHTTPRequestWithNumber() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("123", 1334);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiInvalidIdEndpoints());
    }
    @Step("I receive invalid HTTP response code {int}")
    public void iReceiveInvalidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
    }

