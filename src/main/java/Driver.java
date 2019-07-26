import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver== null) {
            String driverName = Utilities.configReader("browser");
            if (driverName.equalsIgnoreCase("Chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (driverName.equalsIgnoreCase("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }else if(driverName.equals("saucelabs")){
                try {
                    String username = "allgamingishere";    //username from Saucelab
                    String accessKey = "91e3ed7c-6fc5-43bb-904f-4c8803d4af39";

                    //Setup/choose BrowserName, platform, version where you want your test to be run
                    //If you want ro run tests in multiple BrowserName, platform, version
                    //then setup them all

                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("browserName", "Chrome");
                    capabilities.setCapability("platform", "Windows 10");
                    capabilities.setCapability("version", "66.0");

                    String url = "http://" + username + ":" + accessKey + "@ondemand.saucelabs.com:80/wd/hub";

                    //Re-initialize Webdriver driver to RemoteWebDriver,
                    // by calling RemoteWebDriver constructor, to run in the cloud
                    driver = new RemoteWebDriver(new URL(url), capabilities);

                    return driver;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }
        return  driver;
    }

    public static void closeDriver() {
        driver = null;
    }


}
