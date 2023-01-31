package stepDefinitions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectRepository.PageCreateSecondBoard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Random;

public class CreateSecondBoard extends Hooks {

    PageCreateSecondBoard PageCreateSecondBoard = new PageCreateSecondBoard();
    Random rand = new Random();
    @Given("user card board list page")
    public void user_card_board_list_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateSecondBoard.getBoardpage()));
        driver.findElement(PageCreateSecondBoard.getBoardpage()).isDisplayed();
    }
    @Then("user swipe")
    public void user_swipe() {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().text(\"Add new card\"))"));
    }
    @Then("user add new card second board")
    public void user_add_new_card_second_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateSecondBoard.getClickaddnewcard()));
        driver.findElement(PageCreateSecondBoard.getClickaddnewcard()).isDisplayed();
        driver.findElement(PageCreateSecondBoard.getClickaddnewcard()).click();
        driver.findElement(PageCreateSecondBoard.getCardname()).click();
        driver.findElement(PageCreateSecondBoard.getCardname()).sendKeys("Card Ujangs" + rand.nextInt(9999));
    }
    @Then("user click cek list second board")
    public void user_click_cek_list_second_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateSecondBoard.getClikceklis()));
        driver.findElement(PageCreateSecondBoard.getClikceklis()).isDisplayed();
        driver.findElement(PageCreateSecondBoard.getClikceklis()).click();
    }
    @Then("user click add new card second board")
    public void user_click_add_new_card_second_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateSecondBoard.getClickaddnewcard()));
        driver.findElement(PageCreateSecondBoard.getClickaddnewcard()).isDisplayed();
        driver.findElement(PageCreateSecondBoard.getClickaddnewcard()).click();
        driver.findElement(PageCreateSecondBoard.getCardname()).isDisplayed();
        driver.findElement(PageCreateSecondBoard.getCardname()).click();
        driver.findElement(PageCreateSecondBoard.getCardname()).sendKeys("Card Private Ujangs" + rand.nextInt(9999));
    }
    @Then("user click private card second board")
    public void user_click_private_card_second_board() {
        driver.findElement(PageCreateSecondBoard.getPrivatecard()).click();
    }
}

