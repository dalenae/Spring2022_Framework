Feature: HotelsProject

  Background: I am on hotels landing page
    Given I am on hotels landing page

   @TC-17
    Scenario: Verify past date and back button on Current month's calendar is disabled
     When I click on Calendar check in button
#    Then I verify past dates are disabled
#     And I verify back button on current month is disabled
#    When I click on done button on calendar
#     And click on Checkout Calendar
#    Then I verify For current month
#     And I verify past dates are disabled
#     And I verify back button on current month is disabled
     Then I close windows

     @TC-18
     Scenario: Verify user can update number of guests on Home page
       When I click on Travelers
       And I add (6) adult travelers
       And I add (2) child travelers
       And I select first child age as 4 and I select second child age as under 1
       And I click done on travelers
       And I close windows

       @TC-19
       Scenario: Verify Share feedback button is displayed at the end of search results
        When I enter bora in destination
       And I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
       And I select August 1, 2022 as Check-in
       And I select August 10, 2022 as Check-out
#       And I click Apply
#       And I click on Search button
#       Then I verify at the end of search results that error message is displayed
#       And I close windows

       @TC-20
         Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
         When I click on sign in field
         And I click on sign up link
         Then I verify Terms and Conditions page opens in new tab
         And I click Terms and Conditions link
         When I click Privacy Statement link
         Then I verify Privacy Statement page opens in new tab
           And I close windows

          @TC-21
           Scenario: Verify Verification message for invalid sign in credentials
            When I click on sign in field
            And I click sign in button
            And I enter invalid email address
            And I enter invalid password
           And I click on sign in button on sign in page
          Then I verify email and password error message is displayed
           And I close windows

           @TC-24
            Scenario: Verify error is displayed when user submits the empty feedback form
             When I click on sign in field
             And I select feedback from sign in dropdown
             And I click on Submit button
             Then I verify error message is displayed
            Then I verify star boxes section is in a red dotted box
             And I close windows





