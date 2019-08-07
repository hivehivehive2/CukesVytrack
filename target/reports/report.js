$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Activities_B.feature");
formatter.feature({
  "name": "Daily Repeat Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Daily repeat option, Repeat every, summary",
  "description": "",
  "keyword": "Scenario"
});
formatter.write("Tue Aug 06 23:34:53 EDT 2019 Pass: Successfully navigated to https://qa2.vytrack.com/user/login");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login as Valid user",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.loginAsValidUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Navigate to \"Activities\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.iNavigateToModule(String)"
});
formatter.write("Tue Aug 06 23:35:04 EDT 2019 Pass: Successfully navigated to the Activities module.");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Calendar Events\" option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.iClickOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create Calendar Event button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_Activities.iClickOnCreateCalendarEventButton()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Repeat\" checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_Activities.iClickOnCheckbox(String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify that in Repeats dropDown \"Daily\" is selected by default",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_Activities.iVerifyThatInRepeatsDropDownIsSelectedByDefault(String)"
});
formatter.write("Tue Aug 06 23:35:17 EDT 2019 Pass: Daily is selected by Default in Repeats Field Box");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify day(s) checkbox is selected and default value is 1",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify summary says Daily every 1 day",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Check the weekday checkbox",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that days input now disabled",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify summary says Daily every weekday",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});