package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageAddComment {

    By addcomment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By back = By.xpath("//android.view.View[@content-desc=\"CardEdit\"]/android.widget.Button[1]");
    By clicksubmit = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    By reply = By.xpath("//android.view.View[@content-desc=\"Reply\"]");
    By clickceklis = By.xpath("//android.view.View[@content-desc=\"6 minutes ago\n" +
            "Ula Lord\n" +
            "KomenPertama\n" +
            "11:41 PM\"]/android.view.View[2]");
    By cheers = By.xpath("//android.view.View[@content-desc=\"6 minutes ago\n" +
            "Ula Lord\n" +
            "KomenPertama\n" +
            "11:41 PM\"]/android.widget.EditText");

    public By getReply() {
        return reply;
    }

    By komen = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"KomenPertama\"))");

    By click = MobileBy.AccessibilityId("Add new comment...");

    public By getClickceklis() {
        return clickceklis;
    }

    public By getCheers() {
        return cheers;
    }

    public By getClick() {
        return click;
    }

    public By getKomen() {
        return komen;
    }

    public By getAddcomment() {
        return addcomment;
    }

    public By getBack() {
        return back;
    }

    public By getClicksubmit() {
        return clicksubmit;
    }
}