package tests;

import org.junit.jupiter.api.Test;
import pages.InputsPage;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    void testInputFieldAcceptsNumbers() {
        open("/inputs");
        InputsPage page = new InputsPage();
        int number = new Random().nextInt(10_000) + 1;
        page.setInputValue(String.valueOf(number));
        assertEquals(String.valueOf(number), page.getInputValue());
    }
}