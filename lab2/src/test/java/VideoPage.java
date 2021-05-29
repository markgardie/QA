import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VideoPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public VideoPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "wrapper_row4")
    private WebElement header;

    private By videoLocator = By.cssSelector("[href=\"http://ccte.nau.edu.ua/%D0%92%D1%96%D0%B4%D0%B5%D0%BE.html\"]");

    public void getStarted() {
        header.findElement(videoLocator).click();

    }
    public String  getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}