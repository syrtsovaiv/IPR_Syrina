package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InputsPage {

    private final SelenideElement inputField = $("input[type='number']");

    public void setInputValue(String value) {
        inputField.clear();
        inputField.setValue(value);
    }

    public String getInputValue() {
        return inputField.getValue();
    }
}