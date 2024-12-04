package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {

    // Locators:
    public static String header_css = "body > div > div > div > div > h1";
    public static String register_button_id = "body > div > div > div > div > p:nth-child(3) > a";

    public static void goToRegisterPage() {
        driver.get("http://localhost:4200/");
        click_register_button();
    }

    public static void click_register_button() {
        driver.findElement(By.cssSelector(register_button_id)).click();
    }
    public static String homepage_header_text(){
        String homePageHeaderCheck = driver.findElement(By.cssSelector(header_css)).getText();
        return homePageHeaderCheck;
    }
}