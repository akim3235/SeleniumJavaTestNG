package day4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CodeEx1 {

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "madam" },
                { "jiberish" },
        };
    }

    @Test(dataProvider = "test1")
    public void testPalyndrome001(String input) {
        Boolean result = isPalyndrome(input);
        Assert.assertTrue(result);
    }


    private Boolean isPalyndrome(String input) {
        boolean result;
        String reversedInput = reverseInput(input);
        result = input.equals(reversedInput);
        return result;
    }

    private String reverseInput(String input){
        return new StringBuffer(input).reverse().toString();
    }
}
