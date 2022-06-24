package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Pages.Hotels.LandingPage2;
import Web.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HotelsSD {
   LandingPage lpage = new LandingPage();
   LandingPage2 lpage2 = new LandingPage2();

    @Given("^I am on hotels landing page$")
    public void openHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @When("^I click hotels search button$")
    public void clickHotelsSearchButton() {
        lpage.clickSearchBtn();}

    @When("^I click on Calendar check in button$")
    public void clickCalendarCheckIn() {
        lpage.clickCheckInBtn();
    }

    @Then("^I verify destination error is displayed$")
    public void verifySearchErrorMessage() {
        Assert.assertTrue(lpage.isSearchErrorDisplayed()); }

    @When("^I click travelers button$")
    public void clickTravelersButton() {
        lpage.clickOnTravelersBox();
    }
    @When("I add children")
    public void addChildren() {
        lpage.increaseChildTravelerCount();
    }

    @Then("I verify ages error is displayed")
    public void verifyAgesErrorIsDisplayed() {
        Assert.assertTrue(lpage.isTravelerErrorDisplayed());
    }

    @When("I select an age for children")
    public void selectChildrensAge() {
        lpage.selectChildrenAge();
    }

    @When("^I add (.+) child travelers$")
    public void addChildren(int childCount) {
        lpage2.increaseChildTravelerCount(childCount); }

    @When("^I add (.+) adult travelers$")
    public void addAdults(int adultCount) {
        lpage2.increaseAdultTravelerCount(adultCount); }

    @When("I click done on travelers")
    public void clickDoneBtn() {
        lpage.clickTravelerDoneBtn();
    }

    @When ("^I click on sign in field$")
    public void clickSignIn() {lpage2.clickSignInField();}

    @When ("^I click sign in button$")
    public void clickSignInButton() {lpage2.clickSignInBtn();}

    @When("I enter invalid email address")
        public void enterInvalidEmail() {lpage2.enterInvalidEmail(); }

    @When("I enter invalid password$")
    public void enterInvalidPassword() {lpage2.enterInvalidPassword();}

    @When("^I click on sign in button on sign in page$")
    public void clickSignInOnSignInPage() {lpage2.clickSignInBtnOnSignInPage();}

    @Then("^I verify email and password error message is displayed$")
    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(lpage2.isSignInErrorMessageDisplayed(),"Error message was not displayed"); }

    //signuppage
    @When("^I click on sign up link$")
    public void clickOnSignUpLink() {lpage2.clickSignUpBtn();}

    @When("^I enter email (.+) address on sign up$")
    public void enterSignUpEmail(String userInput) {
       lpage2.enterEmail(userInput); }

    @When("^I enter first name (.+) on sign up$")
    public void enterSignUpFirstName(String userInput) {
        lpage2.enterFirstName(userInput); }

    @Then("^I verify (.+) sign up error is displayed$")
    public void verifyFirstNameErrorMessage(String userInput) {
        Assert.assertTrue(lpage2.signUpErrors(userInput),"Test Fail - Error was not displayed"); }

    @When("^I enter last name (.+) on sign up$")
    public void enterSignUpLastName(String userInput) {
        lpage2.enterLastName(userInput); }

    @When("^I enter password (.+) on sign up$")
    public void enterSignUpPassword(String userInput) {
        lpage2.enterPassword(userInput); }

    @Then("I verify that sign up checkbox is displayed and enabled")
    public void verifySignUpCheckbox() {
        Assert.assertTrue(lpage2.isSignUpCheckboxEnabled(),"Test Fail - Checkbox is not enabled");
        Assert.assertTrue(lpage2.isSignUpCheckboxDisplayed(),"Test Fail - Checkbox is not displayed");}

    @Then("I verify that continue button is displayed but not enabled")
    public void verifyContinueButton() {
        Assert.assertFalse(lpage2.isContinueBtnEnabled(),"Test Fail - Continue btn was enabled");
        Assert.assertTrue(lpage2.isContinueBtnDisplayed(),"Test Fail - Continue btn was not displayed");
    }





    @When("^I click on Travelers$")
    public void clickOnTravelers() {lpage2.clickOnTravelersBox();}

    @When("^I select first child age as 4 and I select second child age as under 1$")
    public void selectChildrensAges() {lpage2.selectChildrenAge();}

    @When("^I enter bora in destination")
    public void enterBoraInDestination() {lpage2.typeBoraInSearchBar();}

    @When("^I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion$")
    public void clickBoraSuggestion() {lpage2.clickDestinationSuggestion( "Bora Bora, Leeward Islands, French Polynesia"); }

    @When("^I select August 1, 2022 as Check-in$")
    public void chooseSpecificDate() {lpage2.selectDayMonthYear("1 August 2022");}

    @When("^I select August 10, 2022 as Check-out$")
    public void chooseSpecificDate2() {lpage2.selectDayMonthYear("10 August 2022");}

    @When("^I type destination (.+)$")
    public void typeDestination(String inputDestination) {
        lpage2.typeInSearchBar(inputDestination);}




    //feedbackpage
    @When("^I select feedback from sign in dropdown$")
    public void selectWebsiteFeedbackFromHelp() {lpage2.clickFeedbackPage();}

    @When("^I click on Submit button$")
    public void clickSubmitBtnOnFeedbackPage()
    { lpage2.clickSubmitOnFeedback(); }

    @Then("^I verify error message is displayed$")
    public void verifyErrorMessageIsDisplayedOnFeedbackPg()
    {Assert.assertTrue(lpage2.isFeedbackPageErrorMessageDisplayed(),"Error message is not displayed"); }

    @Then("^I verify star boxes section is in a red dotted box$")
    public void verifyRedDottedBoxIsDisplayed()
    {Assert.assertTrue(lpage2.isRedDottedBorderDisplayed(),"Red dotted box is not displayed");}

    @When("^I select (.+) star rating$")
    public void selectStarRating(String starValue) {
        lpage2.clickStarRating(starValue);}

    @When("^I enter (.+) in comments field$")
    public void enterTextInCommentsField(String userInput) {
        lpage2.enterTextInComments(userInput); }

    @When("^I select (.+) as answer in How likely are you to return to Hotels.com$")
    public void chooseDropdownAnswer(String answerToSelect) {
        lpage2.selectReturnQuestion(answerToSelect); }

    @When("^I select (.+) as answer in prior to visit question$")
    public void selectPriorBookingAnswerBtn(String userInput) {
        lpage2.selectPriorBookingAnswer(userInput);}

    @When("^I select (.+) as answer in did you accomplish question$")
    public void didYouAccomplishAnswerBtn(String userAnswer) {
        lpage2.didYouAccomplishAnswer(userAnswer);}

    @Then("I verify submission message is displayed")
    public void verifyFormSubmissionMessage() {
        Assert.assertTrue(lpage2.isThankYouMessageDisplayed());}


 //SignUp Page
    @When("^I click Terms and Conditions link$")
    public void clickTermsAndCondLink() {lpage2.clickTermsAndCondOnSignUpPage();}

   @When("^I click Privacy Statement link$")
   public void clickPrivacyStatementlink() {lpage2.clickPrivacyStatementSignUpPage();}

    @Then("^I verify Terms and Conditions page opens in new tab$")
    public void verifyTermsAndCondOpens() {Assert.assertEquals(lpage2.getPageHeadingForTermsAndCond(),"Terms and Conditions");}

    @Then("^I verify Privacy Statement page opens in new tab$")
    public void verifyPrivacyStatement() {Assert.assertEquals(lpage2.getPageHeadingForPrivacy(),"Privacy Statement");}


    //Deals Page
    @When("I click on more travel")
    public void clickMoreTravel() {
        lpage2.clickMoreTravel();}

    @When("I click on deals page link")
    public void clickDealsPageLink() {
        lpage2.clickDealsPage(); }

    @Then("I verify search, book and save on the go! heading is displayed")
    public void verifyAppPageHeading() {
        Assert.assertTrue(lpage2.isSearchBookHeadingDisplayed()); }

    @Then("I verify amazing deals with free cancellation heading is displayed")
    public void verifyFreeCancellationHeading() {
        Assert.assertTrue(lpage2.isCancellationDisplayed());}

    @When("^I click on free cancellation heading$")
    public void clickOnFreeCancellationHeader() {
        lpage2.clickFreeCancellationHeader();}













}













