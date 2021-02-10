package steps;

import appobjects.ConfigMenuAppObjects;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.assertEquals;

public class LoginAccountSteps

{
    ConfigMenuAppObjects appObjects = new ConfigMenuAppObjects(Hooks.androidDriver);

    @E("seleciono a opção de logar")
    public void selecionoAOpcaoDeLogar() throws Exception
    {
        appObjects.openLoginForm();
    }

    @E("preencho o acesso com {string} e {string}")
    public void crioOLogin(String user, String pass) throws Exception
    {
        appObjects.loginToTheGame(user, pass);
    }

    @Entao("valido que o login foi realizado com o {string}")
    public void validoQueOLoginFoiRealizado(String nickname) throws Exception
    {
        String nicknameValidation = appObjects.userLoggedValidation();
        assertEquals(nicknameValidation, nickname);
    }

}
