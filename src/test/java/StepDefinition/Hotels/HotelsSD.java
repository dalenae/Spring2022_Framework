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

    @When("^I click on sign up link$")
    public void clickOnSignUpLink() {lpage2.clickSignUpBtn();}

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

 //SignUp Page
    @When("^I click Terms and Conditions link$")
    public void clickTermsAndCondLink() {lpage2.clickTermsAndCondOnSignUpPage();}

   @When("^I click Privacy Statement link$")
   public void clickPrivacyStatementlink() {lpage2.clickPrivacyStatementSignUpPage();}

    @Then("^I verify Terms and Conditions page opens in new tab$")
    public void verifyTermsAndCondOpens() {Assert.assertEquals(lpage2.getPageHeadingForTermsAndCond(),"Terms and Conditions");}

    @Then("^I verify Privacy Statement page opens in new tab$")
    public void verifyPrivacyStatement() {Assert.assertEquals(lpage2.getPageHeadingForPrivacy(),"Privacy Statement");}














}













