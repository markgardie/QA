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

    @FindBy(id = "header")
    private WebElement header;

    private By photoLocator = By.cssSelector("[href=\"http://ccte.nau.edu.ua/%D0%A4%D0%BE%D1%82%D0%BE.html\"]");
    private By galleryLocator = By.cssSelector("[href=\"http://ccte.nau.edu.ua/gallery/dock-galleryProgrammer/index.html\"]");

   public void open(){
       header.findElement(photoLocator).click();
       header.findElement(galleryLocator).click();
    }

    public String  getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
