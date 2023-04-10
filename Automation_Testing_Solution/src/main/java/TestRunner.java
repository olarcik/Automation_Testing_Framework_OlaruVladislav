import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

import static java.lang.Thread.*;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo.opencart.com/");
        webDriverManager.getDriver().manage().window().maximize();

        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterPage("Olaru","Vladislav","vladis.url@gmail.com","Vladis123!");

        Thread.sleep(10000);

        webDriverManager.getDriver().close();

    }
}
