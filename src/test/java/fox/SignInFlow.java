package fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInFlow {

//    WebDriver driver;

//    @BeforeSuite
//    public void suiteSetup(){
//        System.setProperty("webdriver.gecko.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/geckodriver");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//    }


    @Test
    public void foxNationOnFirefox() {
        System.setProperty("webdriver.gecko.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://nation.foxnews.com");
        WebElement element = driver.findElement(By.className("userLabel"));
        element.click();
        driver.findElement(By.name("email")).sendKeys("fdmvideotest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("fdmvideo1");
        driver.findElement(By.className("formSubmit")).submit();


//        String queryString = "Portnov School";
//
//        element.sendKeys(queryString);


//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        WebElement resultStatsElement = driver.findElement(By.id("resultStats"));
//        System.out.println(resultStatsElement.getText());


//        driver.quit();
    }

    @Test
    public void foxNationOnChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/akim/IdeaProjects/SeleniumJavaTestNG/src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://nation.foxnews.com");
        WebElement element = driver.findElement(By.className("userLabel"));
        element.click();
        driver.findElement(By.name("email")).sendKeys("fdmvideotest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("fdmvideo1");
        driver.findElement(By.className("formSubmit")).submit();

//        driver.quit();

    }
}
