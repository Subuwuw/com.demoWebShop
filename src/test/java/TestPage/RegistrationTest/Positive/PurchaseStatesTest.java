package TestPage.RegistrationTest.Positive;

import Page.BasePage;
import Tests.Base.BaseTest;

import org.openqa.selenium.Cookie;

import org.testng.Assert;
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

        @Test(groups = {"Critical_Path"},description = "Добавление в корзину, проверка появления Bar-notification")
         public void AdditemToCartAndPurchase(){
            basePage.GoToUrl(HOME_PAGE);
            driver.manage().addCookie(new Cookie("NOPCOMMERCE.AUTH",setCoockie));
            driver.navigate().refresh();
            //проверка количества продуктов на домашней странице
            basePage.AssertByXpathGetSize( 6,"//div[@class='item-box']");
            //клик(добавление) товара по xpath и проверка всплывашки
            basePage.ClickByXpath(xpathAddToCart);
            basePage.AssertByXpathGetAtrText("The product has been added to your shopping cart",xpathBarNotification);
            //проверка верхнего бара корзины на добавление.
            basePage
                    .AssertByXpathGetAtrText("(1)",xpathBarShopingQTY);
            //Ожидаем пропадения всплывшего нотификации и кликаем
            basePage.WaitElemWhenAtrToBe(xpathBarNotification,"scrollHeight","0");
            basePage.ClickByXpath(xpathBarShopingCart);
            Assert.assertEquals(driver.getCurrentUrl(),CART_PAGE);
            basePage
                    .ClickByXpath(xpathSelectCountry)
                    .TypeById("ZipPostalCode",randomizeNumber)
                    .ClickByXpath(xpathAgreeWithTerms)
                    .ClickByXpath(xpathBthCheckOut);
            Assert.assertEquals(driver.getCurrentUrl(),ONE_PAGE_CHECKOUT);
            basePage.WaitElemWhenAtrToBe(xpathBillingAdressFields,"className","enter-address");
            basePage
                    .ClickByXpath(xpathSelectCountry)
                    .TypeById("BillingNewAddress_City",faker.address().city())
                    .TypeById("BillingNewAddress_Address1", faker.address().streetAddress())
                    .TypeById("BillingNewAddress_ZipPostalCode",faker.address().zipCode())
                    .TypeById("BillingNewAddress_PhoneNumber", faker.phoneNumber().cellPhone())
                    .ClickByXpath("(//input[@type='button'])[2]");
            basePage.WaitElemWhenAtrToBe(xpathBillingShippingAdress,"className","checkout-data");
            basePage.ClickByXpath("(//input[@type='button'])[3]");
            basePage.WaitElemWhenAtrToBe(xpathShippingMethod,"className","section shipping-method");
            basePage.ClickByXpath("(//input[@type='button'])[4]");
            basePage.WaitElemWhenAtrToBe(xpathPaymentMethod,"className","method-list");
            basePage.ClickByXpath("(//input[@type='button'])[5]");
            basePage.WaitElemWhenAtrToBe(xpathPaymentInfo,"className","info");
            basePage.ClickByXpath("(//input[@type='button'])[6]");
            basePage.WaitElemWhenAtrToBe(xpathOrderReviewData,"className","order-review-data");
            basePage.ClickByXpath("(//input[@type='button'])[7]");
            basePage.WaitElemWhenAtrToBe(xpathOrderTitleInfo,"className", "title");
        }




}
