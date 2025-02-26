package ru.netology.testmode.test;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
    public static void setup() {
        WebDriverManager.chromedriver().setup(); // Автоматически скачает нужный ChromeDriver
        Configuration.browser = "chrome"; // Указываем, что используем Chrome
    }
}
