import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class FirstTestDesktopFirefox extends AbstractTestCase {

    @Test
    public void doSomeTest() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "firefox");
        caps.setCapability("browserVersion", "67.0.2");
        caps.setCapability("platformName", "LINUX");

        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
        actualTest(driver);
    }
}
