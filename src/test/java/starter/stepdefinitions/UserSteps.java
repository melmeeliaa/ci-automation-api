package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserSteps {
    @Steps
    Get get;
    @Steps
    GetN getN;
    @Steps
    GetID getID;
    @Steps
    GetIDN getIDN;
    @Steps
    Post post;
    @Steps
    PostN postN;
    @Steps
    Put put;
    @Steps
    PutN putN;
    @Steps
    Delete delete;
    @Steps
    DeleteN deleteN;
    @Given("I set GET api endpoints")
    public void iSetGETApiEndpoints() {
        get.iSetGETApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        get.iSendGETHTTPRequest();
    }

    @Then("I received valid HTTP response code {int}")
    public void iReceivedValidHTTPResponseCode(int arg0) {
        get.iReceivedValidHTTPResponseCode200();
    }

    @And("I received valid data for detail user")
    public void iReceivedValidDataForDetailUser() {
        get.iReceivedValidDataForDetailUser();
    }

    @Given("I set POST api endpoints")
    public void iSetPOSTApiEndpoints() {
        post.iSetPOSTApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.iSendPOSTHTTPRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode() {
        post.iReceiveValidHTTPResponseCode();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        post.iReceiveValidDataForNewUser();
    }

    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        put.iSetPUTApiEndpoints();

    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        put.iSendPUTHTTPRequest();
    }

    @And("I receive valid data for update user")
    public void iReceiveValidDataForUpdateUser() {
        put.iReceiveValidDataForUpdateUser();
    }

    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delete.iSetDELETEApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delete.iSendDELETEHTTPRequest();
    }


    @Then("I received valid HTTP response code {int} delete")
    public void iReceivedValidHTTPResponseCodeDelete(int arg0) {
        delete.iReceivedValidHTTPResponseCodeDelete();
    }


    @Given("I set GET api endpoints by ID")
    public void iSetGETApiEndpointsByID() {
        getID.iSetGETApiEndpointsByID();
    }

    @When("I send GET HTTP request by ID")
    public void iSendGETHTTPRequestByID() {
        getID.iSendGETHTTPRequestByID();
    }


    @And("I received valid data for get data by ID")
    public void iReceivedValidDataForGetDataByID() {
        getID.iReceivedValidDataForGetDataByID();
    }

    @Given("I set GET api invalid endpoints")
    public void iSetGETApiInvalidEndpoints() {
        getN.iSetGETApiInvalidEndpoints();
    }

    @When("I'm sending a request other than HTTP GET")
    public void iMSendingARequestOtherThanHTTPGET() {
        getN.iMSendingARequestOtherThanHTTPGET();
    }
    @Then("I received invalid response status code")
    public void iReceivedValidResponseContentType() {
        getN.iReceivedInvalidResponseStatusCode();
    }

    @When("I'm send POST HTTP request with number")
    public void iMNotSendPOSTHTTPRequestWithNumber() {
        postN.iMNotSendPOSTHTTPRequestWithNumber();
    }

    @Given("I set POST api Invalid Id endpoints")
    public void iSetPOSTApiInvalidIdEndpoints() {
        postN.iSetPOSTApiInvalidIdEndpoints();
    }
    @Then("I receive invalid HTTP response code {int}")
    public void iReceiveInvalidHTTPResponseCode(int arg0) {
        postN.iReceiveInvalidHTTPResponseCode();
    }

    @Then("I received valid HTTP response code {int} by ID")
    public void iReceivedValidHTTPResponseCodeByID(int arg0) {
        getID.iReceivedValidHTTPResponseCodeByID();
    }

    @Given("I set GET api invalid endpoints by ID")
    public void iSetGETApiInvalidEndpointsByID() {
        getIDN.iSetGETApiInvalidEndpointsByID();
    }

    @When("I send GET HTTP request by ID {int}")
    public void iSendGETHTTPRequestByID(int arg0) {
        getIDN.iSendGETHTTPRequestByID();
    }

    @Then("I received invalid response status code {int}")
    public void iReceivedInvalidResponseStatusCode(int arg0) {
        getIDN.iReceivedInvalidResponseStatusCode();
    }

    @Given("I set PUT api Invalid endpoints")
    public void iSetPUTApiInvalidEndpoints() {
        putN.iSetPUTApiInvalidEndpoints();

    }

    @When("I send PUT HTTP request {int}")
    public void iSendPUTHTTPRequest(int arg0) {
        putN.iSendPUTHTTPRequest();
    }

    @Then("I received invalid response status code PUT")
    public void iReceivedInvalidResponseStatusCodePUT() {
        putN.iReceivedInvalidResponseStatusCodePUT();
    }

    @Given("I set DELETE api invalid endpoints")
    public void iSetDELETEApiInvalidEndpoints() {
        deleteN.iSetDELETEApiInvalidEndpoints();
    }

    @When("I send DELETE HTTP request {int}")
    public void iSendDELETEHTTPRequest(int arg0) {
        deleteN.iSendDELETEHTTPRequest();
    }

    @Then("I received invalid HTTP response code {int} delete")
    public void iReceivedInvalidHTTPResponseCodeDelete(int arg0) {
        deleteN.iReceivedInvalidHTTPResponseCodeDelete();
    }
}
