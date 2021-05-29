import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage2 {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage2(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    @FindBy(id = "header")
    private WebElement header;
    
    private By sighupLocator = By.linkText("https://rozetka.com.ua/signin/");

    public void open() {
        driver.get("https://rozetka.com.ua/");
    }


}

