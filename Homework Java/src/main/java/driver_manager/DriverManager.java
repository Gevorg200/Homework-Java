package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private static void setDriver() {
        driver = new ChromeDriver(WebDriverConfig.configChrome());
    }

    public static WebDriver get() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
    }
}
