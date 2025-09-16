package tests;

import org.junit.jupiter.api.Test;
import pages.CheckboxesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class CheckboxesTest extends BaseTest {

    @Test
    void testCheckboxesSelectAndDeselect() {
        open("/checkboxes");
        CheckboxesPage page = new CheckboxesPage();

        page.selectCheckbox(0);
        page.deselectCheckbox(1);

        assertTrue(page.isCheckboxSelected(0));
        assertFalse(page.isCheckboxSelected(1));
    }
}