import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void selenideSearchTest(){
        //open http://google.com
        open("http://google.com");
        //type search "selenide", press enter
        $("[name=q]").setValue("selenide").pressEnter();
        //check selenide.org in results
        $("#search").shouldHave(text("selenide.org"));
    }
}
