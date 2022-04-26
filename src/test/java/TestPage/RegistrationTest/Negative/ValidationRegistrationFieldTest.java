package TestPage.RegistrationTest.Negative;

import Tests.Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.testng.annotations.Test;

import static Constants.Constants.ERROR_PAGE;
import static Constants.Constants.REGISTRATION_PAGE;
import static Constants.PathOfSearch.*;

public class ValidationRegistrationFieldTest extends BaseTest {


    @Test(groups = {"smoke_tests"},description = "Регистрация с уже использованными данными")
    public void RegistrationWithReusingEmail(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .ClickById("gender-male")
                .TypeById("FirstName", "mstpassword")
                .TypeById("LastName", "mstpassword")
                .TypeById("Email", "mstpassword@gmail.com")
                .TypeById("Password", "mstpassword")
                .TypeById("ConfirmPassword", "mstpassword")
                .ClickById("register-button")
                .AssertByXpathGetAtrText("The specified email already exists",XPATH_SUMMARY_ERROR);
    }

    @Test(description = "Регистрация с пустыми полями")
    public void RegistrationWithEmptyField(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .ClickById("register-button")
                .AssertByXpathGetAtrText("First name is required.",XPATH_FIRST_NAME_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Last name is required.", XPATH_LAST_NAME_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Email is required.", XPATH_EMAIL_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Password is required.", XPATH_PASSWORD_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Password is required.", XPATH_CONFIRM_PASSWORD_FIELD_OF_REG);
    }
    @Test(description = "Пустые/пробел в FirstName и LastName")
    public void RegistrationWithSpaceOnNames(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .TypeById("FirstName"," ")
                .TypeById("LastName"," ")
                .TypeById("Email","test@ty.ty")
                .TypeById("Password","1111111")
                .TypeById("ConfirmPassword","1111111")
                .ClickById("register-button")
                .AssertByXpathGetAtrText("First name is required.",XPATH_FIRST_NAME_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Last name is required.",XPATH_LAST_NAME_FIELD_OF_REG);
    }

    @Test(description = "Рег. без Email")
    public void RegistrationWithOutEmail(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .TypeById("FirstName","1")
                .TypeById("LastName","1")
                .TypeById("Password","1111111")
                .TypeById("ConfirmPassword","1111111")
                .ClickById("register-button")
                .AssertByXpathGetAtrText("Email is required.",XPATH_EMAIL_FIELD_OF_REG);
    }

    @Test(description = "Рег. без пароля")
    public void RegistrationWithOutPassword(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .TypeById("FirstName","И")
                .TypeById("LastName","Я")
                .TypeById("Password","")
                .TypeById("ConfirmPassword","")
                .ClickById("register-button")
                .AssertByXpathGetAtrText("Password is required.",XPATH_PASSWORD_FIELD_OF_REG)
                .AssertByXpathGetAtrText("Password is required.", XPATH_CONFIRM_PASSWORD_FIELD_OF_REG);
    }

    @Test(groups = "smoke_tests",description = "Регистр. с скриптами в базу")
    public void RegistrationWithScriptInjection(){
        basePage.GoToUrl(REGISTRATION_PAGE);
        validationRegistrationField
                .TypeById("FirstName","1")
                .TypeById("LastName","1")
                .TypeById("Email","ds@ds.ds")
                .TypeById("Password","<script> </script>")
                .TypeById("ConfirmPassword","<script> </script>")
                .ClickById("register-button");
        Assertions.assertEquals(ERROR_PAGE,driver.getCurrentUrl());
    }


}
