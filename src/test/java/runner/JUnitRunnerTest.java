package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"}, snippets = CAMELCASE,
        features = "classpath:features", glue = "stepdefenations",
        monochrome = true)
public class JUnitRunnerTest {


}
