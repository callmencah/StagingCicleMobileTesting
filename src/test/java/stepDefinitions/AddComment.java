package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageAddComment;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;

public class AddComment extends Hooks {

    PageAddComment PageAddComment = new PageAddComment();
    TouchAction touchAction = new TouchAction(driver);
    @When("user click add comment")
    public void user_click_add_comment() {
        int x = 559;
        int y = 2358;
        Point point = new Point(x, y);
        touchAction.tap(PointOption.point(point)).perform();
    }

    @When("user add comment")
    public void user_add_comment() throws InterruptedException {
        driver.findElement(PageAddComment.getAddcomment()).click();
        driver.findElement(PageAddComment.getAddcomment()).click();
        Thread.sleep(3000);
        driver.findElement(PageAddComment.getAddcomment()).sendKeys("KomenPertama");
    }

    @And("user click publish comment")
    public void user_click_publish_comment() throws InterruptedException {
        driver.findElement(PageAddComment.getClicksubmit()).click();
        driver.findElement(PageAddComment.getKomen()).click();
    }
//    @When("user click cheers")
//    public void user_click_cheers() {
//        int x = 1306;
//        int y = 1590;
//        Point point = new Point(x, y);
//        touchAction.tap(PointOption.point(point)).perform();
//    }
//
//    @When("user add cheers")
//    public void user_add_cheers() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(PageAddComment.getCheers()).sendKeys("Tes Cheers");
//    }
//
//    @When("user click Cek list cheers")
//    public void user_click_cek_list_cheers() {
//        driver.findElement(PageAddComment.getClickceklis()).click();
//    }

    @Then("user click back")
    public void user_click_back() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PageAddComment.getBack()).click();
    }
}