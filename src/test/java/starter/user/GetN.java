package starter.user;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetN {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set GET api invalid endpoints")
    public String iSetGETApiInvalidEndpoints() {
      return endpoint + "/hal";
    }
    @Step("I'm sending a request other than HTTP GET")
    public void iMSendingARequestOtherThanHTTPGET() {
        SerenityRest.given().head(iSetGETApiInvalidEndpoints());
    }

    @Step("I received invalid response status code")
    public void iReceivedInvalidResponseStatusCode() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
