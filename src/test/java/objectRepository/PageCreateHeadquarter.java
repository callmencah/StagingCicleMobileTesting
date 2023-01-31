package objectRepository;

import org.openqa.selenium.By;

public class PageCreateHeadquarter {

    By addnewhq = By.xpath("//android.view.View[@content-desc=\"Add new HQ\"]");
    By newhqname= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By newhqdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By createbutton = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By clickhome = By.xpath("//android.view.View[@content-desc=\"Home\n" +
            "Tab 1 of 4\"]");


    public By getAddnewhq() {
        return addnewhq;
    }

    public By getNewhqname() {
        return newhqname;
    }

    public By getNewhqdesc() {
        return newhqdesc;
    }

    public By getCreatebutton() {
        return createbutton;
    }

    public By getClickhome() {
        return clickhome;
    }
}
