package objectRepository;

import org.openqa.selenium.By;

public class PageLoginWithSkip {

    By sick = By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]");
    By skip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    By gotosign = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    By signgoole = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google Account\"]");
    By chooseaccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
    By notifx = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By createcompany = By.xpath("//android.widget.Button[@content-desc=\"Create New Company\"]");


    public By getSick() {
        return sick;
    }

    public By getSkip() {
        return skip;
    }

    public By getGotosign() {
        return gotosign;
    }

    public By getSigngoole() {
        return signgoole;
    }

    public By getChooseaccount() {
        return chooseaccount;
    }

    public By getNotifx() {
        return notifx;
    }

    public By getCreatecompany() {
        return createcompany;
    }
}
