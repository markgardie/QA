import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SingUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    public void openSingInForm() {
        driver.get("https://rozetka.com.ua/signin/");
    }

}