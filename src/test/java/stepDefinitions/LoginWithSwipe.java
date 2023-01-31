package stepDefinitions;

import io.appium.java_client.MobileBy;
import io.cucumber.java.en.When;
import objectRepository.PageLoginWithSwipe;
import org.openqa.selenium.InvalidSelectorException;

public class LoginWithSwipe extends Hooks {
    PageLoginWithSwipe PageLoginWithSwipe = new PageLoginWithSwipe();
    @When("user click Yes")
    public void user_click_yes() {
        driver.findElement(PageLoginWithSwipe.getYes()).click();
    }
    @When("user swipe page")
    public void user_swipe_page() throws InterruptedException {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
        Thread.sleep(20000);
    }
}