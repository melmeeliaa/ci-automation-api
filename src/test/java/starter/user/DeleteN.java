package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteN {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set DELETE api invalid endpoints")
    public String iSetDELETEApiInvalidEndpoints() {
        return endpoint + "/25";
    }
    @Step("I send DELETE HTTP request {int}")
    public void iSendDELETEHTTPRequest() { SerenityRest.given().delete(iSetDELETEApiInvalidEndpoints());
    }
    @Step("I received invalid HTTP response code {int} delete")
    public void iReceivedInvalidHTTPResponseCodeDelete() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
