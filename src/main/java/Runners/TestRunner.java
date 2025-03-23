package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Steps",
        plugin = {"pretty", "html:target/report.html"},
        monochrome = true,
        tags = "advantageonlines"
)
public class TestRunner {
}
