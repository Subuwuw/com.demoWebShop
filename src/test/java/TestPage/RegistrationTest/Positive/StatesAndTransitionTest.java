package TestPage.RegistrationTest.Positive;

import Page.BasePage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.By;


import static Constants.Constants.*;
import static Constants.PathOfSearch.XPATH_BUTTON_CONTIN_AFTER_REG;


public class StatesAndTransitionTest extends BaseTest {

    public static final String xpathAccountMail = "//a[contains(text(),'" + BasePage.generatedEmailStatic + "')]";


    @Test(priority = 1,groups = {"smoke_tests"},description ="Регистрация и проверка отображения совпадения введеных данных")
    public void CheckConfirmDataAfterRegistration() {
        basePage.GoToUrl(REGISTRATION_PAGE);
        basePage
                .ClickById("gender-male")
                .TypeById("FirstName", BasePage.generatedName)
                .TypeById("LastName", BasePage.generatedLastName)
                .TypeById("Email", BasePage.generatedEmailStatic)
                .TypeById("Password", BasePage.generatedPassword)
                .TypeById("ConfirmPassword", BasePage.generatedPassword)
                .ClickById("register-button");
        Assertions.assertEquals(driver.getCurrentUrl(), COMPLATED_REG_PAGE);
        basePage.AssertByXpath("Your registration completed", "//div[@class='result']");
        Assertions.assertTrue(driver.findElement(By.xpath(XPATH_BUTTON_CONTIN_AFTER_REG)).isDisplayed());
        basePage
                .AssertByXpath(BasePage.generatedEmailStatic, statesAndTransition.myAccount)
                .ClickByXpath(statesAndTransition.myAccount)
                .AssertByxpathGetText(BasePage.generatedName, xpathFirstName)
                .AssertByxpathGetText(BasePage.generatedLastName, xpathLastName)
                .AssertByxpathGetText(BasePage.generatedEmailStatic, xpathEmail);
    }

    @Test(priority = 2,dependsOnMethods = "CheckConfirmDataAfterRegistration",groups = {"smoke_tests"},description = "Вход с корректными данными")
    public void LoginWithCorrectData() {
        basePage.GoToUrl(LOG_IN_PAGE);
        basePage
                .TypeById("Email", BasePage.generatedEmailStatic)
                .TypeById("Password", BasePage.generatedPassword)
                .ClickByXpath(xpathBtnLogin);
        basePage.AssertByXpath(BasePage.generatedEmailStatic, xpathAccountMail);
    }

    @Test(priority = 2,dependsOnMethods = "CheckConfirmDataAfterRegistration",description = "Вход без пароля, только с Email который зарегестрирован")
    public void LoginOnlyWithMail(){
        basePage.GoToUrl(LOG_IN_PAGE);
        basePage
                .TypeById("Email",BasePage.generatedEmailStatic)
                .ClickByXpath(xpathBtnLogin);
        basePage.AssertByXpath("Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect",xpathValidationSumError);
    }
}

