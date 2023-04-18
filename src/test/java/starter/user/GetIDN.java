package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIDN {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set GET api invalid endpoints by ID")
    public String iSetGETApiInvalidEndpointsByID() {
        return endpoint + "/saya";
    }

    @Step("I send GET HTTP request by ID {int}")
    public void iSendGETHTTPRequestByID() {
        SerenityRest.given().get(iSetGETApiInvalidEndpointsByID());
    }

    @Step("I received invalid response status code {int}")
    public void iReceivedInvalidResponseStatusCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
