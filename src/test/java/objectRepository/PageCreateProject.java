package objectRepository;

import org.openqa.selenium.By;

public class PageCreateProject {

    By buttonplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By addnewproject = By.xpath("//android.view.View[@content-desc=\"Add new project\"]");
    By newprojectname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By newprojectdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By createbutton = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");


    public By getButtonplus() {
        return buttonplus;
    }

    public By getAddnewproject() {
        return addnewproject;
    }

    public By getNewprojectname() {
        return newprojectname;
    }

    public By getNewprojectdesc() {
        return newprojectdesc;
    }

    public By getCreatebutton() {
        return createbutton;
    }
}