package tests;

import org.junit.jupiter.api.Test;
import pages.DisappearingElementsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisappearingElementsTest extends BaseTest {

    @Test
    void testAllElementsAppearEventually() {
        boolean foundFiveElements = false;
        for (int attempt = 1; attempt <= 10; attempt++) {
            open("/disappearing_elements");
            DisappearingElementsPage page = new DisappearingElementsPage();
            int count = page.getMenuItemsCount();
            if (count == 5) {
                foundFiveElements = true;
                break;
            }
        }
        assertTrue(foundFiveElements, "Не удалось найти 5 элементов за 10 попыток!");
    }
}