Feature: Activities

  Scenario: Date Test
    Given Login as Valid user
    #Then Go to Activities -> Calendar Events
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    Then I click on Create Calendar Event button
    #And I verify "Today's Month" and change to "Future Month"
    And I choose "Choose a Date" textBox from "Start"
    And I change date to "Sep", "2020", "6"
    And I verify End Date is "Sep 6, 2020"
    #When Change back the start date to today’s date
    And I choose "Chose a Date" textBox from "Start"
    And I change date to "Jul", "2019", "30"
    And I verify End Date is "Jul 30, 2019"

  Scenario: Time Test
    Given Login as Valid user
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    Then I click on Create Calendar Event button
    And I choose Time textBox from "Start"
    And I change Start Time to "9:00 AM"
    And I verify End Time changes exactly to one hour later

  Scenario: End Date/Time auto adjust tets
    Given Login as Valid user
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    Then I click on Create Calendar Event button
    And I choose Time textBox from "Start"
    And I change Start Time to "11:30 PM"
    And I verify End Date shows Tomorrows Date
    And I verify End Time is "12:30 AM"
