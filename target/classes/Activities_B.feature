Feature: Daily Repeat Tests

  Scenario: Daily repeat option, Repeat every, summary
    Given Login as Valid user
    Then I Navigate to "Activities" module
    And I click "Calendar Events" option
    Then I click on Create Calendar Event button
    And I click on "Repeat" checkbox
    Then I Verify that in Repeats dropDown "Daily" is selected by default
#    And Verify day(s) checkbox is selected and default value is 1
#    And Verify summary says Daily every 1 day
#    When Check the weekday checkbox
#    Then Verify that days input now disabled
#    And Verify summary says Daily every weekday


  Scenario: Daily repeat option, Repeat every, default values
    Given Log in as Valid user
    When Go to Activities -> Calendar Events
    Then Click on create new calendar event
    Then Click on Repeat checkbox
    And Verify that Daily is selected by default
    And Verify day(s) checkbox is selected and default value is 1
    And Verify summary says Daily every 1 day

#  Scenario: Daily repeat option, Repeat every day(s), error messages
#  Go to Activities -> Calendar Events
#  3. Click on create new calendar event
#  4. Click on Repeat checkbox
#  5. Test the day(s) input entering different values (boundary value analysis)
#  6. Verify error messages The value have not to be less than 1. and The value have not to be
#  more than 99. occur when values are too big or small
#  7. Verify that error messages disappear when valid values are entered
#
#  Scenario: Daily repeat option, Repeat every day(s), functionality
#  Go to Activities -> Calendar Events
#  3. Click on create new calendar event
#  4. Click on Repeat checkbox
#  5. Enter random value to the day(s) field
#  6. Verify that Summary says Daily every <random number> day
#  7. Enter another random value to the day(s) field
#  8. Verify that Summary updated with Daily every <random number> day
#
#  Scenario: Daily repeat option, blank fields
# Log in as Valid user
# 2. Go to Activities -> Calendar Events
# 3. Click on create new calendar event
# 4. Click on Repeat checkbox
# 5. Clear the value of the day(s) field
# 6. Message This value should not be blank. should come up
# 7. Enter a valid value to the day(s) field the
# 8. Message This value should not be blank. should disappear
# 9. Clear the value of the After occurrences field
# 10. Message This value should not be blank. should come up 11. Enter a valid value to the After occurrences field the
# 12. Message This value should not be blank. should disappear
#
#  Scenario: Daily repeat option, Ends, error messages
# Log in as Valid user
# 2. Go to Activities -> Calendar Events
# 3. Click on create new calendar event
# 4. Click on Repeat checkbox
# 5. Test the After occurrences input entering different values (boundary value analysis)
# 6. Verify error messages The value have not to be less than 1. and The value have not to be
# more than 99. occur when values are too big or small
# 7. Verify that error messages disappear when valid values are entered
#
#   Scenario: Daily repeat option, Ends, functionality
#   Log in as Valid user
#   2. Go to Activities -> Calendar Events
#   3. Click on create new calendar event
#   4. Click on Repeat checkbox
#   5. Enter random value to the After occurrences field
#   6. Verify that Summary says Daily every <random number> day
#   7. Enter another random value to the After occurrences field
#   8. Verify that Summary updated with Daily every <random number> day