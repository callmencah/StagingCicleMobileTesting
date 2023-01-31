package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.PageLoginWithSkip;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class LoginWithSkip extends Hooks {

    PageLoginWithSkip PageLoginWithSkip = new PageLoginWithSkip();
    @Given("user is on boarding screen")
    public void user_is_on_boarding_screen() throws MalformedURLException {
        before();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSkip.getSkip()));
        driver.findElement(PageLoginWithSkip.getSick()).isDisplayed();
    }
    @When("user click skip")
    public void user_click_skip() {
        driver.findElement(PageLoginWithSkip.getSkip()).click();
    }
    @When("user click go to sign button")
    public void user_click_go_to_sign_button() {
        driver.findElement(PageLoginWithSkip.getGotosign()).click();
    }
    @When("user click go to sign button with google account")
    public void user_click_go_to_sign_button_with_google_account() {
        driver.findElement(PageLoginWithSkip.getSigngoole()).click();
    }
    @When("user choose account google")
    public void user_choose_account_google() {
        driver.findElement(PageLoginWithSkip.getChooseaccount()).click();
    }
    @When("user click button x notification")
    public void user_click_button_x_notification() {
        Boolean check_notif = driver.findElements(PageLoginWithSkip.getNotifx()).size() > 0;
        while (check_notif){
            if ( check_notif = driver.findElements(PageLoginWithSkip.getNotifx()).size() > 0){
                driver.findElement(PageLoginWithSkip.getNotifx()).click();
            }
            check_notif = driver.findElements(PageLoginWithSkip.getNotifx()).size() > 0;
        }
    }
    @When("user success login with google account")
    public void user_success_login_with_google_account() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSkip.getCreatecompany()));
        driver.findElement(PageLoginWithSkip.getCreatecompany()).isDisplayed();
    }
}