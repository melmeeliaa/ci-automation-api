package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetID {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set GET api endpoints by ID")
    public String iSetGETApiEndpointsByID() {
        return endpoint + "/2";
    }

    @Step("I send GET HTTP request by ID")
    public void iSendGETHTTPRequestByID() {
        SerenityRest.given().get(iSetGETApiEndpointsByID());
    }

    @Step("I received valid HTTP response code {int} by ID")
    public void iReceivedValidHTTPResponseCodeByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for get data by ID")
    public void iReceivedValidDataForGetDataByID() {
        restAssuredThat(response -> response.body("[1].id", equalTo(null)));
        restAssuredThat(response -> response.body("[1].title", equalTo(null)));
    }
}
