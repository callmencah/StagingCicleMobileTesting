package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageSetDueDate {

    By pageCardEdit = By.xpath("//android.view.View[@content-desc=\"CardEdit\"]");
    By pencil = By.xpath("//android.widget.Button[@content-desc=\"Switch to input\"]");
    By setdate = By.xpath("//android.view.View[@content-desc=\"SELECT DATE\n" +
            "Tue, Jan 24\"]/android.widget.EditText");
    By ok = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    By notifdue = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By deletedue = By.xpath("//android.view.View[@content-desc=\"CardEdit\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");

    By addlabel = By.xpath("//android.view.View[@content-desc=\"CardEdit\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]");
    By labelname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By greenlabel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[7]");
    By submit = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    By clicklabel = By.xpath("//android.view.View[@content-desc=\"UjangLabel\"]");
    By deletelabel = By.xpath("//android.view.View[@content-desc=\"UjangLabel\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]");
    By togglelabel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
    By clickempty = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]");
    By clickpencil = By.xpath("//android.view.View[@content-desc=\"CardEdit\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]");
    By adddesc = By.className("android.widget.EditText");
    By notifdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    By attachfile = By.xpath("//android.widget.Button[@content-desc=\"Attach file\"]");
    By item = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout");
    By allow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");

    public By getAllow() {
        return allow;
    }

    public By getAttachfile() {
        return attachfile;
    }

    public By getItem() {
        return item;
    }

    public By getPencil() {
        return pencil;
    }

    public By getPageCardEdit() {
        return pageCardEdit;
    }

    public By getSetdate() {
        return setdate;
    }

    public By getOk() {
        return ok;
    }

    public By getNotifdue() {
        return notifdue;
    }

    public By getDeletedue() {
        return deletedue;
    }

    public By getAddlabel() {
        return addlabel;
    }

    public By getLabelname() {
        return labelname;
    }

    public By getGreenlabel() {
        return greenlabel;
    }

    public By getSubmit() {
        return submit;
    }

    public By getClicklabel() {
        return clicklabel;
    }

    public By getDeletelabel() {
        return deletelabel;
    }

    public By getClickpencil() {
        return clickpencil;
    }

    public By getAdddesc() {
        return adddesc;
    }

    public By getClickempty() {
        return clickempty;
    }

    public By getNotifdesc() {
        return notifdesc;
    }

    public By getTogglelabel() {
        return togglelabel;
    }
}
