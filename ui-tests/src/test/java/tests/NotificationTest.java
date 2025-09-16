package tests;

import org.junit.jupiter.api.Test;
import pages.NotificationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class NotificationTest extends BaseTest {

    @Test
    void testActionSuccessfulMessageAppears() {
        open("/notification_message_rendered");
        NotificationPage page = new NotificationPage();

        for (int i = 0; i < 15; i++) {
            page.clickTriggerLink();
            page.getNotification().shouldBe(visible);
            if (page.getNotificationText().contains("Action successful")) {
                break;
            }
            page.closeNotification();
        }
        page.getNotification().shouldHave(text("Action successful"));
    }
}