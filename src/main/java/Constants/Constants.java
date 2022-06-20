package Constants;

import io.netty.handler.ssl.JdkApplicationProtocolNegotiator;

public class Constants{

    /**
     * URLS                         **@@  URLS    @@**
     */
    public static final String REGISTRATION_PAGE = "http://demowebshop.tricentis.com/register";
    public static final String ERROR_PAGE = "http://demowebshop.tricentis.com/errorpage.htm?aspxerrorpath=/register";
    public static final String COMPLATED_REG_PAGE = "http://demowebshop.tricentis.com/registerresult/1";
    public static final String LOG_IN_PAGE = "http://demowebshop.tricentis.com/login";
    public static final String HOME_PAGE = "http://demowebshop.tricentis.com/";
    public static final String CART_PAGE = "http://demowebshop.tricentis.com/cart";
    public static final String ONE_PAGE_CHECKOUT = "http://demowebshop.tricentis.com/onepagecheckout";

    /**
     * Boolean                      **@@    BOOLEAN     @@**
     */
    public static final Boolean BROWSER_CLOSE = true;

    /**
     * Xpath field                  **@@      XPATH FIELD     @@**
     */
    public static final String xpathFirstName = "//input[@id='FirstName']";
    public static final String xpathLastName = "//input[@id='LastName']";
    public static final String xpathEmail = "//input[@id='Email']";
    public static final String xpathBtnLogin = "//input[@value='Log in']";
    public static final String xpathPassword = "//input[@id='Password']";

    /**
     * Xpath MESSAGES                **@@     XPATH MESSAGE       @@**
     */
    public static final String xpathValidationSumError = "//div[@class='validation-summary-errors']";
    public static final String xpathBarNotification = "//p[@class='content']";

    /**
     * Xpath Shopin Cart             **@@     Xpath Shoping Cart      @@**
     */
    public static final String xpathAddToCart = "(//input[@value='Add to cart'])[2]";
    public static final String xpathBarShopingCart = "(//a[@class='ico-cart'])[1]";
    public static final String xpathBarShopingQTY = "//span[@class='cart-qty']";
    public static final String xpathSelectCountry = "//option[contains(text(),'Albania')]";
    public static final String xpathAgreeWithTerms = "//input[@id='termsofservice']";
    public static final String xpathBthCheckOut = "//button[@id='checkout']";
    public static final String xpathBtnContBillingSave = "(//input[@type='button'])[3]";
    public static final String xpathBillingAdressFields = "(//div[@class='enter-address'])[1]";
    public static final String xpathBillingShippingAdress = "(//div[@class='checkout-data'])[2]";
    public static final String xpathShippingMethod = "//div[@class='section shipping-method']";
    public static final String xpathPaymentMethod = "(//ul[@class='method-list'])[2]";
    public static final String xpathPaymentInfo = "//div[@class='info']";
    public static final String xpathOrderReviewData = "//div[@class='order-review-data']";
    public static final String xpathOrderTitleInfo = "//div[@class='title']";





    /**
     *  COOCKIE                     **@@        Coockie        @@**
     */
    public static final String setCoockie = "20B6CB60EA014DC8B1A7CEE2BA444AEFDBB32AE80E5A23CB6701DFA6D33D94EE932A1F42B30F9476453EAEB93AFF05580F3093FA6ED5566BEFC785245259D93DDEC7D0F1F6290B98BAC64824EF505E0D43B756D91205782ACEF58BD81C195B1AA9EEF992C617E2837CB6CF8FB7C27904D204603820AA08623DDE1A7C9ACC7BC68676ACF6E43D2418853ECBE07149C982";





}
