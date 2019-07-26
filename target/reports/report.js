$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Login_Navigation.feature");
formatter.feature({
  "name": "Login_Navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Vehicle contracts test driver",
  "description": "",
  "keyword": "Scenario"
});
formatter.write("Fri Jul 26 12:24:49 EDT 2019 Pass: Successfully navigated to https://qa2.vytrack.com/user/login");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iLoginAsA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Navigate to \"Fleet\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToModule(String)"
});
formatter.write("Fri Jul 26 12:24:56 EDT 2019 Pass: Successfully navigated to the Fleet module.");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Vehicle Contracts\" option",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that I cannot access \"Vehicle contract\" page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyThatICannotAccessPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message \"You do not have permission to perform this action.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});