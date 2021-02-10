package steps;

import appobjects.ConfigMenuAppObjects;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;


public class SelectDifficultySteps
{
    ConfigMenuAppObjects appObjects = new ConfigMenuAppObjects(Hooks.androidDriver);

    //Other variables
    String expectedResultTrue = "true";

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
    @E("seleciono o nível Médio")
    public void queSelecionoONivel() throws Exception
    {
        appObjects.selectDifficultyOption();
    }
    @Então("valido que foi alterado o nível")
    public void validoQueFoiAlteradoONível() throws Exception
    {
        String resultReturn = appObjects.difficultyLevelValidation();
        assertEquals(expectedResultTrue, resultReturn);
    }

}
