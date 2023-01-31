package stepDefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PageCreateTeam;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CreateTeam extends Hooks {

    PageCreateTeam PageCreateTeam = new PageCreateTeam();
    Random rand = new Random();

    @Then("user click plus button")
    public void user_click_plus_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateTeam.getButtonplus()));
        driver.findElement(PageCreateTeam.getButtonplus()).isDisplayed();
        driver.findElement(PageCreateTeam.getButtonplus()).click();
    }

    @Then("user click add new team")
    public void user_click_add_new_team() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateTeam.getAddnewteam()));
        driver.findElement(PageCreateTeam.getAddnewteam()).isDisplayed();
        driver.findElement(PageCreateTeam.getAddnewteam()).click();
    }

    @Then("user set new team name")
    public void user_set_new_team_name() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateTeam.getNewteamname()));
        driver.findElement(PageCreateTeam.getNewteamname()).isDisplayed();
        driver.findElement(PageCreateTeam.getNewteamname()).click();
        Thread.sleep(2000);
        driver.findElement(PageCreateTeam.getNewteamname()).sendKeys("Team Ujangs" + rand.nextInt(9999));
    }

    @Then("user set new team desc")
    public void user_set_new_team_desc() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateTeam.getNewteamdesc()));
        driver.findElement(PageCreateTeam.getNewteamdesc()).isDisplayed();
        driver.findElement(PageCreateTeam.getNewteamdesc()).click();
        Thread.sleep(2000);
        driver.findElement(PageCreateTeam.getNewteamdesc()).sendKeys("Team ujangs" + rand.nextInt(9999));
    }


}