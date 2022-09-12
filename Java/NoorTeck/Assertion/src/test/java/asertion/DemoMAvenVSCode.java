package asertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMAvenVSCode {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        String url = "https://courses.letskodeit.com/practice";
        String key = "webdriver.chrome.driver";
        String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

        System.setProperty(key, path);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(3000);
        driver.quit();

    }
}
