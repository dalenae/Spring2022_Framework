package StepDefinition.Facebook;

import Helper.Misc;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class LinksSD {
    LandingPage lpage = new LandingPage();


    @When("^I click on facebook pay link$")
    public void clickFacebookPayLink() {
        lpage.findWebElement(By.linkText("Facebook Pay")).click();
        Misc.pause(3); }

    @When("^I click on Oculus link$")
    public void clickOculusLink() {
            lpage.findWebElement(By.linkText("Oculus")).click();
            Misc.pause(3); }

    @When("^I click on Instagram link$")
    public void clickInstagramLink() {
        lpage.findWebElement(By.linkText("Instagram")).click();
        Misc.pause(3); }

    @When("^I click on Portal link$")
    public void clickPortalLink() {
        lpage.findWebElement(By.linkText("Portal")).click();
        Misc.pause(3); }

    @When("^I click on Bulletin link$")
    public void clickBulletinLink() {
        lpage.findWebElement(By.linkText("Bulletin")).click();
        Misc.pause(3); }

    @When("^I close all windows except for Instagram$")
    public void closeEverythingButInstagram() {
        lpage.closeOtherWindowHandlesMethod("https://www.instagram.com");
    }






}