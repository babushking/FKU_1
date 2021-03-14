import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class FillRFTests {
    private String login = "77_Streshneva_A";
    private String password = "77_Streshneva_A";
    private String phoneNumber = "2608";



    @Test
    void fillFormTest() {
        openPage();
        fillForm();
    }

    void openPage() {
        // Открыть форму
        open("http://172.17.249.13/FKU05/");
        sleep(20000);
    }

    void fillForm() {
        // Заполнить форму
        $("#loginField-1013-inputEl").setValue(this.login;
        $("#loginField-1014-inputEl").setValue(this.password);
        $("#loginField-1015-inputEl").setValue(this.phoneNumber);
        $("#button-1026-tooltipEl").parent().click();
        $("#button-1026").click();
        $("html").shouldHave(Condition.text("Агент:77_Streshneva_A, номер:2608"));
    }



