import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://dzen.ru/");
        $(".arrow__input mini-suggest__input").setValue("selenide").pressEnter();
        $("span.organic__title").shouldHave(text("Selenide"));
        //$("[id=search]").shouldHave(text("https://selenide.org"));
    }
}