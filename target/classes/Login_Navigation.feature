#Automate the following functional and component test scenarios under
# the components package.

  Feature: Login_Navigation

  Scenario: Login test (positive)
    Given I login as a "store manager"
    And I verify "store manager name" is displayed on top right
    And I verify page name "Dashboard"
    Then I Log out
    Given I login as a "sales manager"
    And I verify "sales manager name" is displayed on top right
    #And A different "name" should be displayed on top right
    And I verify page name "Dashboard"
    Then I Log out
    Given I login as a "driver"
    And I verify "driver name" is displayed on top right
    #And A different name should be displayed on top right
    And I verify page name "Quick Launchpad"


#  Scenario: Login test (negative)
#    #1. Open Vytrack login page
#    Given I enter "valid username" and "invalid password" information
#    Then I click "login"
#    Then Message "Invalid user name or password." should be displayed
#    And I verify Page title is the same
#    And I verify url is the same
#

 Scenario: Vehicle contracts test store manager
   Given I login as a "store manager"
   Then I Navigate to "Fleet" module
   And I click "Vehicle Contracts" option
   And I verify that I can access "Vehicle Contract" page

 Scenario: Vehicle contracts test sales manager
   Given I login as a "sales manager"
   Then I Navigate to "Fleet" module
   And I click "Vehicle Contracts" option
   And I verify that I can access "Vehicle Contract" page

  Scenario: Vehicle contracts test driver
    Given I login as a "driver"
    Then I Navigate to "Fleet" module
    And I click "Vehicle Contracts" option
    And I verify that I cannot access "Vehicle contract" page
    Then Message "You do not have permission to perform this action." should be displayed