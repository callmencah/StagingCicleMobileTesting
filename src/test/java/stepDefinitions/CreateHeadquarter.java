package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageCreateHeadquarter;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CreateHeadquarter extends Hooks {

    PageCreateHeadquarter PageCreateHeadquarter = new PageCreateHeadquarter();
    Random rand = new Random();
    @Given("user click logo home")
    public void user_click_logo_home() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(PageCreateHeadquarter.getClickhome()).click();
        Thread.sleep(1000);
        driver.findElement(PageCreateHeadquarter.getClickhome()).click();
    }
    @When("user click add new hq")
    public void user_click_add_new_hq() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateHeadquarter.getAddnewhq()));
        driver.findElement(PageCreateHeadquarter.getAddnewhq()).isDisplayed();
        driver.findElement(PageCreateHeadquarter.getAddnewhq()).click();
    }

    @When("user set new hq name")
    public void user_set_new_hq_name() {
        driver.findElement(PageCreateHeadquarter.getNewhqname()).click();
        driver.findElement(PageCreateHeadquarter.getNewhqname()).sendKeys("Headquarter Ujangs" + rand.nextInt(9999));
    }

    @When("user set new hq desc")
    public void user_set_new_hq_desc() {
        driver.findElement(PageCreateHeadquarter.getNewhqdesc()).click();
        driver.findElement(PageCreateHeadquarter.getNewhqdesc()).sendKeys("Headquarter ujangs" + rand.nextInt(9999));
    }

}