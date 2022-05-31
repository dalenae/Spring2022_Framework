package StepDefinition.Darksky;

import Helper.Misc;
import Pages.Darksky.LandingPage;
import Web.MyDriver;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DarkskySD {
    LandingPage lpage = new LandingPage();


   @Given("^I am on darksky landing page$")
   public void openDarksy() {
       MyDriver.launchUrlOnNewWindow("https://www.darksky.net/"); }

    @When("^I click on time machine button$")
    public void clickTimeMachineButton() {
            lpage.clickTimeMachineBtn();}

    @Then("^I verify highlighted date is the same as current date$")
    public void verifyHighlightedDateIsSame() {
        Assert.assertEquals(lpage.timeMachineDate(),lpage.localDate(),"Test failed current date is not highlighted"); }

    @Then("^I close windows$")
    public void closeWindows() {
        MyDriver.quitWindows(); }


    @When("^I click on today$")
    public void clickOnToday() {
       lpage.clickToday(); }

    @Then("I verify minimum temperatures are the same$")
    public void verifyMinTempsAreTheSame() {
        String minTemp1= lpage.getTodayMinTemp();
        String minTemp2 = lpage.getTodayMinExtraTemp();
        Assert.assertEquals(minTemp1,minTemp2, "Test failed today's minimum temperatures don't match");
        Misc.pause(5); }

    @Then("^I verify maximum temperatures are the same$")
    public void verifyMaxTempsAreTheSame() {
        String maxTemp1 = lpage.getTodayMaxTemp();
        String maxTemp2 = lpage.getTodayMaxExtraTemp();
        Assert.assertEquals(maxTemp1,maxTemp2, "Test failed today's maximum temperatures don't match"); }



/**
 * hotels.com
 * Verify destination error displayed if search with no destination
 */

/**
 * hotels.com
 * Verify enter-children's age error is displayed as soon user add a child
 * and, error is NOT displayed as soon user enter's children's age
 *
 * After click Search button
 * Also, verify numbers of travelers before and after is the same.
 **/
}