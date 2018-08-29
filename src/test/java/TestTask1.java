import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestTask1 {
    @Test
    public void userCanAuthenticate() {
        Configuration.browser ="chrome";

        open("https://postman-echo.com/basic-auth", "", "postman");



    }
}
