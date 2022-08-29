import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeClass
    public void config() {

        Configuration.baseUrl = "https://multiplex.ua";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
    }
}
