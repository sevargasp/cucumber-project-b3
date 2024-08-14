package io.loop.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /*
    Creating the private constructor so this class's object is not reachable from outside
     */

    private Driver(){}

    /*
    making driver instance private
    static - run before everything else and use ins static method
     */

    //private static WebDriver driver;
    // implement threadLocal to achieve multi thread locally
    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
    reusable method that will return the same driver instance everytime called
     */
//headless, i will not see the chrome
    /**
     * singleton patter
     * @return
     */
    public static WebDriver getDriver(){
        if(driverPool.get()==null){
            String browserType = ConfigurationReader.getProperties("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    break;
                case "safari":
                    driverPool.set(new SafariDriver());
                    break;
                case "headless":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driverPool.set(new ChromeDriver(options));
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driverPool.get();
    }

    /**
     * closing driver
     * @author nadir
     */
    public static void closeDriver(){
        if(driverPool.get() !=null){
            driverPool.get().quit();
            //driver = null;
            driverPool.remove();
        }
    }
}