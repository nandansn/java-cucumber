package demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APITest {

    @Given("api request prepared")
    public void api_request_prepared() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("api request prepared");
    }
    @When("send create account request")
    public void send_create_account_request() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("api request sent");
    }
    @Then("account should be created")
    public void account_should_be_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("api created account");
    }
}
