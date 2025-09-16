package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NotificationPage {

    public void clickTriggerLink() {
        $("a[href='/notification_message']").click();
    }

    public SelenideElement getNotification() {
        return $("#flash");
    }

    public String getNotificationText() {
        return getNotification().getText();
    }

    public void closeNotification() {
        getNotification().$("a.close").click();
    }
}