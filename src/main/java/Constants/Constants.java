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
    public static final String setCoockie = "73CAE56915586418C753DD0D53CFDE5D088C6563596023F6365AF077B6671C401F5AD481BA07BC7FDF4F0E0DDAFB50B5FCFDDCFDB9D881DEDA53D021B0C787D1C48B0534B0068687BBA36B7B5549D0C79643324E9AEEB4F6763083410AFBA4250F3595C9AABDF54C97094AF6DBFC0B1955A452058F15B0991DFE4010E744F4035D7EB80E7DCBDF5E189B96FE8649AEB7";





}
