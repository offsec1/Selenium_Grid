import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class AbstractTestCase {
    protected RemoteWebDriver driver;

    static String HUB_URL = "http://127.0.0.1:4444/wd/hub";

    private static String LOGIN_URL = "https://morgenpost.de/";

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void actualTest(RemoteWebDriver driver) {
        driver.navigate().to(LOGIN_URL);
        Assert.assertTrue("failed", driver.getCurrentUrl().contains("morgenpost"));
    }
}
