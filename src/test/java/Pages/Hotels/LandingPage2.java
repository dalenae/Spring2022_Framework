package Pages.Hotels;

import Helper.DateLib;
import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
public class LandingPage2 extends Commands {

    // Nav link Locators
    By signUpBtnLocator = By.xpath("//div[@class='actions']//a[@data-stid='link-header-account-signup']");
    By emailSignUpLocator = By.xpath("//*[@id='signupFormEmailInput']");
    By firstNameSignUpLocator = By.xpath("//*[@id='signupFormFirstNameInput']");
    By signUpFormEntryErrorLocator = By.xpath("//*[contains(@id,'error')]");
    By lastNameSignUpLocator = By.xpath("//*[@id='signupFormLastNameInput']");
    By passwordSignUpLocator = By.xpath("//*[@id='signupFormPasswordInput']");
    By signUpCheckboxLocator = By.xpath("//*[@id='signUpFormRememberMeCheck']/following-sibling::span");
    By signUpContinueBtnLocator = By.xpath("//*[@id='signupFormSubmitButton']");
    By fiveBottomLinksInInnerNavMenuLocator = By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a");
    By hotelRewardsLinkLocator = By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a/div[text()='Hotels.com® Rewards']");


    // Check in/out locators
    By checkInBoxLocator = By.id("d1-btn");
    By checkOutBoxLocator = By.id("d2-btn");
    By checkOutDaysLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");

    // Search Suggestion locators
    By searchBtnLocator = By.xpath("//button[text()='Search']");
    By searchErrorLocator = By.xpath("//div[@class='uitk-error-summary']");
    By searchBarLocator = By.xpath("//button[@aria-label='Going to']");
    By searchBarInputLocator = By.id("location-field-destination");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    // Traveler section locators
    By travelersMenuLocator = By.xpath("//div[@id='adaptive-menu']");
    By addAdultBtnLocator = By.xpath("//input[@id='adult-input-0']/following-sibling::button");
    By addChildBtnLocator = By.xpath("//input[@aria-label='Children Ages 0 to 17']/following-sibling::button");
    By childrenAgeErrorLocator = By.xpath("//div[@class='uitk-error-summary']/h3");
    By firstChildAgeDropdownLocator = By.xpath("//select[@id='child-age-input-0-0']");
    By secondChildAgeDropdownLocator = By.xpath("//select[@id='child-age-input-0-1']");
    By travelerDoneBtnLocator = By.xpath("//button[text()='Done']");
    By travelerCountBeforeSearchLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By travelerCountAfterSearchLocator = By.xpath("//button[@data-stid='open-room-picker']/preceding-sibling::input");

    // Calendar locators
    By currentMonthYear = By.xpath("(//div[@class='uitk-date-picker-month']/h2)[1]");
    By nextMonthBtnLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By calendarDoneBtnLocator = By.xpath("//button[@data-stid='apply-date-picker']");
    By calendarDisabledPastDays = By.xpath("//*[@class='uitk-date-picker-weeks']//button[contains(@class,'is-disabled')]");

    //Signin page locators
    By enterPasswordLocator = By.xpath("//input[@id='loginFormPasswordInput']");
    By enterEmailLocator = By.xpath("//input[@id='loginFormEmailInput']");
    By topMenuSignInBtnLocator = By.xpath("//nav//button[text()='Sign in']");
    By signInPageBtnLocator = By.xpath("//button[text()='Sign in']");
    By signInBtnLocator = By.xpath("//a[text()='Sign in']");
    By signInErrorMessageLocator = By.xpath("//*[@class='uitk-error-summary-heading']");

    //Signup page locators
    By termsAndConditionsLocator = By.xpath("//*[text()='Terms and Conditions']");
    By privacyStatementLocator = By.xpath("//*[text()='Privacy Statement']");
    By pageHeaderTermsAndCondLocator = By.xpath("//*[text()='Terms and Conditions']");
    By pageHeaderPrivacyLocator = By.xpath("//*[text()='Privacy Statement']");

    // Feedbackpage
    By submitBtnOnFeedback = By.xpath("//button[text()='Submit']");
    By feedbackLinkLocator = By.xpath("(//div[@class='uitk-text uitk-type-300'])[12]");
    By feedbackErrorMessageLocator = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
    By redDottedBoxLocator = By.id("required_box_page_rating");
    By starsOnFeedbackLocator = By.xpath("//div[@class='radio-group']/div/label");
    By commentFeedbackLocator = By.xpath("//*[@id='verbatim']");
    By returnToHotelsQuestionsLocator = By.xpath("//*[@id='will-you-return']");
    By priorBookingBtnLocator = By.xpath("//label[contains(@for,'booked-here-before')]");
    By didYouAccomplishBtnLocator = By.xpath("//label[contains(@for,'were-you-successful')]");
    By thankYouForFeedbackMessageLocator = By.xpath("//*[@id='thank-you']");

    // Other
    By rewardNightPromoLocator = By.xpath("//span[contains(text(), 'every 10 nights')]");

    //Deals Page
    By moreTravelLocator = By.xpath("//nav/div/button");
    By dealsPageLocator = By.xpath("//nav//div[@class='uitk-list']/a[@href='/hotel-deals/']");
    By searchBookGoHeadingLocator = By.xpath("//*[contains(text(),'Search, book, and save')]");
    By freeCancellationLocator = By.xpath("//div[contains(@class,'PageHeading')]//*[contains(text(),'Amazing deals with free cancellation')]");


    // Sign in/out
    public void clickSignInField() {findWebElementWithWait(topMenuSignInBtnLocator).click();;
    }

    public void clickSignInBtn() {findWebElementWithWait(signInBtnLocator).click();}

    public void clickSignUpBtn() {findWebElementWithWait(signUpBtnLocator).click();}

    public void clickSignInBtnOnSignInPage() {findWebElementWithWait(signInPageBtnLocator).click();}

    //Sign up page
    public void clickTermsAndCondOnSignUpPage() {findWebElementWithWait(termsAndConditionsLocator).click();}

    public void clickPrivacyStatementSignUpPage() {findWebElementWithWait(privacyStatementLocator).click();}


  //sign in page
    public void enterInvalidEmail() {
        type(enterEmailLocator,"dalenaiscool3943@gmail.com"); }

    public void enterInvalidPassword() {
        type(enterPasswordLocator,"techno85u8"); }

    public boolean isSignInErrorMessageDisplayed() {
        findWebElementWithWait(signInErrorMessageLocator);
        return isElementDisplayed(signInErrorMessageLocator);
    }

    //feedback page
   public void clickFeedbackPage() {
       findWebElementWithWait(feedbackLinkLocator).click();
       String landingPageHandle = getCurrentWindowHandle();
       switchToSecondBrowserWindow(landingPageHandle);
       ;
         }
    public void clickSubmitOnFeedback() {
        findWebElementWithWait(submitBtnOnFeedback).click();
    }

    public boolean isFeedbackPageErrorMessageDisplayed() {return isElementDisplayed(feedbackErrorMessageLocator);}

    public boolean isRedDottedBorderDisplayed() {
        return isElementDisplayed(redDottedBoxLocator); }

    public void clickStarRating(String starValue) {
        List<WebElement> stars = findWebElements(starsOnFeedbackLocator);
        for (WebElement value : stars) {
            if (value.getAttribute("for").contains(starValue)) {
                value.click();
                break;}}}

    public void enterTextInComments(String inputText) {
        type(commentFeedbackLocator, inputText); }

    public void selectReturnQuestion(String dropdownOption) {
        selectInDropdown(returnToHotelsQuestionsLocator, dropdownOption);}

    public void selectPriorBookingAnswer(String answer) {
        List<WebElement> buttons = findWebElements(priorBookingBtnLocator);
        for (WebElement btn : buttons) {
            if (btn.getAttribute("for").contains(answer.toLowerCase())) {
                btn.click();
                break;}}}

    public void didYouAccomplishAnswer(String answer) {
        List<WebElement> buttons = findWebElements(didYouAccomplishBtnLocator);
        for (WebElement btn : buttons) {
            if (btn.getAttribute("for").contains(answer.toLowerCase())) {
                btn.click();
                break;}}}

    public boolean isThankYouMessageDisplayed() {
        // I need help with removing wait from here
        Misc.pause(2);
        return isElementDisplayed(thankYouForFeedbackMessageLocator);
    }

    // Check in/out  methods
    public void clickCheckInBtn() {
        clickIt(checkInBoxLocator);
        Misc.pause(1);
    }

    public void clickCheckOutBtn() {
        clickIt(checkOutBoxLocator);
        Misc.pause(1);
    }

    public void selectCheckoutDay(String day) {
        List<WebElement> daysToSelect = findWebElements(checkOutDaysLocator);
        for (WebElement value : daysToSelect) {
            if (value.getAttribute("data-day").equals(day)) {
                value.click();}}}



    // Search bar methods
    public void clickSearchBtn() {
        clickIt(searchBtnLocator);
        Misc.pause(1);
    }

    public boolean isSearchErrorDisplayed() {
        return isElementDisplayed(searchErrorLocator);
    }

    public void clickSearchBar() {
        clickIt(searchBarLocator);
        Misc.pause(1);
    }

    public void typeInSearchBar(String destination) {
        type(searchBarInputLocator, destination);
        Misc.pause(2);
    }

    public void clickDestinationSuggestion(String destination) {
        selectFromSuggestions(destinationSuggestions, destination);
        Misc.pause(1);
    }


    // Calendar scrolling methods
    public void clickNextMonthBtn() {
        clickIt(nextMonthBtnLocator);
        Misc.pause(1);
    }

    public void selectDayMonthYear(String date) {
        String monthYear = date.split(" ")[1] + " " + date.split(" ")[2];
        String day = date.split(" ")[0];
        By dayLocator = By.xpath("(//div[@class='uitk-date-picker-month'])[1]/h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day='" + day + "']");
        for (int i = 0; i < 12; i++) {
            if (getTextOfWebElement(currentMonthYear).equalsIgnoreCase(monthYear)) {
                clickIt(dayLocator);
                break;
            }
            clickNextMonthBtn();
        }
    }

    public boolean isDisabledPastDayCountCorrect() {
        int totalDisabledDayCount = findWebElements(calendarDisabledPastDays).size();
        int todayDate = DateLib.getCurrentDateAsInt();
        return todayDate - 1 == totalDisabledDayCount; }


        public void clickCalendarDoneBtn () {
            clickIt(calendarDoneBtnLocator);
            Misc.pause(1);
        }


//travelers

        public void clickOnTravelersBox () {
            clickIt(travelersMenuLocator);
        }


        public boolean isTravelerErrorDisplayed () {
            return isElementDisplayed(childrenAgeErrorLocator);
        }

    int totalAdultCount;
    int totalChildCount;

    public void increaseChildTravelerCount(int childNumber) {
        for (int i = 0; i < childNumber; i++) {
            clickIt(addChildBtnLocator);
            totalChildCount = Integer.valueOf(childNumber);
        }

    }
    public void increaseAdultTravelerCount(int adultNumber) {
        for (int i = 0; i < adultNumber; i++) {
            clickIt(addAdultBtnLocator);
            totalAdultCount = Integer.valueOf(adultNumber);
        }
    }

        public void selectChildrenAge () {
            selectInDropdown(firstChildAgeDropdownLocator, "4");
            Misc.pause(1);
            selectInDropdown(secondChildAgeDropdownLocator, "0");
            Misc.pause(1);
        }

        public void clickTravelerDoneBtn () {
            clickIt(travelerDoneBtnLocator);
            Misc.pause(1);
        }

        public void typeBoraInSearchBar() {
            type(searchBarLocator, "bora");
        }

        //signup page

    public String getPageHeadingForTermsAndCond() {
        return getTextOfWebElement(pageHeaderTermsAndCondLocator);}

    public String getPageHeadingForPrivacy() {
        return getTextOfWebElement(pageHeaderPrivacyLocator); }

    public void enterEmail(String email) {
        type(emailSignUpLocator, email);
    }
    public void enterFirstName(String firstName) {
        type(firstNameSignUpLocator, firstName);}

    public boolean signUpErrors(String errorDescription) {
        List<WebElement> errorMessages = findWebElements(signUpFormEntryErrorLocator);
        boolean isErrorDisplayed = false;
        for (WebElement message : errorMessages) {
            if(message.getText().contains(errorDescription)) {
                isErrorDisplayed = true;
                break;
            }
        }
        return isErrorDisplayed;
    }

    public void enterLastName(String lastName) {
        type(lastNameSignUpLocator, lastName);
    }

    public void enterPassword(String password) {
        type(passwordSignUpLocator, password); }

    public boolean isSignUpCheckboxEnabled() {
        return isElementEnabled(signUpCheckboxLocator);
    }
    public boolean isSignUpCheckboxDisplayed() {
        return isElementDisplayed(signUpCheckboxLocator);}

    public boolean isContinueBtnEnabled() {
        return isElementEnabled(signUpContinueBtnLocator);}

    public boolean isContinueBtnDisplayed() {
        return isElementDisplayed(signUpContinueBtnLocator);}

    //Deals Page
    public void clickMoreTravel() {
        clickIt(moreTravelLocator);}

    public void clickDealsPage () {
        findWebElementWithWait(dealsPageLocator).click();}

    public boolean isSearchBookHeadingDisplayed() {
        return isElementDisplayed(searchBookGoHeadingLocator);}

    public boolean isCancellationDisplayed() {
        return isElementDisplayed(freeCancellationLocator);}

    public void clickFreeCancellationHeader() {
        clickIt(freeCancellationLocator); }













}