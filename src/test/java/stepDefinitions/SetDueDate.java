package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageSetDueDate;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;


public class SetDueDate extends Hooks {

    PageSetDueDate PageSetDueDate = new PageSetDueDate();
    TouchAction touchAction = new TouchAction(driver);
    Random rand = new Random();

    @Given("user card edit page")
    public void user_card_edit_page() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSetDueDate.getPageCardEdit()));
        Thread.sleep(3000);
        driver.findElement(PageSetDueDate.getPageCardEdit()).isDisplayed();
    }
    @When("user click set due date")
    public void user_click_set_due_date() throws InterruptedException {
        Thread.sleep(4000);
        int x = 679;
        int y = 945;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }
    @When("user click pencil calender")
    public void user_click_pencil_calender() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PageSetDueDate.getPencil()).click();
    }
    @When("user set date")
    public void user_set_date() throws InterruptedException {
        driver.findElement(PageSetDueDate.getSetdate()).click();
        driver.findElement(PageSetDueDate.getSetdate()).click();
        Thread.sleep(2000);
        driver.findElement(PageSetDueDate.getSetdate()).click();
        driver.findElement(PageSetDueDate.getSetdate()).click();
        driver.findElement(PageSetDueDate.getSetdate()).clear();
        driver.findElement(PageSetDueDate.getSetdate()).sendKeys("1/31/2023");
    }
    @When("user click ok calender")
    public void user_click_ok_calender() {
        driver.findElement(PageSetDueDate.getOk()).click();
    }
    @When("user click ok time")
    public void user_click_ok_time() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PageSetDueDate.getOk()).click();
        driver.findElement(PageSetDueDate.getNotifdue()).click();

    }
    @When("user click add label")
    public void user_click_add_label() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PageSetDueDate.getAddlabel()).click();
    }
    @When("user set label name")
    public void user_set_label_name() throws InterruptedException {
        driver.findElement(PageSetDueDate.getLabelname()).click();
        Thread.sleep(2000);
        driver.findElement(PageSetDueDate.getLabelname()).sendKeys("UjangLabel");
    }
    @When("user click label colour")
    public void user_click_label_colour() {
        driver.findElement(PageSetDueDate.getGreenlabel()).click();
    }
    @When("user click submit label")
    public void user_click_submit_label() {
        driver.findElement(PageSetDueDate.getSubmit()).click();
        driver.findElement(PageSetDueDate.getTogglelabel()).click();

    }
    @When("user click label")
    public void user_click_label() {
        driver.findElement(PageSetDueDate.getClicklabel()).click();
        driver.findElement(PageSetDueDate.getTogglelabel()).click();
    }
    @Then("user click empty")
    public void user_click_empty() throws InterruptedException {
        Thread.sleep(2000);
        int x = 1006;
        int y = 196;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }
}