import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "E:\\Programming\\KPI_Projects\\QA\\lab2\\src\\main\\resources\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://ccte.nau.edu.ua/");

        driver.quit();
    }
}
