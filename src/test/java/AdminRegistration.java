import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class AdminRegistration {
    private String loginAdmin= "Admin";
    private String passwordAdmin= "Admin";
    private String phoneNumberAdmin = "0000";

    @Test
    void fillFormTest() {
        openPage();
        fillForm();
    }

    void openPage() {
        // Открыть форму
        open("http://172.17.249.13/FKU05/");
        sleep(50000);
    }

    void fillForm() {
        // Заполнить форму
        $("#loginField-1013-inputEl").setValue(this.loginAdmin);
        $("#loginField-1014-inputEl").setValue(this.passwordAdmin;
        $("#loginField-1015-inputEl").setValue(this.phoneNumberAdmin);
        $("#button-1026-tooltipEl").parent().click();
        $("#button-1026").click();
        $("html").shouldHave(Condition.text("Агент:Admin, номер:0000"));
    }
}

