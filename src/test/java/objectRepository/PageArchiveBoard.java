package objectRepository;
import org.openqa.selenium.By;

public class PageArchiveBoard {
    By archivecard = By.xpath("//android.widget.Button[@content-desc=\"Archive card\"]");
    By clickarchive = By.xpath("//android.widget.Button[@content-desc=\"Archive\"]");
    By notifx = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By treedotlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
    By archivethislist = By.xpath(" //android.view.View[@content-desc=\"Archive this list\"]");
    By archivelistnotif = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    public By getArchivecard() {
        return archivecard;
    }

    public By getClickarchive() {
        return clickarchive;
    }

    public By getNotifx() {
        return notifx;
    }

    public By getTreedotlist() {
        return treedotlist;
    }

    public By getArchivethislist() {
        return archivethislist;
    }

    public By getArchivelistnotif() {
        return archivelistnotif;
    }
}
