package Constants;

public class Constants{

    /**
     * URLS                         ****@@@@@****
     */
    public static final String REGISTRATION_PAGE = "http://demowebshop.tricentis.com/register";
    public static final String ERROR_PAGE = "http://demowebshop.tricentis.com/errorpage.htm?aspxerrorpath=/register";
    public static final String COMPLATED_REG_PAGE = "http://demowebshop.tricentis.com/registerresult/1";
    public static final String LOG_IN_PAGE = "http://demowebshop.tricentis.com/login";
    public static final String HOME_PAGE = "http://demowebshop.tricentis.com/";

    /**
     * Boolean                      ****@@@@@****
     */
    public static final Boolean BROWSER_CLOSE = false;

    /**
     * Xpath field                  ****@@@@@****
     */
    public static final String xpathFirstName = "//input[@id='FirstName']";
    public static final String xpathLastName = "//input[@id='LastName']";
    public static final String xpathEmail = "//input[@id='Email']";
    public static final String xpathBtnLogin = "//input[@value='Log in']";
    public static final String xpathPassword = "//input[@id='Password']";

    /**
     * Xpath MESSAGES                ****@@@@@****
     */
    public static final String xpathValidationSumError = "//div[@class='validation-summary-errors']";
    public static final String xpathBarNotification = "//p[@class='content']";

    /**
     * Xpath Shopin Cart             ****@@@@@****
     */
    public static final String xpathAddToCart = "(//input[@value='Add to cart'])[2]";
    public static final String xpathBarShopingCart = "(//a[@class='ico-cart'])[1]";
    public static final String xpathBarShopingQTY= "//span[@class='cart-qty']";






}
