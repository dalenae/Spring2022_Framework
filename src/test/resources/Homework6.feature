Feature: Homework 6


  // Darksky testcases // Facebook testcases // Hotels testcases
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

  Scenario:
    Given I am on facebook landing page
    When I click on facebook pay link
    And I click on Oculus link
    And I click on Instagram link
    And I click on Portal link
    And I click on Bulletin link
    When I close all windows except for Instagram
    And I close windows

  Scenario: Verify destination error displayed if search with no destination
    Given I am on hotels landing page
    When I click hotels search button
    Then I verify destination error is displayed
    And I close windows

  Scenario: Verify enter-children's age error is displayed as soon user add a child and,
  error is NOT displayed as soon user enters children's age
    Given I am on hotels landing page
    When I click travelers button
    And I add children
    Then I verify ages error is displayed
    When I select an age for children
    And I click done button
    And I close windows




