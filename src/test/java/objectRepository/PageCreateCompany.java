package objectRepository;

import org.openqa.selenium.By;

public class PageCreateCompany {
    By createcompany  = By.xpath("//android.widget.Button[@content-desc=\"Create New Company\"]");
    By companyname  = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By companydesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By createbutton = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By successcreate = By.xpath("//android.view.View[@content-desc=\"Successfully create company user\"]");
    public By getCreatecompany() {
        return createcompany;
    }

    public By getCompanyname() {
        return companyname;
    }

    public By getCompanydesc() {
        return companydesc;
    }

    public By getCreatebutton() {
        return createbutton;
    }

    public By getSuccesscreate() {
        return successcreate;
    }
}
