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

public class MainMenuAppObjects
{
    protected AndroidDriver<AndroidElement> androidDriver;
    WebDriverWait wait;

    //Elements of the app
    @FindBy(id = "com.jogatina.tranca:id/buttonSinglePlayer")
    protected AndroidElement buttonSinglePlayer;

    @FindBy(id = "com.jogatina.tranca:id/buttonMultiPlayer")
    protected AndroidElement buttonMultiplayer;

    @FindBy(id = "com.jogatina.tranca:id/imageViewCrossPromotion")
    protected AndroidElement buttonCrossPromotion;

    @FindBy(id = "com.jogatina.tranca:id/buttonInviteFriends")
    protected AndroidElement buttonInviteFriends;

    @FindBy(id = "com.jogatina.tranca:id/buttonMoreGames")
    protected AndroidElement buttonMoreGames;

    //EXIT GAME
    @FindBy(id = "com.jogatina.tranca:id/textViewTitle")
    protected AndroidElement titleExitGame;

    @FindBy(id = "com.jogatina.tranca:id/textViewDescription")
    protected AndroidElement descriptionExitGame;

    @FindBy(id = "com.jogatina.tranca:id/textViewButton")
    protected AndroidElement buttonNoExitGame;

    @FindBy(id = "com.jogatina.tranca:id/textViewButtonExtra")
    protected AndroidElement buttonYesExitGame;


    //Constructor
    public MainMenuAppObjects(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
        wait = new WebDriverWait(androidDriver, 20);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(5)), this);
    }


    //Actions
    public String buttonPlayTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonSinglePlayer)).getText();
    }

    public String buttonMultiplayerTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonMultiplayer)).getText();
    }

    public String buttonCrossPromotionTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonCrossPromotion)).getText();
    }

    public String buttonInviteFriendsTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonInviteFriends)).getText();
    }

    public String buttonMoreGamesTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonMoreGames)).getText();
    }

    //EXIT GAME
    public void openPopupExitGame() throws Exception
    {
        TimeUnit.SECONDS.sleep(2);
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public String titleExitGameTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(titleExitGame)).getText();
    }

    public String descriptionExitGameTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(descriptionExitGame)).getText();
    }

    public String buttonNoExitGameTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonNoExitGame)).getText();
    }

    public String buttonYesExitGameTextValidation()
    {
        return wait.until(ExpectedConditions.visibilityOf(buttonYesExitGame)).getText();
    }
}
