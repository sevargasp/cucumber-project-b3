package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.SmartBearLoginPage;
import io.loop.pages.SmartBearOrderPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;

public class SmartBearStepDefs {
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();
//    Select dropdown;

    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("smart.bear"));
        smartBearLoginPage.LoggIn();
        smartBearLoginPage.orderPage();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {//the string is
//        dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        smartBearOrderPage.goesToProduct(product);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantities) {
        smartBearOrderPage.sendQuantity(quantities);
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        smartBearOrderPage.sendCustomerName(name);
    }

    @When("user enters street {string}")
    public void user_enters_street(String streetName) {
        smartBearOrderPage.sendStreet(streetName);
    }

    @When("user enters city {string}")
    public void user_enters_city(String cityName) {
        smartBearOrderPage.sendCity(cityName);
    }

    @When("user enters state {string}")
    public void user_enters_state(String stateName) {
        smartBearOrderPage.sendState(stateName);
    }

    @When("user enters zip {string}")
    public void user_enters_zip(String zipName) {
        smartBearOrderPage.sendZip(zipName);

    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardOption) {
        smartBearOrderPage.sendCard(cardOption);
    }

    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String cardNumber) {
        smartBearOrderPage.sendCardNro(cardNumber);
    }

    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String cardExpirationNum) {
        smartBearOrderPage.sendCardExpiration(cardExpirationNum);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        smartBearOrderPage.clicking();
    }

    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String nameOrder) {
        BrowserUtils.waitForVisibility(smartBearOrderPage.doneMessage, 10);//verification of the message
        smartBearOrderPage.allOrdersButton();//clicking
//        Assert.assertTrue(smartBearOrderPage.rows.getFirst().getText().contains(nameOrder));
        smartBearOrderPage.getRows(nameOrder);

    }


}
