package Pages.Darksky;
import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LandingPage extends Commands {

        // Locators of Landing Page elements
        By timeMachineLocator = By.xpath("//a[text()='Time Machine' or text()='TIME MACHINE']");
        By daySelectedLocator = By.xpath("//td[@class='is-today']");
        By monthSelectedLocator = By.xpath("//select[@class='pika-select pika-select-month']/option[@selected='selected']");
        By yearSelectedLocator = By.xpath("//select[@class='pika-select pika-select-year']/option[@selected='selected']");
        By todayLocator = By.xpath("//*[@class='day']");
        By todayMinTemp = By.xpath("(//span[@class='minTemp'])[1]");
        By todayMaxTemp = By.xpath("(//span[@class='maxTemp'])[1]");
        By dayExtrasMinTemp = By.xpath("((//div[@class='dayExtras']/div)[1]//span[@class='temp'])[1]");
        By dayExtrasMaxTemp = By.xpath("((//div[@class='dayExtras']/div)[1]//span[@class='temp'])[2]");





    //        // method to scroll to Time Machine button
        public WebElement scrollToTimeMachineButton() {
            return scrollToElement(timeMachineLocator);
        }

        // second method to click
        public void clickTimeMachineBtn() {
            scrollAndClickElement2(timeMachineLocator);
            Misc.pause(2);
        }

        // method to check if Time Machine button is enabled
        public boolean isTimeMachineButtonEnabled() {
            return scrollToTimeMachineButton().isEnabled();
        }

        public String timeMachineDate() {
            String day = getTextOfWebElement(daySelectedLocator);
            String month = getTextOfWebElement(monthSelectedLocator);
            String year = getTextOfWebElement(yearSelectedLocator);
            return month + ":" + day + ":" + year;
        }

    public String localDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM:dd:yyyy");
        String dateLocal = sdf.format(d);
        return dateLocal;
    }


        // method to check if Time Machine button is displayed
        public boolean isTimeMachineButtonDisplayed() {
            return scrollToTimeMachineButton().isDisplayed();
        }
    public void clickToday() {
        scrollAndClickElement2(todayLocator);
    }

        public String getTodayMinTemp() {
        String min = getTextOfWebElement(todayMinTemp).split("˚")[0];
        return min; }

        public String getTodayMaxTemp() {
            String max = getTextOfWebElement(todayMaxTemp).split("˚")[0];
            return max; }

        public String getTodayMinExtraTemp() {
            String minExtra = getTextOfWebElement(dayExtrasMinTemp).split("˚")[0];
            return minExtra; }

         public String getTodayMaxExtraTemp() {
        String maxExtra = getTextOfWebElement(dayExtrasMaxTemp).split("˚")[0];
         return maxExtra; }



}
