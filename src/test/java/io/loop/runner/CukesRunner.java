package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",//donde se almacena features file
        glue = "io/loop/step_definitions",//estos son los path de las carpetas.--shows where step definitions is store
        dryRun = false,//generating the code snippet--solo unciona si es false--ayuda a generar el fragmento de codigo, pero solo si esta en true--lo que la consola me genere se pega en Login step defs

        tags = "@smoke",
        monochrome = true
)
public class CukesRunner {

}
