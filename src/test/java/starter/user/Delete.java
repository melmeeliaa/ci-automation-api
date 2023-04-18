package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set DELETE api endpoints")
    public String iSetDELETEApiEndpoints() {
        return endpoint;
    }

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        SerenityRest.given().delete(iSetDELETEApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} delete")
    public void iReceivedValidHTTPResponseCodeDelete() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
