Feature: darksky

 Scenario: Verify the current date is highlighted in Time Machine's calendar
   Given I am on darksky landing page
    When I click on time machine button
 Then I verify highlighted date is the same as current date
   And I close windows

   Scenario: Verify same values are displayed in the Today's data
     Given I am on darksky landing page
     When I click on today
     Then I verify minimum temperatures are the same
     And I verify maximum temperatures are the same
     And I close windows






