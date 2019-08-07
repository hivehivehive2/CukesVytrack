import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page {

    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static String tabs_xpath="//span[@class='title title-level-1' and contains(text(), '%s')]";
    public static String option_xpath = "//span[@class='title title-level-2' and text()='%s']";
    public static String pageName_xpath = "//h1[@class='oro-subtitle']";


    @FindBy(id = "prependedInput")
    public WebElement userName_xpath;
    @FindBy(id = "prependedInput2")
    public WebElement password_xpath;
    @FindBy(id = "_submit")
    public WebElement loginButton_xpath;

    @FindBy(xpath = "//li[@id='user-menu']")
    public WebElement usersFullName_xpath;

    @FindBy(xpath = "//li[@id='user-menu']")
    public WebElement userMenu_xpath;

    @FindBy(xpath = "//a[@class='no-hash']/..")
    public WebElement logout_xpath;

    @FindBy (xpath = "//div[@data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']")
    public WebElement haveNoPermissionMsg_xpath;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarButton_xpath;

    //@FindBy(css = "[id^='recurrence-repeat-view']")
    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//span[@style='width: 292px; user-select: none;']")
    public WebElement repeatsField;



// =============Activities===============================================
    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    public WebElement calendarNextArrow;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
    public WebElement calendarPrevArrow;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement chooseADateStart;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement chooseADateEnd;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement selectMonthField;

    public WebElement getFutureMonth(int index){
        String xpath = "//select[@class='ui-datepicker-month']/option[@value='"+index+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy (xpath = "//select[@class='ui-datepicker-year']")
    public WebElement selectYearFiled;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']/option")
    public List<WebElement> yearList;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']/option")
    public List<WebElement> monthsList;

    @FindBy(xpath = "//a[@class='ui-state-default']")
    public List<WebElement> daysList;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement endDateField;

    @FindBy (xpath = "(//input[@placeholder='time'])[1]")
    public WebElement startTimeField;

    @FindBy (xpath = "(//input[@placeholder='time'])[2]")
    public WebElement endTimeField;

    @FindBy(xpath = "//ul[@class='ui-timepicker-list']/li")
    public List<WebElement> timeList;

}
