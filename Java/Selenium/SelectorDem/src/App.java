import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) throws Exception {
        // String url = "https://rahulshettyacademy.com/locatorspractice/";
        // String key = "webdriver.chrome.driver";
        // String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

        // System.setProperty(key, path);

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Thread.sleep(2000);

        driver.quit();
    }
}
