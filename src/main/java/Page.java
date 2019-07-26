public class Page {

    public static String userName_xpath= "//input[@id='prependedInput']";
    public static String password_xpath= "//input[@id='prependedInput2']";
    public static String loginButton_xpath="//button[@id='_submit']";

    public static String tabs_xpath="//span[@class='title title-level-1' and contains(text(), '%s')]";
    public static String option_xpath = "//span[@class='title title-level-2' and text()='%s']";
    public static String pageName_xpath = "//h1[@class='oro-subtitle']";


    public static String usersFullName_xpath = "//li[@id='user-menu']";

    public static String userMenu_xpath = "//li[@id='user-menu']";
    public static String logout_xpath = "//a[@class='no-hash']/..";
    public static String haveNoPermissionMsg_xpath = "//div[@data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']";

}
