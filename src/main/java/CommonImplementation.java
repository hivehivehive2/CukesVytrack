
import cucumber.api.java.en.And;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;
import java.util.List;
import java.util.Random;

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
        userName_xpath.sendKeys(username);
        password_xpath.sendKeys(password);
        loginButton_xpath.click();
        util.waitFor(3);
    }

    public void mouseOverTab(String tabName) {      //HoverOver
        String xpath=String.format(String.valueOf(tabs_xpath),tabName);
        WebElement we = driver.findElement(By.xpath(xpath));
        Utilities.highlight(we);
        action.moveToElement(we).perform();
        util.waitFor(3);
    }

    public void clickOption(String opptionName) {
        String xpath = String.format(option_xpath, opptionName);
        WebElement welem = driver.findElement(By.xpath(xpath));
        Utilities.highlight(welem);
        Utilities.waitFor(1);
        welem.click();
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
        String xpath = usersFullName_xpath.getText();
        System.out.println(xpath + "  |  " + usersFullName);
        Assert.assertEquals(xpath, usersFullName);
    }

    public void logout(){
        action.click(userMenu_xpath).perform();
        Utilities.waitFor(2);
        action.click(logout_xpath).perform();
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
        Utilities.logInfo(page +" Cannot be accessed.", true);
    }

    public void messageShouldBeDisplayed(String msg) {
        String alertmsg = haveNoPermissionMsg_xpath.getText();
        System.out.println(alertmsg + " | " + msg);
        Assert.assertTrue(alertmsg.contains(msg));
    }

    public void loginAsValidUser(){
        String username = Utilities.configReader("storeManagerUsername");
        String password = Utilities.configReader("storeManagerPassword");
        userName_xpath.sendKeys(username);
        Utilities.waitFor(1);
        password_xpath.sendKeys(password);
        Utilities.waitFor(1);
        loginButton_xpath.click();
        Utilities.waitFor(3);
    }

    public void clickCreateCalendarEventButton(){
        Utilities.highlight(createCalendarButton_xpath);
        Utilities.waitFor(1);
        Utilities.screenShot();
        createCalendarButton_xpath.click();
        Utilities.waitFor(3);
    }
    public void clickOnRepeatCheckbox(){
        Utilities.highlight(repeatCheckBox);
        repeatCheckBox.click();
        Utilities.waitFor(3);
        Utilities.screenShot();
    }

    //("I Verify that in {string} dropDown {string} is selected by default")
    public void verifyThatInRepeatsDropDownDailySelectedByDefault(String daily) {
        String defaultValue = repeatsField.getText();
        Assert.assertEquals(defaultValue, daily );
        Utilities.logInfo(daily +" is selected by Default in Repeats Field Box", true);
    }

 //========= Activities ============================
    //("I choose {string} textBox from {string}")
    //I choose "Choose a Date" textBox from "Start"
    public void iChooseTextBoxFrom(String date, String start) {
        chooseADateStart.click();
        Utilities.waitFor(4);
        Utilities.screenShot();
    }

    //And I change date to "Sep", "2020", "6"
    public void changeDateToFuture(String month, String year, String day){
        Utilities.highlight(selectMonthField);
        selectMonthField.click();
        Utilities.waitFor(3);
        for (WebElement each: monthsList){
            if(each.getText().equals(month)){
                Utilities.highlight(each);
                Utilities.waitFor(2);
                each.click();
                break;
            }
        }
        Utilities.waitFor(3);
        Utilities.highlight(selectYearFiled);
        selectYearFiled.click();
        Utilities.waitFor(3);
        for (WebElement each: yearList){
            if(each.getText().equals(year)){
//                Utilities.waitFor(2);
                each.click();
                break;
            }
        }
        Utilities.waitFor(2);
        for (WebElement each: daysList){
            if(each.getText().equals(day)){
                Utilities.highlight(each);
                Utilities.waitFor(2);
                each.click();
                break;
            }
        }
        Utilities.waitFor(2);
        Utilities.screenShot();
    }

    //And I verify "End Date" is "Sep 6, 2020"
    public void verifyEndDateField(String date) {
        String endDate = endDateField.getAttribute("value");
        System.out.println(date +" | " + endDate);
        Assert.assertEquals(endDate, date);
        Utilities.waitFor(2);
    }

    public void chooseTimeTextBoxFrom(String start) {
        Utilities.highlight(startTimeField);
        Utilities.waitFor(2);
        startTimeField.click();
        Utilities.waitFor(3);
        Utilities.screenShot();
    }

    public void iChangeStartTimeTo(String time) {
        for (WebElement each: timeList){
            if(each.getText().equals(time)) {
                each.click();
                Utilities.waitFor(2);
                break;
            }
        }
    }

    public void verifyEndTimeChangesExactlyToOneHourLater() {
        String startTimeText = startTimeField.getAttribute("value");
        String endTimeText = endTimeField.getAttribute("value");

        int semicol = startTimeText.indexOf(":");
        String afterSemicolText = startTimeText.substring(semicol);

        String beforeSemicolText = startTimeText.substring(0, semicol);
        int hour = Integer.parseInt(beforeSemicolText) + 1;

        String expectedEndTime = hour+ afterSemicolText;

        System.out.println(endTimeText + " - "+ expectedEndTime);
        Assert.assertEquals(endTimeText, expectedEndTime);
        Utilities.logInfo(startTimeText +" changed to 1 hour later in End Time Box to: "+ expectedEndTime, true);

    }


}