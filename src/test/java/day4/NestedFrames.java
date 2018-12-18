package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames extends BaseTest {

    By iframeById = By.id("mce_0_ifr");
    By editorById = By.id("tinymce");
    By middleFrameContent = By.id("content");

    String frameTop = "frame-top";
    String frameMiddle = "frame-middle";

    @Test
    public void testIframe() {
        String url = "http://the-internet.herokuapp.com/tinymce";
        String inputMessageToType = "Text from Selenium";

        openPage(url);
        switchToIframe();
        clearEditor();
        sendKeysTo(editorById, inputMessageToType);

        String actualTextFromEditor = getTextFromElement(editorById);
        Assert.assertEquals(actualTextFromEditor, inputMessageToType);
    }


    @Test
    public void testNestedFrames() {
        String url = "http://the-internet.herokuapp.com/nested_frames";

        openPage(url);
        switchToIframeName(frameTop);
        switchToIframeName(frameMiddle);

        String actualTextOfTheMiddleElement = getTextFromElement(middleFrameContent);
        String expectedTextOfTheMiddleElement = "MIDDLE";

        Assert.assertEquals(actualTextOfTheMiddleElement, expectedTextOfTheMiddleElement);
    }

    private void clearEditor() {
        WebElement editor = driver.findElement(editorById);
        editor.clear();
    }

    public void switchToIframe() {
        WebElement iframeE1 =  driver.findElement(iframeById);
        driver.switchTo().frame(iframeE1);
    }

    public void switchToIframeName(String frameName) {
        driver.switchTo().frame(frameName);
    }
}
