package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class DisappearingElementsPage {

    public ElementsCollection getMenuItems() {
        return $$(".example ul li");
    }

    public int getMenuItemsCount() {
        return getMenuItems().size();
    }
}