package Page;

import com.github.javafaker.Faker;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**Вызов библиотеки Фэйкера**/
    public static Faker faker = new Faker();

    /** Сгенерированный Email в статической перемменной**/
    static public String generatedEmailStatic = EmailRandomize();
    static public String getGeneratedEmailStaticTwo = EmailRandomize();
    static public String getGeneratedEmailStaticThird = EmailRandomize();

    /** Сгенерированное Имя в перемменной.*/
    public static String generatedName =  faker.name().firstName();
    /** Сгенерированное Имя в перемменной.*/
    public static String generatedLastName = faker.name().firstName();

    /**Статическая Строка с Low+UpCases длиной 8 символов**/
     public static String generatedPassword = StringRandomize();

    public String HeaderLinkMyMail = "(//a[@href='/customer/info'])[1]";

    /**Метод для перехода по url*/
    public String GoToUrl(String url){
        driver.get(url);
        return url;
    }
    /**Метод для рандомизации символов(8 букв)*/
    private static String StringRandomize(){
        RandomString session = new RandomString();
        return session.nextString();
    }
    /**Преобразуем рандом символы в Email*/
    public static String EmailRandomize() {
        return StringRandomize().toLowerCase(Locale.ROOT) + "@test.test";
    }
    /**Поиск по xpath и клик по нему*/
    public BasePage ClickByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
        return this;
    }

    /** Поиск эллемента по ID и клик по нему **/
    public BasePage ClickById (String id){
        driver.findElement(By.id(id)).click();
        return this;
    }

    /** Предназначено ДЛЯ: 1. Поиск поля по ID 2.Ввод текста в это поле**/
    public BasePage TypeById(String id, String text){
        driver.findElement(By.id(id)).sendKeys(text);
        return this;
    }

    /** Сравнивание Ожидаемого результата(текст) с текстом веб-эллемента с Атрибутом "outerText" **/
    public BasePage AssertByXpathGetAtrText(String expected, String xpath){
        Assertions.assertEquals(expected,driver.findElement(By.xpath(xpath)).getAttribute("outerText"));
        return this;
    }


    /**Поиск по ID */
    public BasePage FindById(String id){
        driver.findElement(By.id(id));
        return this;
    }
    /**Сравнивание через ID*/
    public BasePage AssertByxpathGetAtrValue(String expected, String xpath){
        Assertions.assertEquals(expected, driver.findElement(By.xpath(xpath)).getAttribute("value"));
        return this;
    }

    public BasePage AssertByXpathGetSize(int expectedINT, String xpath){
        int countBox = driver.findElements(By.xpath(xpath)).size();
        Assertions.assertEquals(expectedINT,countBox);
        return this;
    }

    public String waitElementByXpath (String xpath) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
        return xpath;
    }


}
