import com.google.common.io.Files;
import cucumber.api.Scenario;
import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;

public class Utilities {
//    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date);
//        LocalDateTime date2=LocalDateTime.now();
//        System.out.println(date);
//    }

    //GIVES THE TIME WHEN TEST WAS RUN, "PASS" , MESSAGE (that you pass), and SCREENSHOT IF PASS.
    public static void logInfo(String msg, boolean screenshot){ //call in StepDeffs
        Date date=new Date();
        Hooks.currentScenario.write(date+" Pass: "+msg);
        if(screenshot){
            screenShot();
        }
    }

    public static void highlight(WebElement webElement){
        //Highlights ONLY the borders
        //((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].style.border='3px solid yellow'", webElement);

        //Highlights borders and background too:
        ((JavascriptExecutor)Driver.getDriver()).executeScript(" arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", webElement);
    }


    public static void screenShot(){    //setup in Hooks
        WebDriver webDriver = Hooks.driver;
        Scenario scenario = Hooks.currentScenario;
        final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        // embed it in the report.
        scenario.embed(screenshot, "image/png");
    }

    public static void waitFor(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String configReader(String key) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
//=============================================================
   //Screenshot
    public void onException(Throwable throwable, WebDriver driver){
        System.out.println(throwable);
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screen = new File("screen-" + System.currentTimeMillis()+".png");
        try{
            Files.copy(tmp, screen);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
   //=====================================================
}
