package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);//to initialize

    }

    public void clickCategory(String category) {
        //there are 3 categories, i want to locate  from business lawyer-->//a[contains(.,'Laptops')]
        Driver.getDriver().findElement(By.xpath("//a[contains(.,'" + category + "')]")).click();
        //cada uno de las categorias, phones, laptops monitors, y lo hizo dinamico.
    }

    public String getProductPrice(String product) {
        String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='" + product + "']/../../h5")).getText();
//i have to handle the dollar sign, because in my table i dont have dollar sign---> itera por producto pero retorna el precio
        return actualPrice.substring(1);
    }

}
