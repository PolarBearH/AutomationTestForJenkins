package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumber {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("the user enters correct {string} username")
    public void the_user_enters_correct_username(String username) {
        System.out.println("Username - " + username);

    }

    @When("correct {string} password")
    public void correct_password(String pass) {
        System.out.println("Password - " + pass);
    }



    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {

    }

    @Then("verify the user logs in successfully")
    public void verify_the_user_logs_in_successfully() {

    }


}
