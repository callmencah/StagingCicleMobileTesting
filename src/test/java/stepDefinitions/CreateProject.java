package stepDefinitions;

import io.cucumber.java.en.Given;
import objectRepository.PageCreateProject;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CreateProject extends Hooks {

    PageCreateProject PageCreateProject = new PageCreateProject();
    Random rand = new Random();
    @Given("user click add new project")
    public void user_click_add_new_project() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateProject.getAddnewproject()));
        driver.findElement(PageCreateProject.getAddnewproject()).isDisplayed();
        driver.findElement(PageCreateProject.getAddnewproject()).click();
    }

    @Given("user set new project name")
    public void user_set_new_project_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateProject.getNewprojectname()));
        driver.findElement(PageCreateProject.getNewprojectname()).click();
        driver.findElement(PageCreateProject.getNewprojectname()).sendKeys("Project Ujangs" + rand.nextInt(9999));
    }

    @Given("user set new project desc")
    public void user_set_new_project_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateProject.getNewprojectdesc()));
        driver.findElement(PageCreateProject.getNewprojectdesc()).click();
        driver.findElement(PageCreateProject.getNewprojectdesc()).sendKeys("Project Ujangs" + rand.nextInt(9999));
    }
}