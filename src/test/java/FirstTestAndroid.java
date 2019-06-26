import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class FirstTestAndroid extends AbstractTestCase {

    @Test
    public void doSomeTest() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "samsung_galaxy_s6_8.1");
        caps.setCapability("browserName", "chrome");

        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
        actualTest(driver);
    }
}
