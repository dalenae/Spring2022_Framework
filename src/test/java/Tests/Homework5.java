package Tests;

import Pages.Commands;
import Pages.Darksky.LandingPage;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Helper.Misc;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Homework5  {


        /**
         * darksky.net
         * Verify the current date is highlighted in Time Machine's calendar
         */
        LandingPage lpage = new LandingPage();

        @Test
        public void isDateHighlighted() {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        lpage.clickTimeMachineBtn();
        Misc.pause(2);
        String myDate = MyDriver.getDriver().findElement(By.xpath("//*[@class='is-today']/button")).getText();
        System.out.println(myDate); // <-- always giving current darksky date

        Assert.assertEquals(myDate,lpage.localDate(),"Test failed current date is not highlighted");
        MyDriver.quitWindows();

    }
    /**
         * darksky.net
         * Verify same values are displayed in the Today's date
        **/
        @Test
        public void sameValuesDisplayed() {
            MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
            lpage.clickToday();
            Misc.pause(5);
            String minTemp1= lpage.getTodayMinTemp();
            String minTemp2 = lpage.getTodayMinExtraTemp();
            Assert.assertEquals(minTemp1,minTemp2, "Test failed today's minimum temperatures don't match");
            Misc.pause(5);
            String maxTemp1 = lpage.getTodayMaxTemp();
            String maxTemp2 = lpage.getTodayMaxExtraTemp();
            Assert.assertEquals(maxTemp1,maxTemp2, "Test failed today's maximum temperatures don't match");
            MyDriver.getDriver().quit();

        }

        /**
         * facebook.com/
         * Launch facebook.com
         * Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
         * Close ALL windows except Instagram
         * Verify number of window-Handles is 1
         * Verify Page Title is Instagram
         * Verify Log in button on Instagram is disabled by default
         */

    @Test
        public void clickLinksFacebook() {
            MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
            lpage.findWebElement(By.linkText("Facebook Pay")).click();
            Misc.pause(3);
            lpage.findWebElement(By.linkText("Oculus")).click();
            Misc.pause(3);
            lpage.findWebElement(By.linkText("Instagram")).click();
            Misc.pause(3);
            lpage.findWebElement(By.linkText("Portal")).click();
            Misc.pause(3);
            lpage.findWebElement(By.linkText("Bulletin")).click();
            Misc.pause(3);
           lpage.closeOtherWindowHandlesMethod("https://www.instagram.com");

    }

    }




