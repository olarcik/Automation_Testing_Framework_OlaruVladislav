package stepDefinition;

import contextManagers.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class GeneralSteps {

    private TestContext testContext;

    public GeneralSteps(TestContext context){
        testContext = context;
    }
    @Given("^\"([^\"]*)\" is accesed$")
    public void isAccesed(String adresaURL)  {
        testContext.getWebDriverManager().getDriver().get(adresaURL);
    }

    @Then("^\"([^\"]*)\" is present within the current url$")
    public void isPresentWithinTheCurrentUrl(String urlKeyWord){
        Assertions.assertTrue(testContext.getWebDriverManager().getDriver().getCurrentUrl().contains(urlKeyWord));

    }
}
