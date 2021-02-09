package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks
{
    //public static AppiumDriver<RemoteWebElement> driver;
    public static AndroidDriver<AndroidElement> androidDriver;

    @Before
    public void setup() throws Exception
    {
        try
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.jogatina.tranca");
            capabilities.setCapability("appActivity", "com.jogatina.menu.Splash");

            URL url = new URL("http://localhost:4723/wd/hub");
            //driver = new AppiumDriver<RemoteWebElement>(url, capabilities);
            androidDriver = new AndroidDriver<AndroidElement>(url, capabilities);
            System.out.println("App Started");
        }
        catch (Exception e)
        {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
