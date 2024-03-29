package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    static WebDriver driver;


    public static WebDriver getDriver(){

        System.setProperty("webdriver.chrome.driver",
                "/Users/hassonzy/Desktop/CodeWise/Drivers/chromedriver");


        if(driver != null){
            return driver;
        }


        String browser = Config.getProperty("browser");

        switch (browser) {
            case "chrome" ->
                    driver = new ChromeDriver();
            case "firefox" ->
                    driver = new FirefoxDriver();
            default ->
                    driver = new ChromeDriver();
        }



        driver.manage().window().maximize();
        /*
        PageLoadTimeout waits until all elements in the page are loaded
         */
        int pageWait = Integer.parseInt(Config.getProperty("pageLoadTimeOut"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageWait));

        /*
        Implicit wait, wait until element is visible
         */
        int waitTime = Integer.parseInt(Config.getProperty("implicitWait"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));

        return driver;
    }



    public static void closeDriver (){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }



}
