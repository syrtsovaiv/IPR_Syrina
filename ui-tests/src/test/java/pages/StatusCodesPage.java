package pages;

import static com.codeborne.selenide.Selenide.*;

public class StatusCodesPage {

    public void openStatusCode(String code) {
        $("a[href='status_codes/" + code + "']").click();
    }

    public String getStatusText() {
        return $("p").getText();
    }
}