package objectRepository;

import org.openqa.selenium.By;

public class PageCreateTeam {

    By buttonplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By addnewteam = By.xpath("//android.view.View[@content-desc=\"Add new team\"]");
    By newteamname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By newteamdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By createbutton = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");

    public By getButtonplus() {
        return buttonplus;
    }

    public By getAddnewteam() {
        return addnewteam;
    }

    public By getNewteamname() {
        return newteamname;
    }

    public By getNewteamdesc() {
        return newteamdesc;
    }

    public By getCreatebutton() {
        return createbutton;
    }
}
