package day5;

import day4.BaseTest;
import org.testng.annotations.Test;

public class XpathTests extends BaseTest {

    @Test
    public void test001() {
        String restId_CSS = "div.MuiFormControl-root-96:nth-child(2) > div:nth-child(2) > input:nth-child(1)";
        String restId_XPath1 = "/html/body/div/div/form/div/div[1]/div/input";
        String restId_XPath2 = "//form/div/div[1]/div/input";
        String restId_XPath3 = "//input[@name='restaurant_id']";
        String restId_XPath4 = "//*[@name='restaurant_id']";
        String restId_XPath5 = "//*[@name='restaurant_id'][@type='text']";
        String restId_XPath6 = "//*[@name='restaurant_id' and @type='text']";
        String restId_XPath7 = "//*[@name='restaurant_id' or @type='text']";
        String restId_XPath8 = "//*[contains(@name,'rest')]";
        String restId_XPath9 = "//*[starts-with(@name,'rest')]";
        String restId_XPath10 = "//*[text()='Log In']";
        String restId_XPath11 = "(//input[@type='text'])[last()]";
        String restId_XPath12 = "(//input[@type='text'])[position()=2]";

        String url = "http://52.9.182.211:3001/v1/log-in";

        openPage(url);

    }
}
