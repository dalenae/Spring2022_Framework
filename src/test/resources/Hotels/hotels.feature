Feature: Hotels

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











