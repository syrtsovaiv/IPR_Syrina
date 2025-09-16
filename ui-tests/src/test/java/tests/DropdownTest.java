package tests;

import org.junit.jupiter.api.Test;
import pages.DropdownPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTest extends BaseTest {

    @Test
    void testSelectDropdownOptions() {
        open("/dropdown");
        DropdownPage page = new DropdownPage();

        page.selectOption("Option 1");
        assertEquals("Option 1", page.getSelectedOption());

        page.selectOption("Option 2");
        assertEquals("Option 2", page.getSelectedOption());
    }
}