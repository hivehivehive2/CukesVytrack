#Gherkin language of Cucumber:
# key words are: Feature, Scenario, Background, Scenario outline, Examples
# Step key words: Given, When, Then, But, And

Feature: Vytrack

  @smoke
  Scenario: Menu options, driver
    #Given Navigate to login page // setUp in Hooks
    Given I login as a "driver"
    Then I Navigate to "Fleet" module
    And I click "Vehicles" option
    And I verify page title "Car - Entities - System - Car - Entities - System"
    And I verify page name "Cars"
    Then I Navigate to "Customers" module
    And I click "Accounts" option
    And I verify page title "Accounts - Customers"
    And I verify page name "Accounts"
    Then I Navigate to "Customers" module
    And I click "Contacts" option
    And I verify page title "Contacts - Customers"
    And I verify page name "Contacts"
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    And  I verify page title "Calendar Events - Activities"
    And I verify page name "Calendar Events"


 @smoke
 Scenario: Menu options, store manager
    Given I login as a "store manager"
    Then I Navigate to "Dashboards" module
    And I click "Dashboard" option
    And I verify page title "Dashboard - Dashboards"
    And I verify page name "Dashboard"
    Then I Navigate to "Fleet" module
    And I click "Vehicles" option
    And I verify page title "All - Car - Entities - System - Car - Entities - System"
    And I verify page name "All Cars"
    Then I Navigate to "Customers" module
    And I click "Accounts" option
    And I verify page title "All - Accounts - Customers"
    And I verify page name "All Accounts"
    Then I Navigate to "Customers" module
    And I click "Contacts" option
    And I verify page title "All - Contacts - Customers"
    And I verify page name "All Contacts"
    Then I Navigate to "Sales" module
    And I click "Opportunities" option
    And I verify page title "Open Opportunities - Opportunities - Sales"
    And I verify page name "Open Opportunities"
    Then I Navigate to "Activities" module
    And I click "Calls" option
    And I verify page title "All - Calls - Activities"
    And I verify page name "All Calls"
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    And I verify page title "All - Calendar Events - Activities"
    And I verify page name "All Calendar Events"