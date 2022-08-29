import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

public class MultiplexTest extends BaseTest {

    MainPage mainPage = new MainPage();


    @Test
    public void checkMenu() {

        mainPage.openStartPage();
        mainPage.menuBtnClick();
        mainPage.checkMenuText("ОСОБИСТИЙ КАБІНЕТ");
    }


    @Test
    public void chooseSity() {


        mainPage.openStartPage();
        mainPage.Other();
        mainPage.Sity();


    }

    @Test
    public void chooseIMaxAndET() {

        Configuration.timeout = 20000;
        mainPage.openStartPage();
        mainPage.IMax();
        mainPage.ET();
        mainPage.FirstAndLastName("Steven Spielberg");

    }

    //  Нужна помощь с данным тестом. Не могу понять как правильно сделать.
//    Основная суть в том, что бы нажать на следущую страницу, а потом на предудущуюю
    //  @Test
    // public void NextAndPrevoiusPage() {


    //      mainPage.openStartPage();
    //       mainPage.Other();
    //     mainPage.Sity();
    //      mainPage.NextPage();
    //      mainPage.PreviousPage();

}

