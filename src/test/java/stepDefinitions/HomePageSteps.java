package stepDefinitions;

import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.HomePage.click_register_button;
import static pages.HomePage.homepage_header_text;
import static pages.RegistrationPage.registration_header_contents;

public class HomePageSteps extends BrowserDriver {
    @Given("the user is on the Home page")
    public void theUserIsOnTheHomePage() {
        String headerText = homepage_header_text();
        Assert.assertEquals(headerText, "Registration Test");
    }

    @When("the user clicks on the Register button")
    public void theUserClicksOnTheRegisterButton() {
        click_register_button();
    }

    @Then("the user is directed to the Registration page")
    public void theUserIsDirectedToTheRegistrationPage() {
        String registrationHeaderText = registration_header_contents();
        Assert.assertEquals(registrationHeaderText, "Registration");
    }
}