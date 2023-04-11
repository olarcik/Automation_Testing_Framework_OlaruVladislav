package pageObjects;

import managers.PropertiesManagers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Method;

public abstract class Page {
    protected WebDriver driver;
    protected final String BASE_URL = PropertiesManagers.getApplicationURL();
    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(@class, \"d-none d-md-inline\") and text() = \"My Account\"]")
    protected WebElement myAccountButton;
    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")
    protected WebElement registerButton;

    public void navigateToRegisterPage(){
        myAccountButton.click();
        registerButton.click();
    }

    public static void navigateToPage(String pageName, WebDriver driver){
        Method method;

        try {
           method = Class.forName("pageObjects." + pageName).getMethod("toPage");
           method.invoke(Class.forName("pageObjects." + pageName).getConstructor(WebDriver.class).newInstance(driver));
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}

