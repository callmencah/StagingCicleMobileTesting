package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageEditBoard;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;


public class EditBoard extends Hooks {

    PageEditBoard PageEditBoard = new PageEditBoard();
    TouchAction touchAction = new TouchAction(driver);
    Random rand = new Random();

    @When("user click board list")
    public void user_click_board_list() {
        int x = 262;
        int y = 385;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }

    @When("user edit name board list")
    public void user_edit_name_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageEditBoard.getEditnamelistboard()));
        driver.findElement(PageEditBoard.getEditnamelistboard()).isDisplayed();
        driver.findElement(PageEditBoard.getEditnamelistboard()).click();
        driver.findElement(PageEditBoard.getEditnamelistboard()).clear();
        driver.findElement(PageEditBoard.getEditnamelistboard()).sendKeys("Board List" + rand.nextInt(9999));
    }

    @When("user click checklist edit")
    public void user_click_checklist_edit() {
        driver.findElement(PageEditBoard.getCeklistboard()).click();
    }

    @When("user click card")
    public void user_click_card() {
        int x = 462;
        int y = 1186;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }

    @When("user click symbol pencil")
    public void user_click_symbol_pencil() throws InterruptedException {
        Thread.sleep(4000);
        int x = 1325;
        int y = 405;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }

    @When("user edit name card")
    public void user_edit_name_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageEditBoard.getEditnamecard()));
        driver.findElement(PageEditBoard.getEditnamecard()).isDisplayed();
        driver.findElement(PageEditBoard.getEditnamecard()).click();
        driver.findElement(PageEditBoard.getEditnamecard()).clear();
        driver.findElement(PageEditBoard.getEditnamecard()).sendKeys("CardEdit");
    }

    @When("user click symbol checklist card")
    public void user_click_symbol_checklist_card() throws InterruptedException {
        Thread.sleep(2000);
        int x = 1277;
        int y = 455;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }

    @Then("user click notification edit success")
    public void user_click_notification_edit_success() {
        driver.findElement(PageEditBoard.getNotifeditsuccess()).click();
    }
}