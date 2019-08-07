Feature: BriteERP
  #Brite_ERP:
  # is used by Company to manage the fundamentals of business  like
  # materials, finance, accounting and many other enterprise features

# User Story :
# As a user, when I already created an opportunity in CRM module
# of Bribe ERP application, I want to be able to delete it.

# Acceptance Criteria :
#1. Verify that user should be able to see the list view.
#2. Verify that user should be able to delete the opportunity from action drop down list

  @LoginCreateAndDelete
  Scenario: Login to BriteERP (Pre-condition)
    Given I navigate to "http://54.148.96.210/" webpage
    Then I click Login" button
    And I enter "username"  in username field
    And I enter "password" in password field
    Then I click submit button
    Then I go to "CRM" module
    And click on Create button
    Then in Opportunity Title field I enter title
    Then click on Create option

#    Given the Opportunity already created in CRM Module
    When the user clicks the list view
    Then the user should be able to see the Opportunities listed view
    When the user clicks the checkbox already created Opportunity
    Then the user should be able to delete the Opportunity from the Action dropdown
    Then the user should be able to see the Opportunities listed view





#Feature: Delete the Opportunity in CRM Module
#
#  Scenario: Login to BriteERP
#    Given I go to the "BriteERP" webpage
#    Then I click Login" button
#    And I enter "username"
#    And I enter "password"
#    Then I click submit button
#
#
#  Scenario: Delete the Opportunity in CRM Module, when you alredy created it
#    Given the Opportunity already created in CRM Module
#    When the user clicks the list view
#    Then  the user should be able the Opportunity listed view
#    When the user clicks the checkbox already created Opportunity
#    Then  the user should be able to delete the Opportunity from the Action dropdown