package runtest;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty"}, glue = "steps", features = "src/test/java/features", tags = "@CriarLoginELogar", publish = false)
    public class RunTest
    {

    }

