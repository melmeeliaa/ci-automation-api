package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetNewBranch {
    public String endpoint = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set GET api endpoints")
    public String iSetGETApiEndpoints() {
        return endpoint;
    }
    @Step("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        SerenityRest.given().get(iSetGETApiEndpoints());
    }
    @Step("I received valid HTTP response code 200")
    public void iReceivedValidHTTPResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for detail user")
    public void iReceivedValidDataForDetailUser() {
        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
        restAssuredThat(response -> response.body("[0].title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}
