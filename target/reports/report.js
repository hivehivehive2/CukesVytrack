$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Customers.feature");
formatter.feature({
  "name": "Vytrack",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Menu options, driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.write("Fri Jul 26 17:43:28 EDT 2019 Pass: Successfully navigated to https://qa2.vytrack.com/user/login");
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
formatter.write("Fri Jul 26 17:43:40 EDT 2019 Pass: Successfully navigated to the Fleet module.");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Vehicles\" option",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d75.0.3770.142)\nBuild info: version: \u00274.0.0-alpha-1\u0027, revision: \u0027d1d3728cae\u0027, time: \u00272019-04-24T13:42:21\u0027\nSystem info: host: \u0027Aiguls-MacBook-Pro.local\u0027, ip: \u00272601:140:8400:5572:0:0:0:f65a%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.142, chrome: {chromedriverVersion: 75.0.3770.8 (681f24ea911fe7..., userDataDir: /var/folders/tz/btmxnzl173q...}, goog:chromeOptions: {debuggerAddress: localhost:64125}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: abfa0c9c6f570c84e78037cb1ff67647\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:190)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:124)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:577)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:308)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat CommonImplementation.clickOption(CommonImplementation.java:53)\n\tat MyStepdefs.iClickOption(MyStepdefs.java:23)\n\tat ✽.I click \"Vehicles\" option(file:src/main/resources/Customers.feature:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify page title \"Car - Entities - System - Car - Entities - System\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page name \"Cars\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Navigate to \"Customers\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToModule(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Accounts\" option",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page title \"Accounts - Customers\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page name \"Accounts\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Navigate to \"Customers\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToModule(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Contacts\" option",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page title \"Contacts - Customers\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page name \"Contacts\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Navigate to \"Activities\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToModule(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Calendar Events\" option",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickOption(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page title \"Calendar Events - Activities\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify page name \"Calendar Events\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iVerifyPageName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});