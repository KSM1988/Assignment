package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utility.BrowserDriver.driver;

public class DashboardPage {

    // Locators
    public static String dashboard_header_css = "body > div > div > div > div.page-header > h1";
    public static String greeting_css = "body > div > div > div > div.row > div.col-md-7 > h2";

    public static void check_table_rows_count () {
        WebElement table = driver.findElement(By.cssSelector("body > div > div > div > table > tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        int expectedRowCount = 5;
        assert rowCount == expectedRowCount : "Expected " + expectedRowCount + " rows but found " + rowCount;
    }

    public static String dashboard_header_contents () {
        String dashboardPageHeaderCheck = driver.findElement(By.cssSelector(dashboard_header_css)).getText();
        return dashboardPageHeaderCheck;
    }
    public static String greeting_contents () {
        String greetingCheck = driver.findElement(By.cssSelector(greeting_css)).getText();
        return greetingCheck;
    }
}
