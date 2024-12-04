package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.After;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"Utility","stepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}