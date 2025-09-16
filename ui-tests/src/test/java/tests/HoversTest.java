package tests;

import org.junit.jupiter.api.Test;
import pages.HoversPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class HoversTest extends BaseTest {

    @Test
    void testHoversShowCaptions() {
        open("/hovers");
        HoversPage page = new HoversPage();

        int figureCount = page.getFiguresCount();

        for (int i = 0; i < figureCount; i++) {
            page.hoverOnFigure(i);
            page.getCaption(i).shouldBe(visible);
        }
    }
}