package tests;

import org.junit.jupiter.api.Test;
import pages.AddRemovePage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddRemoveTest extends BaseTest {

    @Test
    void testAddAndRemoveElements() {
        open("/add_remove_elements/");
        AddRemovePage page = new AddRemovePage();

        // Добавить 5 элементов
        for (int i = 0; i < 5; i++) {
            page.addElement();
        }
        assertEquals(5, page.getDeleteButtonsCount());

        // Удалить 3 элемента
        for (int i = 0; i < 3; i++) {
            page.deleteFirstElement();
        }
        assertEquals(2, page.getDeleteButtonsCount());
    }
}