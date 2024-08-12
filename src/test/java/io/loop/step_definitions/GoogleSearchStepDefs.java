package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.GoogleSearchPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage(); //Creating an object of my class so i can get anything i have there

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
    }

    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        BrowserUtils.takeScreenshot();
    }

    @Then("user should see Loop Academy - Google Search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Expected result does not match actual", "Loop Academy - google Search", actualTitle);
    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String input) {
        googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);
    }

    @Then("user should see {string} in the google title")
    public void user_should_see_in_the_google_title(String expectedTitle) {
        assertEquals("Expected title: - " + expectedTitle + " does not match the actual: " + Driver.getDriver().getTitle(), expectedTitle, Driver.getDriver().getTitle());

    }

    @Then("user searches the following item")
    public void user_searches_the_following_item(List<Map<String, String>> items) throws InterruptedException {
        /*  @Then("user searches the following item")
//    public void user_searches_the_following_item(List<String> items) throws InterruptedException {
//        for (String item : items) {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(item + Keys.ENTER);
//            Thread.sleep(1000);
//            assertEquals(item + " - Google Search", Driver.getDriver().getTitle());
//        }
*/
        /*
//        items.forEach(p -> {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(p + Keys.ENTER);
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            assertEquals(p + " - Google Search", Driver.getDriver().getTitle());
//        });*/

        for (Map<String, String> item : items) {
            System.out.println("item.get(\"items\") = " + item.get("items"));
        }
    }

    @When("user searches for the {string}")
    public void user_search_for_the(String country) {
        googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
        BrowserUtils.justWait(DocuportConstants.small);
    }

    @Then("user should see the {string} in the result")
    public void user_should_see_the_in_the_result(String capital) {
        assertEquals("Expected capital city: " + capital + " does not match with actual one: " + googleSearchPage.capital.getText(), googleSearchPage.capital.getText(), capital);
    }

}
