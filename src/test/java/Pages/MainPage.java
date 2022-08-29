package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.cssSelector;

public class MainPage {


    SelenideElement menuBtn = $(cssSelector(".menu-btn"));
    SelenideElement menuText = $(cssSelector(".mob_container > .menu-block > .menu-block-heading"));
    SelenideElement soon = $(cssSelector(".menu_list > a:nth-child(2)"));
    SelenideElement nextPage = $(cssSelector(".mp_toright"));
    SelenideElement previousPage = $(cssSelector(".mp_toleft"));
    SelenideElement other = $(cssSelector(".geo_select"));
    SelenideElement sity = $(cssSelector(".cinema.active"));
    SelenideElement iMax = $(cssSelector(".imax_link.twins_link > img"));
    SelenideElement eT = $(cssSelector(".i_wp.imax_laser > div.top > div.row > p > a"));
    SelenideElement firstAndLastName = $(cssSelector(".column2 > ul > li:nth-child(4) > p.val"));

    public void menuBtnClick() {
        menuBtn.shouldBe(Condition.visible).click();
    }

    public void checkMenuText(String text) {
        menuText.shouldHave(exactText(text));
    }

    public void openStartPage() {
        open("https://multiplex.ua");
    }

    public void Soon() {
        soon.shouldBe(Condition.visible).click();
    }

    public void NextPage() {
        nextPage.shouldBe(Condition.visible).click();
    }

    public void PreviousPage() {
        previousPage.shouldBe(Condition.visible).click();
    }

    public void Other() {
        other.shouldBe(Condition.visible).click();
    }

    public void Sity() {
        sity.shouldBe(Condition.visible).click();
    }

    public void IMax() {
        iMax.shouldBe(Condition.visible).click();
    }

    public void ET() {
        eT.shouldBe(Condition.visible).click();
    }

    public void FirstAndLastName(String text) {
        firstAndLastName.should(exactText(text));
    }
}



