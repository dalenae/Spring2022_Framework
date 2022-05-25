package StepDefinition.Facebook;

import Web.MyDriver;
import cucumber.api.java.en.Given;

public class FacebookSD {
    @Given("^I am on facebook landing page$")
            public void openFacebookLanding() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/"); }








}
