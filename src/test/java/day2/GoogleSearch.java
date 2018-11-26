package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    @Test
    public void testSearch() {
        System.setProperty("webdriver.gecko.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        WebElement element = driver.findElement(By.cssSelector(".gLFyf"));

        String queryString = "Portnov School";

        element.sendKeys(queryString);

        element.submit();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement resultStatsElement = driver.findElement(By.id("resultStats"));
        System.out.println(resultStatsElement.getText());


        driver.quit();
    }


    public void expliciteWait(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
    }


    public void threadSleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
