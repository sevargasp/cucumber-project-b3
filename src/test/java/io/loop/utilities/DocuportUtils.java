package io.loop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DocuportUtils {
    /**
     * logins to the docuport application
     *
     * @param driver, which initialized in the test base
     * @param role,   comes from docuport constants
     *                author nadir
     */
    public static void login(WebDriver driver, String role) throws InterruptedException {
        driver.get("https://beta.docuport.app/");
        WebElement username = driver.findElement(By.xpath("//label[.='Username or email']/following-sibling::input"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        switch (role.toLowerCase()) {
            case "client":
                username.sendKeys(DocuportConstants.USERNAME_CLIENT);
                password.sendKeys(DocuportConstants.PASSWORD);
                break;
            case "supervisor":
                username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportConstants.PASSWORD);
                break;
            case "advisor":
                username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                password.sendKeys(DocuportConstants.PASSWORD);
                break;
            case "employee":
                username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportConstants.PASSWORD);
                break;
            default:
                //there is a possibility that we don't have a valid role.
                throw new InterruptedException("There is not such a role: " + role);
        }

        loginButton.click();
//this is just extra time to select the button continue.
        if (role.toLowerCase().equals("client")) {
            Thread.sleep(3000);//para que aparezca el mensaje
            WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
            cont.click();
            Thread.sleep(3000);
        }
    }

    /**
     * logs out from Docuport application
     *
     * @param driver
     * @athor Sergio
     */
    public static void logOut(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement userIcon = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}
