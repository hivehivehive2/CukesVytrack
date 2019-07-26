
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class CommonImplementation extends Page{

    Utilities util=new Utilities();
    WebDriver driver=Driver.getDriver();
    Actions action=new Actions(driver);  //Action is a ready class in selenium

    public void loginUser(String userType) {
        String username="";
        String password="";

        if(userType.equalsIgnoreCase("driver")){
            username=Utilities.configReader("driverUsername");
            password=Utilities.configReader("driverPassword");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username=Utilities.configReader("salesManagerUsername");
            password=Utilities.configReader("salesManagerPassword");
        }else if (userType.equalsIgnoreCase("store manager")){
            username=Utilities.configReader("storeManagerUsername");
            password=Utilities.configReader("storeManagerPassword");
        }

        driver.findElement(By.xpath(userName_xpath)).sendKeys(username);
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
        driver.findElement(By.xpath(loginButton_xpath)).click();
        util.waitFor(3);

    }

    public void mouseOverTab(String tabName) {      //HoverOver
        String xpath=String.format(tabs_xpath,tabName);
        WebElement we=driver.findElement(By.xpath(xpath));
        Utilities.highlight(we);
        action.moveToElement(we).perform();
        util.waitFor(3);
    }

    public void clickOption(String opptionName) {
        String xpath = String.format(option_xpath, opptionName);
        WebElement we=driver.findElement(By.xpath(xpath));
        Utilities.highlight(we);
        Utilities.waitFor(1);
        we.click();
        util.waitFor(4);
    }

    public void verifyPageTitle(String title){
        String actual = driver.getTitle();
        Assert.assertEquals(title,actual);

    }
    public void verifyPageName(String pageName) {
        String xpath = driver.findElement(By.xpath(pageName_xpath)).getText();
        System.out.println(xpath +"  |  " + pageName);
        Assert.assertEquals(xpath, pageName);
    }

    //I verify {userName} is displayed on top right
    public void verifyUserNameIsDisplayed(String userName){
        String usersFullName = "";
        if (userName.equalsIgnoreCase("store manager name")){
            usersFullName =Utilities.configReader("storeManagerName");
        } else if (userName.equalsIgnoreCase("sales manager name")){
            usersFullName = Utilities.configReader("salesManagerName");
        } else if (userName.equalsIgnoreCase(("driver name"))){
            usersFullName = Utilities.configReader("driverName");
        }
        String xpath = driver.findElement(By.xpath(usersFullName_xpath)).getText();
        System.out.println(xpath + "  |  " + usersFullName);
        Assert.assertEquals(xpath, usersFullName);
    }

    public void logout(){
        action.click(driver.findElement(By.xpath(userMenu_xpath))).perform();
        Utilities.waitFor(2);
        action.click(driver.findElement(By.xpath(logout_xpath))).perform();
        Utilities.waitFor(3);
    }

    //I verify that I can access "Vehicle contracts" page
    public void verifyCanAccessPage(String optionName){
//       boolean pageContains= Driver.getDriver().getPageSource().contains(optionName);
//       Assert.assertTrue(pageContains);
        String actual = driver.getTitle();
        Assert.assertTrue(actual.contains(optionName));
        Utilities.waitFor(3);
    }

    public void verifyThatICannotAccessPage(String page) {
        String actual = driver.getTitle();
        Assert.assertFalse(actual.contains(page));
        Utilities.waitFor(3);
    }

    public void messageShouldBeDisplayed(String msg) {
        WebElement alert = driver.findElement(By.xpath(haveNoPermissionMsg_xpath));
        String alertmsg = alert.getText();
        System.out.println(alertmsg + " | " + msg);
        Assert.assertTrue(alertmsg.contains(msg));
    }

}