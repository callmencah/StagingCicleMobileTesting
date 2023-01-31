package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import objectRepository.PageDragAndDropBoard;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragAndDropBoard extends Hooks {

    PageDragAndDropBoard PageDragAndDropBoard = new PageDragAndDropBoard();
    TouchAction t = new TouchAction(driver);
    @Then("user drag and drop card")
    public void user_drag_and_drop_card()  {

        WebElement from1 = driver.findElement(PageDragAndDropBoard.getRight01());
        WebElement to1 = driver.findElement(PageDragAndDropBoard.getLeft01());
        t.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(4))).moveTo(element(to1)).release().perform();
        driver.findElement(PageDragAndDropBoard.getNotifx()).click();
        WebElement from2 = driver.findElement(PageDragAndDropBoard.getLeft02());
        WebElement to2 = driver.findElement(PageDragAndDropBoard.getRight02());
        t.longPress(longPressOptions().withElement(element(from2)).withDuration(ofSeconds(3))).moveTo(element(to2)).release().perform();
        driver.findElement(PageDragAndDropBoard.getNotifx()).click();
    }
}