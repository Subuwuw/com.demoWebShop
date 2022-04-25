package Page.StatesAndTransition;

import Page.BasePage;
import org.openqa.selenium.WebDriver;

public class StatesAndTransition extends BasePage {

    public String myAccount = "(//a[@href='/customer/info'])[1]";

    public StatesAndTransition(WebDriver driver) {
        super(driver);
    }
}
