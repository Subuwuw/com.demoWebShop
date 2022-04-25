package Tests.Base;

import Common.CommonActions;
import Page.BasePage;
import Page.StatesAndTransition.StatesAndTransition;
import Page.Registration.ValidationRegistrationField;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {


    protected WebDriver driver = CommonActions.CreationDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ValidationRegistrationField validationRegistrationField = new ValidationRegistrationField(driver);
    protected StatesAndTransition statesAndTransition = new StatesAndTransition(driver);


    @AfterTest
    public void clo(){
     driver.close();
        }

}

