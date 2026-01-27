package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.clickLoginButton;

public class HomePage {

    @Given("User navigates to Login page.")
    public void user_navigates_to_login_page() throws InterruptedException {
        clickLoginButton();

    }

}
