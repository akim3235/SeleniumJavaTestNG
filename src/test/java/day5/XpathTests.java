package day5;

import day4.BaseTest;
import org.testng.annotations.Test;

public class XpathTests extends BaseTest {

    @Test
    public void test001() {
        String url = "http://52.9.182.211:3001/v1/log-in";

        openPage(url);

    }
}
