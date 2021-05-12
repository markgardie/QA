import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://ccte.nau.edu.ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Головна"));

        driver.quit();
    }
}
