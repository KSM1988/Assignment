package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class RegistrationPage {

    // Locators:
    public static String registration_header_css = "body > div > div > div > div > h1";
    public static String name_field_css = "#name";
    public static String email_field_css = "#email";
    public static String web_address_field_css = "#url";
    public static String interests_field_css = "#jobInterests";
    public static String password_field_css = "#password";
    public static String confirm_password_field_css = "#confirmPassword";
    public static String registration_register_button_css = "body > div > div > div > form > button";
    public static String alert_message_css = "body > div > div > div > form > div.alert.alert-danger";

    public static void goToRegistrationPage() {
        driver.get("file:///C:/Users/kylem/Documents/registration-test/registration-test/register.html");
    }

    public static void click_registration_register_button () {
        driver.findElement(By.cssSelector(registration_register_button_css)).click();
    }

    public static String registration_header_contents () {
        String registrationPageHeaderCheck = driver.findElement(By.cssSelector(registration_header_css)).getText();
        return registrationPageHeaderCheck;
    }

    public static String alert_message_contents () {
        String alertMessageContents = driver.findElement(By.cssSelector(alert_message_css)).getText();
        return alertMessageContents;
    }

    public static void complete_valid_registration () {
        String [] entries = {"Kyle", "kylesemail@email.com", "https://downtonabbeyonline.com/", "Downton Abbey", "Password", "Password"};
        String [] locators = {name_field_css, email_field_css, web_address_field_css, interests_field_css, password_field_css, confirm_password_field_css};
        for (int i = 0; i < entries.length; i++) {
            if (i == 3) {
                driver.switchTo().frame("iframe");
                driver.findElement(By.cssSelector(locators[i])).sendKeys(entries[i]);
                driver.switchTo().defaultContent();
            }
            else {
                driver.findElement(By.cssSelector(locators[i])).sendKeys(entries[i]);
            }
        }
    }

    public static void complete_email_field(String Email) {
        driver.findElement(By.cssSelector(email_field_css)).sendKeys(Email);
    }

    public static void complete_password_field(String Password) {
        driver.findElement(By.cssSelector(password_field_css)).sendKeys(Password);
    }

    public static void complete_confirm_password_field(String ConfPassword) {
        driver.findElement(By.cssSelector(confirm_password_field_css)).sendKeys(ConfPassword);
    }

    public static void complete_other_fields() {
        String [] entries = {"Kyle", "https://downtonabbeyonline.com/", "Downton Abbey"};
        String [] locators = {name_field_css, web_address_field_css, interests_field_css};
        for (int i = 0; i < entries.length; i++) {
            if (i == 2) {
                driver.switchTo().frame("iframe");
                driver.findElement(By.cssSelector(locators[i])).sendKeys(entries[i]);
                driver.switchTo().defaultContent();
            }
            else {
                driver.findElement(By.cssSelector(locators[i])).sendKeys(entries[i]);
            }
        }
    }



}