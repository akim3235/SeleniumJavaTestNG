package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooSearch {

    WebDriver driver;

    @BeforeSuite
    public void suiteSetup(){
        System.setProperty("webdriver.gecko.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testSearch() {
        String queryString = "Portnov School";

        openMainPage();
        typeQuery(queryString);
        submitSearch();
//        assertResults();

        driver.quit();
    }

    private void assertResults() {
        By resultsByCSS = By.cssSelector("#yui_3_10_0_1_1543714537045_945");
        By resultsXpath = By.xpath("//*[@id=\"yui_3_10_0_1_1543714537045_945\"]");

    }

    private void submitSearch() {
        driver.findElement(By.id("uh-search-box")).submit();
    }

    private void typeQuery(String queryString) {
        driver.findElement(By.id("uh-search-box")).sendKeys(queryString);
    }

    private void openMainPage() {
        driver.get("https://yahoo.com");
    }
}
