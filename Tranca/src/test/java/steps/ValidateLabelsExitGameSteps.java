package steps;

import appobjects.MainMenuAppObjects;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.assertEquals;

public class ValidateLabelsExitGameSteps

{
    MainMenuAppObjects appObjects = new MainMenuAppObjects(Hooks.androidDriver);

    @E("abro o popup de sair do jogo")
    public void abroOPopupDeSairDoJogo() throws Exception
    {
        appObjects.openPopupExitGame();
    }

    @Entao("valido o título de sair do jogo {string}")
    public void validoOTituloDeSairDoJogo(String titleExitGame)
    {
        String titleExitGameReturn = appObjects.titleExitGameTextValidation();
        assertEquals(titleExitGame, titleExitGameReturn);
    }

    @Entao("valido a descrição de sair do jogo {string}")
    public void validoADescricaoDeSairDoJogo(String descriptionExitGame)
    {
        String descriptionExitGameReturn = appObjects.descriptionExitGameTextValidation();
        assertEquals(descriptionExitGame, descriptionExitGameReturn);
    }

    @Entao("valido o botão não de sair do jogo {string}")
    public void validoOBotaoNaoDeSairDoJogo(String buttonNoExitGame)
    {
        String buttonNoExitGameReturn = appObjects.buttonNoExitGameTextValidation();
        assertEquals(buttonNoExitGame, buttonNoExitGameReturn);
    }

    @Entao("valido o botão sim de sair do jogo {string}")
    public void validoOBotaoSimDeSairDoJogo(String buttonYesExitGame)
    {
        String buttonYesExitGameReturn = appObjects.buttonYesExitGameTextValidation();
        assertEquals(buttonYesExitGame, buttonYesExitGameReturn);
    }
}
