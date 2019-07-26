import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {

    CommonImplementation impl = new CommonImplementation();


    @Given("I login as a {string}")
    public void iLoginAsA(String userType) {
        impl.loginUser(userType);
    }

    @Then("I Navigate to {string} module")
    public void iNavigateToModule(String tabName) {
        impl.mouseOverTab(tabName);
        Utilities.logInfo("Successfully navigated to the "+tabName+ " module.",true);
    }

    @And("I click {string} option")
    public void iClickOption(String option) {
        impl.clickOption(option);
    }

    @And("I verify page title {string}")
    public void iVerifyPageTitle(String title) {
        impl.verifyPageTitle(title);
    }

    @And("I verify page name {string}")
    public void iVerifyPageName(String pageName) {
        impl.verifyPageName(pageName);
    }

    @And("I verify {string} is displayed on top right")
    public void iVerifyIsDisplayedOnTopRight(String userName) {
        impl.verifyUserNameIsDisplayed(userName);
    }

    @Then("I Log out")
    public void iLogOut() {
        impl.logout();
    }

    @And("I verify that I can access {string} page")
    public void iVerifyThatICanAccessPage(String page) {
        impl.verifyCanAccessPage(page);
    }

    @Then("I verify that I cannot access {string} page")
    public void iVerifyThatICannotAccessPage(String page) {
        impl.verifyThatICannotAccessPage(page);
    }

    @Then("Message {string} should be displayed")
    public void message_should_be_displayed(String msg) {
        impl.messageShouldBeDisplayed(msg);
    }
}