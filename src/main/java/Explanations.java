public class Explanations {

/*
Page ->
    all elements are stored there in String format.

===============================================================================
In Runner Class:

plugin={"html:target/reports","rerun:target/Failed/rerun.txt"},
 - we are setting up report:
 "html:target/reports"  -->
    html - is file format/extension, where actual report is written
    target - directory/package
    reports - directory/package in target directory/package,
            where index.html file is.

 "rerun:target/Failed/rerun.txt" -->
    rerun -
    target -
    Failed - directory/package in target directory/package
    rerun.txt - file inside Failed folder, where actual failed scenarios are.
                If all scenarios PASS, rerun.txt will be empty
=============================================================================

Saucelabs / cloud

- If you want to ensure and want to test your web application or mobile
application on multiple browsers, operating systems and devices,
Sauce Labs provide this platform where you can use all these
multiple platforms, operating systems , devices and browsers to test
your application.
(Collection of virtual machines that run your tests)

Open account in Saucelab.
    username = "allgamingishere"
    accessKey = "91e3ed7c-6fc5-43bb-904f-4c8803d4af39"

Setup in your Driver file:
        else if(driverName.equals("saucelabs")){
           try {
                String username = "allgamingishere";
                String accessKey = "91e3ed7c-6fc5-43bb-904f-4c8803d4af39"

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "Chrome");
                capabilities.setCapability("platform", "Windows 10");
                capabilities.setCapability("version", "66.0");

                String url = "http://" + username + ":" + accessKey + "@ondemand.saucelabs.com:80/wd/hub";                    driver = new RemoteWebDriver(new URL(url), capabilities);
                return driver;
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
In config.properties:  browser = saucelabs

=============================================================================

    //I verify that I can access "Vehicle contracts" page

    public void verifyCanAccessPage(String optionName){

       boolean pageContains = Driver.getDriver().getPageSource().contains(optionName);
            //Driver.getDriver()    -   Check if in the given webpage
            //.getPageSource()      -   in page's Source part (where are all elements)
            //.contains(optionName) -   does it contain String optionName

       Assert.assertTrue(pageContains);
    }
=============================================================================

 */
}
