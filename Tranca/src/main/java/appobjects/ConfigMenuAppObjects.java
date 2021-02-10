package appobjects;

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
import java.util.concurrent.TimeUnit;

public class ConfigMenuAppObjects {
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

    @FindBy(id = "com.jogatina.tranca:id/textViewPrefsTitleLine2")
    protected AndroidElement loginPageButton;

    //Google
    @FindBy(className = "android.widget.TextView")
    protected AndroidElement loginGoogleEmails;


    //Sign up
    @FindBy(id = "com.jogatina.tranca:id/btnSignup")
    protected AndroidElement signUpButton;

    @FindBy(id = "com.jogatina.tranca:id/inputEmail")
    protected AndroidElement fieldSignUpFillEmail;

    @FindBy(id = "com.jogatina.tranca:id/inputPwd")
    protected AndroidElement fieldSignUpFillPass;

    @FindBy(id = "com.jogatina.tranca:id/btnSignup")
    protected AndroidElement signUpSubmitButton;

    //Login
    @FindBy(id = "com.jogatina.tranca:id/btnLogin")
    protected AndroidElement loginButton;

    @FindBy(id = "com.jogatina.tranca:id/inputEmail")
    protected AndroidElement fieldLoginFillEmail;

    @FindBy(id = "com.jogatina.tranca:id/inputPwd")
    protected AndroidElement fieldLoginFillPass;

    @FindBy(id = "com.jogatina.tranca:id/btnPlayNow")
    protected AndroidElement loginSubmitButton;

    @FindBy(id = "com.jogatina.tranca:id/playerNick")
    protected AndroidElement playerNickTitle;


    //Constructor
    public ConfigMenuAppObjects(AndroidDriver<AndroidElement> androidDriver) {
        //this.driver = driver;
        this.androidDriver = androidDriver;
        wait = new WebDriverWait(androidDriver, 20);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(5)), this);
    }


    //Actions
    public void ignoreGoogleLoginPopup() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(googleLoginPopup));
        //AndroidDriver<AndroidElement> androidDriver = (AndroidDriver)driver;
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void openConfigMenu() {
        wait.until(ExpectedConditions.visibilityOf(configMenuButton)).click();
    }

    public void openDifficultyMenu() {
        wait.until(ExpectedConditions.visibilityOf(selectDifficultyButton)).click();
    }

    public void selectDifficultyOption() {
        wait.until(ExpectedConditions.visibilityOf(mediumDifficultyOption)).click();
    }

    public String difficultyLevelValidation() {
        wait.until(ExpectedConditions.visibilityOf(selectDifficultyButton)).click();
        wait.until(ExpectedConditions.visibilityOf(mediumDifficultyOption));
        return mediumDifficultyOption.getAttribute("checked");
    }

    //Sign Up
    public void openLoginMenu() {
        wait.until(ExpectedConditions.visibilityOf(loginPageButton)).click();
    }

    public void openRegister() {
        wait.until(ExpectedConditions.visibilityOf(signUpButton)).click();
    }

    public void createLogin(String user, String pass) throws Exception
    {
        TimeUnit.SECONDS.sleep(2);
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));

        wait.until(ExpectedConditions.visibilityOf(fieldSignUpFillEmail)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOf(fieldSignUpFillPass)).sendKeys(pass);
        wait.until(ExpectedConditions.visibilityOf(signUpSubmitButton)).click();
    }

    //Login
    public void openLoginForm() {
        wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
    }

    public void loginToTheGame(String user, String pass) throws Exception
    {
        TimeUnit.SECONDS.sleep(2);
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));

        wait.until(ExpectedConditions.visibilityOf(fieldLoginFillEmail)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOf(fieldLoginFillPass)).sendKeys(pass);
        wait.until(ExpectedConditions.visibilityOf(loginSubmitButton)).click();
    }

    public String userLoggedValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(playerNickTitle)).getText();
    }
}
