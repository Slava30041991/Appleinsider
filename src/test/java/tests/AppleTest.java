package tests;

import org.junit.Test;
import page.MainPage;

public class AppleTest extends BaseTest {
    public final static String BASE_URL = "https://appleinsider.ru";
    public final static String SEARCH_STRING = "Чем iPhone13 отличается от iPhone12";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage();
        mainPage.openWeb(BASE_URL);





    }
}
