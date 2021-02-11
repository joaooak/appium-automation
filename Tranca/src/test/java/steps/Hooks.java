package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;


public class Hooks {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static DesiredCapabilities capabilities = new DesiredCapabilities();

    @Before
    public static void setup() throws Exception{
        try {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.jogatina.tranca");
            capabilities.setCapability("appActivity", "com.jogatina.menu.Splash");

            URL url = new URL("http://localhost:4723/wd/hub");
            androidDriver = new AndroidDriver<>(url, capabilities);
            System.out.println("App Started");
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        androidDriver.quit();
    }

}
