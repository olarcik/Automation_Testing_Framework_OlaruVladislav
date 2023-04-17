package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitManager {

    private static WebDriverWait webDriverWait;

    public WebDriverWaitManager(WebDriver webDriver){
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    public static void toBeVisible(WebElement element, WebDriver driver){
        if(webDriverWait == null) new WebDriverWaitManager(driver);
        webDriverWait.until((ExpectedConditions.visibilityOf(element)));
    }

}
