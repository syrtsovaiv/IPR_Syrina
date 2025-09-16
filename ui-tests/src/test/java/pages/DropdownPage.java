package pages;

import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {

    public void selectOption(String option) {
        $("#dropdown").selectOption(option);
    }

    public String getSelectedOption() {
        return $("#dropdown option:checked").getText();
    }
}