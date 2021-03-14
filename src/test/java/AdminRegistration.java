import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


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
        sleep(40000);
    }

    void fillForm() {
        // Заполнить форму
        $("#loginField-1013-inputEl").setValue(this.loginAdmin);
        $("#loginField-1014-inputEl").setValue(this.passwordAdmin);
        $("#loginField-1015-inputEl").setValue(this.phoneNumberAdmin);
        $("#button-1026-tooltipEl").parent().click();
        $("#panel-1045-innerCt").shouldHave(Condition.text("Агент:Admin, номер:0000"));
    }

    @Test
    void CreateRole() {
        GoToListOfRoles();
        CreateRole();
    }

    void GoToListOfRoles() {
        // Перейти в раздел Настройки-Список ролей
        $("#ext-element-164").click();
        $("#ext-element-149").click();

    }

    void CreateRole() {
        // Создать роль

        $("#button-1429-btnInnerEl").click();
        $("#textfield-2133-inputEl").setValue("Автороль");
        $("#textareafield-2135-inputEl").setValue("это автотест");
        $("#panel-1045-innerCt").shouldHave(Condition.text("Агент:Admin, номер:0000"));
    }
}

