package tests;

import org.Demo2.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLandingPage extends BaseTest {

    @Test
    public void verifyLandingPage(){
        driver.get("https://www.google.com");
        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("google"));
    }
}
