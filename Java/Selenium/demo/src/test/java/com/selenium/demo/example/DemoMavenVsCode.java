package com.selenium.demo.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMavenVsCode {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.youtube.com";

        String key = "webdriver.chrome.driver";
        String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

        System.setProperty(key, path);

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        Thread.sleep(1000);
        driver.quit();

    }
}
