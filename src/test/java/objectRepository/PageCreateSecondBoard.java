package objectRepository;
import org.openqa.selenium.By;
public class PageCreateSecondBoard {
    By boardpage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View");
    By clickaddnewcard = By.xpath("(//android.widget.Button[@content-desc=\"Add new card\"])[2]");
    By cardname = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    By clikceklis = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View\n");
    By privatecard = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch\n");


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
    public By getBoardpage() {
        return boardpage;
    }
}
