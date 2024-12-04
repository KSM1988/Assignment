package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"utility","stepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}