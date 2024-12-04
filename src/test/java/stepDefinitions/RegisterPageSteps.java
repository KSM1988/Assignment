package stepDefinitions;

import utility.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.DashboardPage.dashboard_header_contents;
import static pages.RegistrationPage.*;

public class RegisterPageSteps extends BrowserDriver {

    @Given("the user is on the registration page")
    public void theUserIsOnTheRegistrationPage() {
        goToRegistrationPage();
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
        String dashboardHeaderText = dashboard_header_contents();
        Assert.assertEquals(dashboardHeaderText, "Dashboard");
    }

    @When("the user enters {string} into the Email field")
    public void theUserEntersIntoTheEmailField(String Email) {
        complete_email_field(Email);
    }

    @And("the user enters {string} into the Password field")
    public void theUserEntersIntoThePasswordField(String Password) {
        complete_password_field(Password);
    }

    @And("the user enters {string} into the Confirm Password field")
    public void theUserEntersIntoTheConfirmPasswordField(String ConfPassword) {
        complete_confirm_password_field(ConfPassword);
    }

    @And("the user completes the rest of the registration form")
    public void theUserCompletesTheRestOfTheRegistrationForm() {
        complete_other_fields();
    }

    @Then("the user is shown the {string} error message")
    public void theUserIsShownTheErrorMessage(String ErrorMessage) {
        String dashboardHeaderText = alert_message_contents();
        Assert.assertEquals(dashboardHeaderText, ErrorMessage);
    }
}