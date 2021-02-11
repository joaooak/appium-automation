package steps;

import appobjects.MainMenuAppObjects;
import io.cucumber.java.pt.Entao;
import static org.junit.Assert.assertEquals;


public class ValidateLabelsHomeSteps {
    MainMenuAppObjects appObjects = new MainMenuAppObjects(Hooks.androidDriver);

    @Entao("valido o botão jogar agora {string}")
    public void queValidoOBotaoPlay(String buttonPlay) {
        String buttonPlayReturn = appObjects.buttonPlayTextValidation();
        assertEquals(buttonPlay, buttonPlayReturn);
    }

    @Entao("valido o botão jogar com pessoas {string}")
    public void queValidoOBotaoMultiplayer(String buttonMultiplayer) {
        String buttonMultiplayerReturn = appObjects.buttonMultiplayerTextValidation();
        assertEquals(buttonMultiplayer, buttonMultiplayerReturn);
    }

    @Entao("valido o botão promoção cruzada {string}")
    public void queValidoOBotaoCrossPromotion(String buttonCrossPromotion) {
        String buttonMultiplayerReturn = appObjects.buttonCrossPromotionTextValidation();
        assertEquals(buttonCrossPromotion, buttonMultiplayerReturn);
    }

    @Entao("valido o botão convidar amigos {string}")
    public void queValidoOBotaoInviteFriends(String buttonInviteFriends) {
        String buttonInviteFriendsReturn = appObjects.buttonInviteFriendsTextValidation();
        assertEquals(buttonInviteFriends, buttonInviteFriendsReturn);
    }

    @Entao("valido o botão mais jogos {string}")
    public void queValidoOBotaoMoreGames(String buttonMoreGames) {
        String buttonMoreGamesReturn = appObjects.buttonMoreGamesTextValidation();
        assertEquals(buttonMoreGames, buttonMoreGamesReturn);
    }

}
