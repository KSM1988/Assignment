package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.After;
import org.testng.Assert;

import static Utility.BrowserDriver.driver;
import static pages.DashboardPage.check_table_rows_count;
import static pages.DashboardPage.greeting_contents;

public class DashboardPageSteps
{
    @And("a personalised greeting is displayed")
    public void aPersonalisedGreetingIsDisplayed() {
        String greetingText = greeting_contents();
        Assert.assertEquals(greetingText, "Welcome Kyle!");
    }

    @And("{int} suggested job vacancies are displayed")
    public void suggestedJobVacanciesAreDisplayed(int arg0) {
        check_table_rows_count();
    }
}
