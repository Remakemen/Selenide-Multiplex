package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.openqa.selenium.By.cssSelector;

public class SoonPage {


    SelenideElement SoonFooter = $(cssSelector(".cinema_footer > div.cf_left"));


    public void openSoonPage() {
        Selenide.open(baseUrl + "/soon");

    }

    public void checkTItle() {
        assertThat(title(), equalTo("Скоро в кіно - найближчі прем'єри фільмів в прокаті кінотеатрів Multiplex | Київ, Харків і вся Україна"));

    }

    public void soonFooter() {
        SoonFooter.should(exist);
    }
}