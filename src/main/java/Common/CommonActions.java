package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static Common.Config.PLATFORM_BROWSER;
/**
 *
 * Тут происходит инифиализация браузера для вызова его в BaseTest и опрокидывания в другие классы
 *
 **/
public class CommonActions {

    public static WebDriver CreationDriver(){
        WebDriver driver = null;
            switch (PLATFORM_BROWSER) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;

                case "Firefox":
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;

                default:
                    System.out.println("Please set up 'PLATFORM_BROWSER'- Chrome or Firefox ");
                        break;
            }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        return driver;

    }
}
