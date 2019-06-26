import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class FirstTestIOS extends AbstractTestCase {

    /*
        As of now there is no way to emulate an ios device inside a docker to use it for testing... so this won't work
     */
    @Ignore
    @Test
    public void doSomeTest() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.4");
        caps.setCapability("deviceName", "iPhone 8");
        caps.setCapability("browserName", "Safari");

        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
        actualTest(driver);
    }

}
