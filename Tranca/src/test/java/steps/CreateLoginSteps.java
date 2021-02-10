package steps;

import appobjects.ConfigMenuAppObjects;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class CreateLoginSteps
{
    ConfigMenuAppObjects appObjects = new ConfigMenuAppObjects(Hooks.androidDriver);

    @E("abro a menu de login")
    public void abroATelaDeLogin() throws Exception
    {
        appObjects.openLoginMenu();
    }

    @E("clico em cadastre-se")
    public void clicoEmCadastreSe() throws Exception
    {
        appObjects.openRegister();
    }

    @Entao("crio o login com {string} e {string}")
    public void crioOLogin(String user, String pass) throws Exception
    {
        appObjects.createLogin(user, pass);
    }
}
