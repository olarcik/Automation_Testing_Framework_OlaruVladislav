package contextManagers;

import managers.PropertiesManagers;
import managers.WebDriverManager;

public class TestContext {

    private WebDriverManager webDriverManager;

    public TestContext(){

        webDriverManager = new WebDriverManager(PropertiesManagers.getBrowserType());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }
}
