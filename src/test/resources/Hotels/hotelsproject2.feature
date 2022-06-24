Feature: HotelsProject2

  Background: I am on hotels landing page
    Given I am on hotels landing page

    @TC-22
  Scenario: Verify error message for invalid data in SignUp form
    When I click on sign in field
    And I click on sign up link
  And I enter email (dfdhjfh@gmail.com) address on sign up
  When I enter first name (Dalena!) on sign up
 Then I verify (First name cannot contain special characters) sign up error is displayed
  When I enter last name (Esdh$) on sign up
  Then I verify (Last name cannot contain special characters) sign up error is displayed
  When I enter password (.+) on sign up
  Then I verify that sign up checkbox is displayed and enabled
 Then I verify that continue button is displayed but not enabled
    Then I close windows

    @TC-25
    Scenario: Verify user can submit feedback after completing the feedback form
  When I select feedback from sign in dropdown
  And I select (3) star rating
  And I enter (good experience) in comments field
    When I select (Unsure) as answer in How likely are you to return to Hotels.com
  And I select (Yes) as answer in prior to visit question
  And I select (Yes) as answer in did you accomplish question
  And I click on Submit button
  Then I verify submission message is displayed
    Then I close windows

      @TC-26
      Scenario: Verify links on Deals page
        When I click on more travel
        And I click on deals page link
      Then I verify amazing deals with free cancellation heading is displayed
     When I click on free cancellation heading
        Then I close windows

     @TC-23
      Scenario: Verify filter-by and sort-by functionality works as expected
     When I type destination Manhattan, NY
       












