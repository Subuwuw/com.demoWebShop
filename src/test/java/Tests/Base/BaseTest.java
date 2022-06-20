package Tests.Base;

import Common.CommonActions;
import Page.BasePage;
import Page.StatesAndTransition.StatesAndTransition;
import Page.Registration.ValidationRegistrationField;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import static Constants.Constants.BROWSER_CLOSE;


public class BaseTest {


    protected WebDriver driver = CommonActions.CreationDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ValidationRegistrationField validationRegistrationField = new ValidationRegistrationField(driver);
    protected StatesAndTransition statesAndTransition = new StatesAndTransition(driver);

    @AfterClass
    public void close() {
        if (BROWSER_CLOSE)
        {
            driver.close();
        }
    }


}

