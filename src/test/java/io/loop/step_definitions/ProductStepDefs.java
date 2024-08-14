package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.ProductPage;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

public class ProductStepDefs {
    ProductPage productPage = new ProductPage();
    private static final Logger LOG = LogManager.getLogger();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("product.url"));
        LOG.info("User is on Homepage");
    }

    @Then("User should be able to see expected prices in the following products")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products(List<Map<String, String>> productDetails) {
        //empieza a iterar desde el container que entrego(LIST)
        for (Map<String, String> eachProductDetail : productDetails) {
//                    System.out.println("===========Product Details=========");
//
//            System.out.println("productDetail.get(\"Category\") = " + productDetail.get("Category"));
//            System.out.println("productDetail.get(\"Product\") = " + productDetail.get("Product"));
//            System.out.println("productDetail.get(\"expectedPrice\") = " + productDetail.get("expectedPrice"));//cada una de estas es una llave, por eso es que puedo obtenerlas con el get.


            //click category
            productPage.clickCategory(eachProductDetail.get("Category"));

            //get actual price
            String actualPrice = productPage.getProductPrice(eachProductDetail.get("Product"));

            //get product price
            String expectedPrice = eachProductDetail.get("expectedPrice");

            assertEquals("Expected does not match the actual", expectedPrice, actualPrice);
            LOG.info("Validation of the price for: " + eachProductDetail.get("Category") + ", for Product " + eachProductDetail.get("Product"));
//con este esta iterando y revisando cada iteracion los valores.
        }

    }

    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(List<List<String>> productDetails) {
        for (List<String> eachProductDetailList : productDetails) {
            //category
            productPage.clickCategory(eachProductDetailList.get(0));
            //get actual price
            String actualPrice = productPage.getProductPrice(eachProductDetailList.get(1));
            //get expected result

            String expectedPrice = eachProductDetailList.get(2);
            assertEquals("Expected does not match the actual", expectedPrice, actualPrice);
            LOG.info("Validation of the price for: " + eachProductDetailList.get(0) + ", for Product " + eachProductDetailList.get(1));
        }

    }

    @Then("User should be able to see the following names in their groups")
    public void user_should_be_able_to_see_the_following_names_in_their_groups(Map<String, List<String>> students) {
        //goto group 2 and give the valuesde
        List<String> group2 = students.get("Group2");
        System.out.println("group2 = " + group2);

        List<String> group3 = students.get("Group3");
        System.out.println("group3 = " + group3);

    }

    @Then("User should be able to see the following names in their groups on Discord")
    public void user_should_be_able_to_see_the_following_names_in_their_groups_on_discord(List<Map<String, String>> listOfMap) {
        for (Map<String, String> eachMap : listOfMap) {
//            System.out.println("eachMap.get(\"Group2\") = " + eachMap.get("Group2"));
//            System.out.println("eachMap.get(\"Group3\") = " + eachMap.get("Group3"));

            System.out.println("eachMap.get(\"Group2\")" + eachMap.get("Group2") + " \teachMap.get(\"Group3\") = " + eachMap.get("Group3"));
        }

    }

    @Then("User should be able to see expected prices in the following products with Map Of List")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products_with_map_of_list(Map<String, List<String>> mapOfList) {
        System.out.println("mapOfList.get(\"Category\") = " + mapOfList.get("Category"));
        System.out.println("mapOfList.get(\"Product\") = " + mapOfList.get("Product"));
        System.out.println("mapOfList.get(\"expectedPrice\") = " + mapOfList.get("expectedPrice"));
    }
}
