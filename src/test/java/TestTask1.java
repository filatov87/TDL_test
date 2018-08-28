import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestTask1 {
    @Test
    public void userCanAuthenticate() {

        Configuration.browser = "chrome";

        open("https://postman-echo.com/basic-auth");
       close();


    }
}
