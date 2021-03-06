package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;


    // TODO is statement having setup for ie and chrome

    @BeforeSuite
    public void suiteSetup(){
        System.setProperty("webdriver.gecko.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void explicitWait(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void openPage(String url) {
        driver.get(url);
//        Tools.waitForPageLoaded(driver);
    }


    public void submitSearch(By element) {
        System.out.println("Submitting query in element:" + element.toString());
        driver.findElement(element).submit();
    }


    public void sendKeysTo(By element, String stringToSend) {
        driver.findElement(element).sendKeys(stringToSend);
    }

    public String getTextFromElement(By element) {
        return driver.findElement(element).getText();
    }
}
