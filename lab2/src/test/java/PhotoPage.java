import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PhotoPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PhotoPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "wrapper_row4")
    private WebElement header;

    private By photoLocator = By.linkText("Фото.html");

    public void getStarted() {
        header.findElement(photoLocator).click();

    }
    public String  getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
