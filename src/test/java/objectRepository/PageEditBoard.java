package objectRepository;

import org.openqa.selenium.By;

public class PageEditBoard {

    By clicklistboard = By.xpath("//android.view.View[@content-desc=\"Board List 7163\"]");
    By editnamelistboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By clickcard = By.xpath("//android.widget.Button[@content-desc=\"Card Private Ujangs1282\n" + "1\n" + "Show menu\"]");
    By editnamecard = By.className("android.widget.EditText");
    By ceklisnamecard = By.xpath("//android.view.View[@content-desc=\"Ula Lord\n" +
            "Wed, 1/18/2023\n" +
            "Due dates\n" +
            "Set due date\n" +
            "Labels\n" +
            "Description\n" +
            "-\n" +
            "Attachments\n" +
            "Subscribers\n" +
            "Comments & Activities\"]/android.widget.Button");

    By notifeditsuccess = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By clickpencil = By.xpath("//android.view.View[@content-desc=\"Card Ujangs5892\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");
    By ceklistboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");


    public By getClicklistboard() {
        return clicklistboard;
    }

    public By getEditnamelistboard() {
        return editnamelistboard;
    }

    public By getClickcard() {
        return clickcard;
    }

    public By getEditnamecard() {
        return editnamecard;
    }

    public By getCeklisnamecard() {
        return ceklisnamecard;
    }

    public By getNotifeditsuccess() {
        return notifeditsuccess;
    }

    public By getClickpencil() {
        return clickpencil;
    }

    public By getCeklistboard() {
        return ceklistboard;
    }
}
