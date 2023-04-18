package starter.user;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutN {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set PUT api Invalid endpoints")
    public String iSetPUTApiInvalidEndpoints() {
        return endpoint + "/34";
    }
    @Step("I send PUT HTTP request {int}")
    public void iSendPUTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","Hari ini cukup bahagia");
        requestBody.put("body","tes");
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).put(iSetPUTApiInvalidEndpoints());
    }
    @Step("I received invalid response status code PUT")
    public void iReceivedInvalidResponseStatusCodePUT() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
