package steps;

import appobjects.ConfigMenuAppObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;


public class SelectDifficultySteps
{
    ConfigMenuAppObjects appObjects = new ConfigMenuAppObjects(Hooks.androidDriver);

    @Dado("que ignoro o login automático")
    public void queIgnoroOLoginAutomatico() throws Exception
    {
        appObjects.ignoreGoogleLoginPopup();
        System.out.println("Login Ignored");
    }

    @E("que eu abro as configurações")
    public void queEuAbroAsConfiguracoes() throws Exception
    {
        appObjects.openConfigMenu();
    }

    @E("que eu abro as opções de dificuldade")
    public void queEuAbroAsOpcoesDeDificuldade() throws Exception
    {
        appObjects.openDifficultyMenu();
    }
    @Então("seleciono o nível Médio")
    public void queSelecionoONivel() throws Exception
    {
        appObjects.selectDifficultyOption();
    }

}
