package stepDefinitions;

import Utility.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.RegistrationPage.*;

public class RegisterPageSteps extends BrowserDriver {
    @Given("the user is on the registration page")
    public void theUserIsOnTheRegistrationPage() {
        String registrationHeaderText = registration_header_contents();
        Assert.assertEquals(registrationHeaderText, "Registration");
    }

    @When("the user enters valid entries into all fields")
    public void theUserEntersValidEntriesIntoAllFields() {
        complete_valid_registration();
    }

    @And("the user clicks on the Registration button")
    public void theUserClicksOnTheRegistrationButton() {
        click_registration_register_button();
    }

    @Then("the user is directed to the Dashboard Page")
    public void theUserIsDirectedToTheDashboardPage() {
        
    }
}