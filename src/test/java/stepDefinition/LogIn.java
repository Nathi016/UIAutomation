package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LogIn.*;

public class LogIn {

    @When("User enters an invalid email.")
    public void User_enters_an_inavlid_email(){
        sendkeys_email();

    }
    @And("User enters an invalid password.")
    public void User_enters_an_invalid_email(){
        sendKeys_password();

    }
    @And("User clicks on the Login button.")
    public void User_clicks_on_the_login_button(){
        click_loginButton();
    }
    @Then("User should see an error message.")
    public void User_should_see_an_error_message(){
        verify_error_message();
    }
    @And("User Should remain on the Login page.")
    public void User_Should_remain_on_the_Login_page(){
        signupButtonExist();

    }



}
