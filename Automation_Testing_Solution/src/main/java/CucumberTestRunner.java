import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/feautures",
        glue = "stepDefinition",
        snippets = SnippetType.CAMELCASE,
        tags = {"@run"},
        plugin = {"pretty","html:target/cucumber-reports"}
)



public class CucumberTestRunner {
}
