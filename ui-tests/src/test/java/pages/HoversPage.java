package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class HoversPage {

    private final ElementsCollection figures = $$(".figure");

    public int getFiguresCount() {
        return figures.size();
    }

    public void hoverOnFigure(int index) {
        figures.get(index).hover();
    }

    public SelenideElement getCaption(int index) {
        return figures.get(index).$(".figcaption h5");
    }
}