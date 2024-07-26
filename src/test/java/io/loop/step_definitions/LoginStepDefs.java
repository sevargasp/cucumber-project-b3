package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
//corriendo estos metodos, me va arrojar unos pasos del features, aqui es cuando la consola me arroja unas letras rojas con anotaciones.
//cucumber ayuda a generar code snippet
    //this is the code implementation.
    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        System.out.println("java is class");
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
        assertTrue(3 == 4);//lo hacemos fallar a propositoa
    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {

    }
    @When("user clicks login button")
    public void user_click_login_button() {

    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {

    }
    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {

    }

}
