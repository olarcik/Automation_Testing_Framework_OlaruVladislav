package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    private final String ENDPOINT = "/index.php?route=common/home&language=en-gb";
    public HomePage(WebDriver driver){
        super(driver);
    }
    public void clickOnMyAccountBtn(){
        myAccountButton.click();
    }
    public void clickOnRegisterBtn(){
        registerButton.click();
    }
    public HomePage toPage(){
        driver.get(BASE_URL + ENDPOINT);
        return this;
    }
}
