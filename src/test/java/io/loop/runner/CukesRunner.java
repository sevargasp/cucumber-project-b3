package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-reports/json-report.json",
                "rerun:target/rerun.txt",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",//donde se almacena features file
        glue = "io/loop/step_definitions",//estos son los path de las carpetas.--shows where step definitions is store
        dryRun = false, //generating the code snippet--solo funciona si es false--ayuda a generar el fragmento de codigo, pero solo si esta en true--lo que la consola me genere se pega en Login step defs
        tags = "@smoke",
        monochrome = false,
        publish = true//this is to get link from the report.
)
public class CukesRunner {

}
