package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class CheckboxesPage {
    private final ElementsCollection checkboxes = $$("#checkboxes input");

    public void selectFirstCheckbox() {
        checkboxes.get(0).setSelected(true);
    }

    public void deselectSecondCheckbox() {
        checkboxes.get(1).setSelected(false);
    }

    public boolean isFirstChecked() {
        return checkboxes.get(0).isSelected();
    }

    public boolean isSecondChecked() {
        return checkboxes.get(1).isSelected();
    }

    public void selectCheckbox(int i) {
    }

    public void deselectCheckbox(int i) {
    }

    public boolean isCheckboxSelected(int i) {
    }
}