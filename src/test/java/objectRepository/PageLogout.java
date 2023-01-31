package objectRepository;

import org.openqa.selenium.By;

public class PageLogout {
    By clickmenu = By.xpath("//android.view.View[@content-desc=\"Menu\n" + "Tab 4 of 4\"]");

    By clicklogout = By.xpath("//android.view.View[@content-desc=\"Logout\n" +
            "v2.0.32+2052\"]");
    By clickok = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");

    public By getClickmenu() {
        return clickmenu;
    }

    public By getClicklogout() {
        return clicklogout;
    }

    public By getClickok() {
        return clickok;
    }
}
