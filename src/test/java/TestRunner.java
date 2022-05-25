import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources"},

        glue = {"StepDefinition" , "Web"},
        tags = {},
        plugin = {"pretty", "html:Reports/Default/"}


)

public class TestRunner {
}
