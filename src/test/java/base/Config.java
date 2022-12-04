package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Collections;

public class Config  {



    public static WebDriver driver;
    // This variable is declared in a class (DriverInit) and initialized in "@BeforeClass" of various Test Plans(Test Classes)
    // We use this driver as variable to init the driver on other classes & for reusable purposes


    public static WebDriver setupBrowser (String driverType){

        if (driverType.equalsIgnoreCase("ch")) {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        }
        else if (driverType.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;
    }






}

