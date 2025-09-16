package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AddRemovePage {

    private final SelenideElement addButton = $("button[onclick='addElement()']");
    private final ElementsCollection deleteButtons = $$(".added-manually");

    public void addElement() {
        addButton.click();
    }

    public void deleteFirstElement() {
        if (deleteButtons.size() > 0) {
            deleteButtons.first().click();
        }
    }

    public int getDeleteButtonsCount() {
        return deleteButtons.size();
    }
}