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

    @FindBy(id = "header")
    private WebElement header;

    private By videoLocator = By.xpath("//a[@href='http://ccte.nau.edu.ua/%D0%A4%D0%BE%D1%82%D0%BE.html']");

    public void open(){
        header.findElement(videoLocator).click();
    }

    public String  getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
