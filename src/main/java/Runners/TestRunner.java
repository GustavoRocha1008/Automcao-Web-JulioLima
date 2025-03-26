package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//main//resources//features",
        glue = "src//main//java//Steps",
        plugin = {"pretty", "html:target/report.html"},
        monochrome = true,
        tags = "@CT0001"
)
public class TestRunner {
}
