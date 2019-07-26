Feature: Delete the Opportunity in CRM Module

  Scenario: Login to BriteERP
    Given I go to the "BriteERP" webpage
    Then I click Login" button
    And I enter "username"
    And I enter "password"
    Then I click submit button


  Scenario: Delete the Opportunity in CRM Module, when you alredy created it
    Given the Opportunity already created in CRM Module
    When the user clicks the list view
    Then  the user should be able the Opportunity listed view
    When the user clicks the checkbox already created Opportunity
    Then  the user should be able to delete the Opportunity from the Action dropdown