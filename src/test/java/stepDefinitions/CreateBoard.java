package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectRepository.PageCreateBoard;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CreateBoard extends Hooks {

    PageCreateBoard PageCreateBoard = new PageCreateBoard();
    Random rand = new Random();


    @Given("user home page")
    public void user_home_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getClickhome()));
        driver.findElement(PageCreateBoard.getClickhome()).isDisplayed();
    }
    @Then("user click team")
    public void user_click_team() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getClickteam()));
        driver.findElement(PageCreateBoard.getClickteam()).click();
    }
    @Then("user click board")
    public void user_click_board() {
        driver.findElement(PageCreateBoard.getClickboard()).click();
    }
    @Then("user set add new board list")
    public void user_set_add_new_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getAddboardlist()));
        driver.findElement(PageCreateBoard.getAddboardlist()).isDisplayed();
        driver.findElement(PageCreateBoard.getAddboardlist()).click();
        driver.findElement(PageCreateBoard.getAddboardlist()).sendKeys("Board List " + rand.nextInt(9999));
    }
    @Then("user click submit")
    public void user_click_submit() {
        driver.findElement(PageCreateBoard.getSubmit()).click();
    }
    @Then("user success create board")
    public void user_success_create_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getSuccescreateboard()));
        driver.findElement(PageCreateBoard.getSuccescreateboard()).isDisplayed();
    }
    @Then("user add new card")
    public void user_add_new_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getClickaddnewcard()));
        driver.findElement(PageCreateBoard.getClickaddnewcard()).isDisplayed();
        driver.findElement(PageCreateBoard.getClickaddnewcard()).click();
        driver.findElement(PageCreateBoard.getCardname()).isDisplayed();
        driver.findElement(PageCreateBoard.getCardname()).click();
        driver.findElement(PageCreateBoard.getCardname()).sendKeys("Card Ujangs" + rand.nextInt(9999));
    }
    @Then("user click cek list")
    public void user_click_cek_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getClikceklis()));
        driver.findElement(PageCreateBoard.getClikceklis()).isDisplayed();
        driver.findElement(PageCreateBoard.getClikceklis()).click();
    }
    @Then("user click add new card")
    public void user_click_add_new_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateBoard.getClickaddnewcard()));
        driver.findElement(PageCreateBoard.getClickaddnewcard()).isDisplayed();
        driver.findElement(PageCreateBoard.getClickaddnewcard()).click();
        driver.findElement(PageCreateBoard.getCardname()).isDisplayed();
        driver.findElement(PageCreateBoard.getCardname()).click();
        driver.findElement(PageCreateBoard.getCardname()).sendKeys("Card Private Ujangs" + rand.nextInt(9999));
    }
    @Then("user click private card")
    public void user_click_private_card() {
        driver.findElement(PageCreateBoard.getPrivatecard()).click();
    }

}