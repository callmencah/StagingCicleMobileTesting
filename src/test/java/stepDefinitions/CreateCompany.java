package stepDefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PageCreateCompany;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CreateCompany extends Hooks {

    PageCreateCompany PageCreateCompany = new PageCreateCompany();
    Random rand = new Random();

    @Then("user click button create new company")
    public void user_click_button_create_new_company() {
        driver.findElement(PageCreateCompany.getCreatecompany()).click();
    }
    @Then("user set new company name")
    public void user_set_new_company_name() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getCompanyname()));
        driver.findElement(PageCreateCompany.getCompanyname()).isDisplayed();
        driver.findElement(PageCreateCompany.getCompanyname()).click();
        Thread.sleep(2000);
        driver.findElement(PageCreateCompany.getCompanyname()).sendKeys("Company Ujangs" + rand.nextInt(9999));
    }

    @Then("user set new company desc")
    public void user_set_new_company_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getCompanydesc()));
        driver.findElement(PageCreateCompany.getCompanydesc()).isDisplayed();
        driver.findElement(PageCreateCompany.getCompanydesc()).click();
        driver.findElement(PageCreateCompany.getCompanydesc()).sendKeys("Company Ujangs" + rand.nextInt(9999));
    }

    @Then("user click create")
    public void user_click_create() {
        driver.findElement(PageCreateCompany.getCreatebutton()).click();
    }

    @Then("user success create company")
    public void user_success_create_company() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getSuccesscreate()));
        driver.findElement(PageCreateCompany.getSuccesscreate()).isDisplayed();
        driver.findElement(PageCreateCompany.getSuccesscreate()).click();
    }

}