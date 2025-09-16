package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.StatusCodesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatusCodesTest extends BaseTest {

    @Test
    @DisplayName("Status code 200")
    void statusCode200() {
        open("/status_codes");
        StatusCodesPage page = new StatusCodesPage();
        page.openStatusCode("200");
        assertTrue(page.getStatusText().contains("200"));
    }

    @Test
    @DisplayName("Status code 301")
    void statusCode301() {
        open("/status_codes");
        StatusCodesPage page = new StatusCodesPage();
        page.openStatusCode("301");
        assertTrue(page.getStatusText().contains("301"));
    }

    @Test
    @DisplayName("Status code 404")
    void statusCode404() {
        open("/status_codes");
        StatusCodesPage page = new StatusCodesPage();
        page.openStatusCode("404");
        assertTrue(page.getStatusText().contains("404"));
    }

    @Test
    @DisplayName("Status code 500")
    void statusCode500() {
        open("/status_codes");
        StatusCodesPage page = new StatusCodesPage();
        page.openStatusCode("500");
        assertTrue(page.getStatusText().contains("500"));
    }
}