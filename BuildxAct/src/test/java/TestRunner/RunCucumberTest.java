package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(      features="src/test/resources/Features/",
glue = "stepDefs",
dryRun = false,
monochrome = true,
plugin = {"pretty","html:test-out.html"})
public class RunCucumberTest {

}
