package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageSetDueDate;
import org.openqa.selenium.Point;
public class AddDescription extends Hooks {

    PageSetDueDate PageSetDueDate = new PageSetDueDate();
    TouchAction touchAction = new TouchAction(driver);
    @When("user click pencil description")
    public void user_click_pencil_description() {
        driver.findElement(PageSetDueDate.getClickpencil()).click();
    }
    @When("user add description")
    public void user_add_description() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(PageSetDueDate.getAdddesc()).click();
        driver.findElement(PageSetDueDate.getAdddesc()).click();
        Thread.sleep(4000);
        driver.findElement(PageSetDueDate.getAdddesc()).sendKeys("This Is Description");
        Thread.sleep(4000);
        int x = 154;
        int y = 2458;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();

    }
    @When("user click publish")
    public void user_click_publish() throws InterruptedException {
        Thread.sleep(4000);
        int x = 1162;
        int y = 2291;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }
    @When("user click button x notification description")
    public void user_click_button_x_notification_description() {
        driver.findElement(PageSetDueDate.getNotifdesc()).click();
    }

    @When("user click attach file")
    public void user_click_attach_file() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(PageSetDueDate.getAttachfile()).click();
    }
    @When("user click Allow")
    public void user_click_allow() {
        driver.findElement(PageSetDueDate.getAllow()).click();
    }

    @When("user select item")
    public void user_select_item() {
        driver.findElement(PageSetDueDate.getItem()).click();
    }
    @Then("user click notification attachments")
    public void user_click_notification_attachments() {
        driver.findElement(PageSetDueDate.getNotifdesc()).click();
    }
}