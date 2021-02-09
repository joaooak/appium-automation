package appobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfigMenuAppObjects
{
    //protected AppiumDriver<RemoteWebElement> driver;
    protected AndroidDriver androidDriver;
    WebDriverWait wait;

    //Elements of the app
    @FindBy(id = "com.jogatina.tranca:id/buttonOptions")
    protected AndroidElement configMenuButton;

    @FindBy(id = "com.google.android.gms:id/account_picker_container")
    protected AndroidElement googleLoginPopup;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
    protected AndroidElement selectDifficultyButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    protected AndroidElement mediumDifficultyOption;

    //Constructor
    public ConfigMenuAppObjects(AndroidDriver<AndroidElement> androidDriver)
    {
        //this.driver = driver;
        this.androidDriver = androidDriver;
        wait = new WebDriverWait(androidDriver, 20);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(5)), this);
    }


    //Actions
    public void ignoreGoogleLoginPopup() throws Exception
    {
        wait.until(ExpectedConditions.visibilityOf(googleLoginPopup));
        //AndroidDriver<AndroidElement> androidDriver = (AndroidDriver)driver;
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void openConfigMenu()
    {
        wait.until(ExpectedConditions.visibilityOf(configMenuButton)).click();
    }

    public void openDifficultyMenu()
    {
        wait.until(ExpectedConditions.visibilityOf(selectDifficultyButton)).click();
    }

    public void selectDifficultyOption()
    {
        wait.until(ExpectedConditions.visibilityOf(mediumDifficultyOption)).click();
    }
}
