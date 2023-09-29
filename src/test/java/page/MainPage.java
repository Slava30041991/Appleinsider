package page;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {
    private final SelenideElement searchButton = $x("//form");

    public void clickSearch(){
        searchButton.click();
    }
    public void openWeb(String url){
        Selenide.open(url);

    }
}
