import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage  {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void open(){
        driver.get("http://ccte.nau.edu.ua/");
    }

}
