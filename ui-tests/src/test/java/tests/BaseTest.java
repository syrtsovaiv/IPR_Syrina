package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import utils.TestConfig;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        Configuration.browser = TestConfig.BROWSER;
        Configuration.timeout = TestConfig.TIMEOUT;
        Configuration.baseUrl = TestConfig.BASE_URL;
        Configuration.browserSize = TestConfig.RESOLUTION;
    }
}