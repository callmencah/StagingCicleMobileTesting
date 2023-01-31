package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageLogout;

public class Logout extends Hooks {
    PageLogout PageLogout = new PageLogout();
    @When("user click button menu")
    public void user_click_button_menu() {
        driver.findElement(PageLogout.getClickmenu()).click();
    }

    @When("user click button logout")
    public void user_click_button_logout() {
        driver.findElement(PageLogout.getClicklogout()).click();
    }

    @Then("user click button ok")
    public void user_click_button_ok() {
        driver.findElement(PageLogout.getClickok()).click();
    }

}