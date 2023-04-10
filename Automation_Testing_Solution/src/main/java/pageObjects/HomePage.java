package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public HomePage(WebDriver driver){

        super(driver);

    }

    public void clickOnMyAccountBtn(){
        myAccountButton.click();
    }

    public void clickOnRegisterBtn(){
        registerButton.click();
    }
}
