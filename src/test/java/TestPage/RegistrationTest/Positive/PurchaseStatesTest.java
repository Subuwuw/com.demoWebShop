package TestPage.RegistrationTest.Positive;

import Page.BasePage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import static Constants.Constants.*;
import static Page.BasePage.*;

public class PurchaseStatesTest extends BaseTest {
  /**Описывается состояния связанные с покупкой\корзиной*/

  private static final String StaticRandomMail = BasePage.EmailRandomize();


        @Test(groups = {"Critical_Path"},description = "Регистрация, проверка входа")
          public void RegistrationForPurchase(){
            basePage.GoToUrl(REGISTRATION_PAGE);
            basePage
                    .TypeById("FirstName",generatedName)
                    .TypeById("LastName", generatedLastName)
                    .TypeById("Email", StaticRandomMail)
                    .TypeById("Password", generatedPassword)
                    .TypeById("ConfirmPassword", generatedPassword)
                    .ClickById("register-button");
            basePage.AssertByXpathGetAtrText(StaticRandomMail, basePage.HeaderLinkMyMail);
        }

        @Test(dependsOnMethods = "RegistrationForPurchase",groups = {"Critical_Path"},description = "Добавление в корзину, проверка появления Bar-notification")
         public void AdditemToCartAndPurchase(){
            basePage.GoToUrl(HOME_PAGE);
            basePage.AssertByXpathGetSize( 6,"//div[@class='item-box']");
            basePage.ClickByXpath(xpathAddToCart);
            basePage.AssertByXpathGetAtrText("The product has been added to your shopping cart",xpathBarNotification);

        }




}
