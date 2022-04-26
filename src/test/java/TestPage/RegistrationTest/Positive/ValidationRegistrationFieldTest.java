package TestPage.RegistrationTest.Positive;

import Page.BasePage;
import Tests.Base.BaseTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



import static Constants.Constants.*;
import static Constants.PathOfSearch.*;

public class ValidationRegistrationFieldTest extends BaseTest {


    @Test(description = "Регистрация с корректными данными и без гендера")
    public void RegistrationWithOutGender(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        basePage
                .TypeById("FirstName", BasePage.generatedName)
                .TypeById("LastName", BasePage.generatedLastName)
                .TypeById("Email", BasePage.getGeneratedEmailStaticTwo)
                .TypeById("Password", BasePage.generatedPassword)
                .TypeById("ConfirmPassword", BasePage.generatedPassword)
                .ClickById("register-button");
        Assertions.assertEquals(driver.getCurrentUrl(), COMPLATED_REG_PAGE);
        basePage.AssertByXpath("Your registration completed", "//div[@class='result']");
        Assertions.assertTrue(driver.findElement(By.xpath(XPATH_BUTTON_CONTIN_AFTER_REG)).isDisplayed());
        basePage
                .AssertByXpath(BasePage.getGeneratedEmailStaticTwo, statesAndTransition.myAccount)
                .ClickByXpath(statesAndTransition.myAccount)
                .AssertByxpathGetText(BasePage.generatedName, xpathFirstName)
                .AssertByxpathGetText(BasePage.generatedLastName, xpathLastName)
                .AssertByxpathGetText(BasePage.getGeneratedEmailStaticTwo, xpathEmail);
    }

    @Test(groups = "smoke_tests",description = "Регистрация с корректными данными и Female гендер")
    public void RegistrationWithGenderFemale(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        basePage
                .ClickById("gender-female")
                .TypeById("FirstName", BasePage.generatedName)
                .TypeById("LastName", BasePage.generatedLastName)
                .TypeById("Email", BasePage.getGeneratedEmailStaticThird)
                .TypeById("Password", BasePage.generatedPassword)
                .TypeById("ConfirmPassword", BasePage.generatedPassword)
                .ClickById("register-button");
        Assertions.assertEquals(driver.getCurrentUrl(), COMPLATED_REG_PAGE);
        basePage.AssertByXpath("Your registration completed", "//div[@class='result']");
        Assertions.assertTrue(driver.findElement(By.xpath(XPATH_BUTTON_CONTIN_AFTER_REG)).isDisplayed());
        basePage
                .AssertByXpath(BasePage.getGeneratedEmailStaticThird, statesAndTransition.myAccount)
                .ClickByXpath(statesAndTransition.myAccount)
                .AssertByxpathGetText(BasePage.generatedName, xpathFirstName)
                .AssertByxpathGetText(BasePage.generatedLastName, xpathLastName)
                .AssertByxpathGetText(BasePage.getGeneratedEmailStaticThird, xpathEmail);
    }



}




