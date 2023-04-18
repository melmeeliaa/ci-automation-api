package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Put {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set PUT api endpoints")
    public String iSetPUTApiEndpoints() {
        return endpoint;
    }

    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","Hari ini bahagia");
        requestBody.put("body","tes");

        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).put(iSetPUTApiEndpoints());
    }

    @Step("I receive valid data for update user")
    public void iReceiveValidDataForUpdateUser() {
        restAssuredThat(response -> response.body("title", equalTo("Hari ini bahagia")));
        restAssuredThat(response -> response.body("body", equalTo("tes")));

    }
}
