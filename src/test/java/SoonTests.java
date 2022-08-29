import Pages.SoonPage;
import org.testng.annotations.Test;

public class SoonTests extends BaseTest {

    SoonPage soonPage = new SoonPage();

    @Test
    public void checkTItle() {
        soonPage.openSoonPage();
        soonPage.checkTItle();

    }

    @Test
    public void soonFooter() {
        soonPage.openSoonPage();
        soonPage.soonFooter();

    }
}

