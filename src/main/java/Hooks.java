import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {


    static WebDriver driver;
    static Scenario currentScenario;

    @Before
    public void setUp(Scenario s){
        currentScenario = s; // embading ScreenShot (method)
        System.out.println("Setting up...");
        driver = Driver.getDriver();
        String url = "https://qa2.vytrack.com/user/login";
        driver.get(url);
        Utilities.waitFor(2);

        //GIVES DATE(TIME), MESSAGE and URL, without SCREENSHOT (because of False)
        Utilities.logInfo("Successfully navigated to "+url,false);
    }

    @After
    public void tearDown(){
        driver.quit();
        Driver.closeDriver();

    }

}