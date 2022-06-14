package Pages.Hotels;
import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LandingPage extends Commands {

    // Locator variables
    // Check in/out related locators
    By checkInBoxLocator = By.id("d1-btn");
    By checkOutDaysLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");

    // Suggestion related locators
    By searchBtnLocator = By.xpath("//button[text()='Search']");
    By searchErrorLocator = By.xpath("//div[@class='uitk-error-summary']");
    By searchBarLocator = By.xpath("//button[@aria-label='Going to']");
    By searchBarInputLocator = By.id("location-field-destination");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    // Traveler info locators
    By travelersMenuLocator = By.xpath("//div[@id='adaptive-menu']");
    By addChildBtnLocator = By.xpath("//input[@aria-label='Children Ages 0 to 17']/following-sibling::button");
    By childrenAgeErrorLocator = By.xpath("//div[@class='uitk-error-summary']/h3");
    By firstChildAgeDropdownLocator = By.xpath("//select[@id='child-age-input-0-0']");
    By secondChildAgeDropdownLocator = By.xpath("//select[@id='child-age-input-0-1']");
    By travelerDoneBtnLocator = By.xpath("//button[@data-testid='guests-done-button']");
    By travelerCountBeforeSearchLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By travelerCountAfterSearchLocator = By.xpath("//button[@data-stid='open-room-picker']/preceding-sibling::input");
    String travelerCountBeforeSearch = "";
    String travelerCountAfterSearch = "";


    // Calendar related locators
    By currentMonthYear = By.xpath("(//div[@class='uitk-date-picker-month']/h2)[1]"); // <-- change this, not h2, target div
    By nextMonthBtnLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By calendarDoneBtnLocator = By.xpath("//button[@data-stid='apply-date-picker']");

    //Feedback page related locators
    By submitBtnOnFeedback = By.xpath("//button[text()='Submit']");


    // Methods
    // Check in/out related methods
    public void clickCheckInBtn() {
        clickIt(checkInBoxLocator);
        Misc.pause(1);
    }

    public void selectCheckoutDay(String day) {
        List<WebElement> daysToSelect = findWebElements(checkOutDaysLocator);
        for (WebElement value : daysToSelect) {
            if (value.getAttribute("data-day").equals(day)) {
                value.click();
            }
        }
    }


    // Search bar related methods
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

    public void clickOnSuggestion(String destination) {
        selectFromSuggestions(destinationSuggestions, destination);
        Misc.pause(1);
    }


    // Calendar scrolling related methods
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

    public void clickCalendarDoneBtn() {
        clickIt(calendarDoneBtnLocator);
        Misc.pause(1);
    }


    // Travelers related methods
    public void clickOnTravelersBox() {
        clickIt(travelersMenuLocator);
        Misc.pause(1);
    }

    public void increaseChildTravelerCount() {
        for (int i = 0; i < 2; i++) {
            clickIt(addChildBtnLocator);
            Misc.pause(1);
        }
    }

    public boolean isTravelerErrorDisplayed() {
        return isElementDisplayed(childrenAgeErrorLocator);
    }

    public void selectChildrenAge() {
        selectInDropdown(firstChildAgeDropdownLocator, "4");
        Misc.pause(1);
        selectInDropdown(secondChildAgeDropdownLocator, "Under 1");
        Misc.pause(1);
    }

    public void clickTravelerDoneBtn() {
        clickIt(travelerDoneBtnLocator);
        Misc.pause(1);
    }

    public void saveTravelerCountBeforeSearch() {
        travelerCountBeforeSearch = getAttributeValueFromWebElement(travelerCountBeforeSearchLocator, "aria-label");
    }

    public void saveTravelerCountAfterSearch() {
        travelerCountAfterSearch = getAttributeValueFromWebElement(travelerCountAfterSearchLocator, "value");
    }

    public boolean isTravelersCountSameBeforeAndAfter() {
        return travelerCountBeforeSearch == travelerCountAfterSearch;
    }



}