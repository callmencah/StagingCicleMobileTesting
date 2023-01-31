package objectRepository;

import org.openqa.selenium.By;

public class PageCreateBoard {

    By buttonplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By addboardlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText\n");
    By clickhome = By.xpath("//android.view.View[@content-desc=\"Home\n" + "Tab 1 of 4\"]");
    By submit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    By succescreateboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View\n");
    By clickaddnewcard = By.xpath("//android.widget.Button[@content-desc=\"Add new card\"]");
    By cardname = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    By clikceklis = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View\n");
    By privatecard = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch\n");
    By clickteam = By.xpath("//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View");
    By clickboard = By.xpath("//android.widget.ImageView[@content-desc=\"Board\"]");

    public By getButtonplus() {
        return buttonplus;
    }

    public By getAddboardlist() {
        return addboardlist;
    }

    public By getClickhome() {
        return clickhome;
    }

    public By getSubmit() {
        return submit;
    }

    public By getSuccescreateboard() {
        return succescreateboard;
    }

    public By getClickaddnewcard() {
        return clickaddnewcard;
    }

    public By getCardname() {
        return cardname;
    }

    public By getClikceklis() {
        return clikceklis;
    }

    public By getPrivatecard() {
        return privatecard;
    }

    public By getClickteam() {
        return clickteam;
    }

    public By getClickboard() {
        return clickboard;
    }
}
