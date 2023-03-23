import managers.WebDriverManager;

public class TestRunner {
    public static void main(String[] args) {

        WebDriverManager chromeDriver = new WebDriverManager("CHROME");
        WebDriverManager firefoxDriver = new WebDriverManager("FIREFOX");

        chromeDriver.getDriver().get("https://enter.online/");
        firefoxDriver.getDriver().get("https://darwin.md/");

        chromeDriver.closeDriver();
        firefoxDriver.closeDriver();

    }
}
