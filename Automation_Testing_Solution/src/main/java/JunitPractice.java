import managers.WebDriverManager;
import org.junit.jupiter.api.*;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class JunitPractice {
    WebDriverManager webDriverManager = new WebDriverManager("CHROME");
    @BeforeEach
    public void beforeTestprocedure(){
        webDriverManager.getDriver().get("https://demo.opencart.com/");
        webDriverManager.getDriver().manage().window().maximize();
    }

    @AfterEach
    public void afterTestInstructions(){
        webDriverManager.getDriver().close();
    }
    @Test
    @DisplayName("Adresa URL a paginii Register este disponibila din pagina Home")
    public void verifyIfTheRegisterPageIsAccessible(){
        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        boolean urlIsValid = webDriverManager.getDriver().getCurrentUrl().contains("register");

        Assertions.assertTrue(urlIsValid,"Adresa URL nu este valida");
    }

    @Test
    @DisplayName("Resiter page elements are dispayed")
    public void registerPageElementsAreDisplayed(){
        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());

        Assertions.assertTrue(registerPage.allTheElementsAreDisplayed(), "Cel putin unul din elementele paginii nu a fost afisat");
    }
}
