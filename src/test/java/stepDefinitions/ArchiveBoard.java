package stepDefinitions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageArchiveBoard;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveBoard extends Hooks {

    PageArchiveBoard PageArchiveBoard = new PageArchiveBoard();
    TouchAction t = new TouchAction(driver);

    @When("user click tree dot card by coordinate")
    public void user_click_tree_dot_card_by_coordinate() {
        int x = 1280;
        int y = 520;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click archive this list card")
    public void user_click_archive_this_list_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchiveBoard.getArchivecard()));
        driver.findElement(PageArchiveBoard.getArchivecard()).isDisplayed();
        driver.findElement(PageArchiveBoard.getArchivecard()).click();
        driver.findElement(PageArchiveBoard.getClickarchive()).click();
    }

    @Then("user success archive show notify")
    public void user_success_archive_show_notify() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchiveBoard.getNotifx()));
        driver.findElement(PageArchiveBoard.getNotifx()).isDisplayed();
        driver.findElement(PageArchiveBoard.getNotifx()).click();
    }

    @When("user click tree dot list")
    public void user_click_tree_dot_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchiveBoard.getTreedotlist()));
        driver.findElement(PageArchiveBoard.getTreedotlist()).isDisplayed();
        driver.findElement(PageArchiveBoard.getTreedotlist()).click();
    }

    @When("user click archive this list board")
    public void user_click_archive_this_list_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchiveBoard.getArchivethislist()));
        driver.findElement(PageArchiveBoard.getArchivethislist()).isDisplayed();
        driver.findElement(PageArchiveBoard.getArchivethislist()).click();
    }

    @Then("user success archive list show notify")
    public void user_success_archive_list_show_notify() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchiveBoard.getArchivelistnotif()));
        driver.findElement(PageArchiveBoard.getArchivelistnotif()).isDisplayed();
        driver.findElement(PageArchiveBoard.getArchivelistnotif()).click();
    }

}