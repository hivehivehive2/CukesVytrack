import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepDefs_Activities {

    CommonImplementation impl = new CommonImplementation();

    @And("I click on {string} checkbox") //@And("I click on Repeat checkbox")
    public void iClickOnCheckbox(String arg0) {
        impl.clickOnRepeatCheckbox();
    }

    @And("I choose {string} textBox from {string}")
    public void iChooseTextBoxFrom(String date, String start) {
        impl.iChooseTextBoxFrom(date, start);
    }

    @Then("I click on Create Calendar Event button")
    public void iClickOnCreateCalendarEventButton() {
        impl.clickCreateCalendarEventButton();
    }

    @And("I change date to {string}, {string}, {string}")
    public void iChangeDateTo(String month, String year, String day) {
        impl.changeDateToFuture(month, year, day);
    }

    @And("I verify End Date is {string}")
    public void iVerifyEndDateIs(String date) {
        impl.verifyEndDateField(date);
        Utilities.logInfo("End Date is: " + date + " successfully displayed", true);
    }

    @And("I choose Time textBox from {string}") //start
    public void iChooseTimeTextBoxFrom(String start) {
        impl.chooseTimeTextBoxFrom(start);
    }
    // I change Start Time to "9:00 AM"
    @And("I change Start Time to {string}")
    public void iChangeStartTimeTo(String time) {
        impl.iChangeStartTimeTo(time);
    }

    @And("I verify End Time changes exactly to one hour later")
    public void iVerifyEndTimeChangesExactlyToOneHourLater() {
        impl.verifyEndTimeChangesExactlyToOneHourLater();
    }


//==========Activities_B=====================================================

    @Then("I Verify that in Repeats dropDown {string} is selected by default")
    public void iVerifyThatInRepeatsDropDownIsSelectedByDefault(String daily) {
        impl.verifyThatInRepeatsDropDownDailySelectedByDefault(daily);
    }
}
