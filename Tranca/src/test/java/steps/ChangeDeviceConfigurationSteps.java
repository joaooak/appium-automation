package steps;

import io.cucumber.java.pt.Dado;

import static steps.Hooks.capabilities;

public class ChangeDeviceConfigurationSteps
{
    @Dado("que estou com o idioma {string} e {string} ativado")
    public void queEstouComOIdiomaAtivado(String language, String locale) throws Exception
    {
        Hooks.androidDriver.closeApp();
        capabilities.setCapability("language", language);
        capabilities.setCapability("locale", locale);
        Hooks.setup();
        System.out.println("App Started again in " + language + "-" + locale);
    }
}
