package StepDefinition.Hotels;

import Pages.Hotels.LandingPage;
import Web.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HotelsSD {
   LandingPage lpage = new LandingPage();

    @Given("^I am on hotels landing page$")
    public void openHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @When("^I click hotels search button$")
    public void clickHotelsSearchButton() {
        lpage.clickSearchBtn();

    }
    @Then("^I verify destination error is displayed$")
    public void verifySearchErrorMessage() {
        Assert.assertTrue(lpage.isSearchErrorDisplayed()); }

    @When("I click travelers button")
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


    @When("I click done button")
    public void clickDoneBtn() {
        lpage.clickTravelerDoneBtn();
    }














}













