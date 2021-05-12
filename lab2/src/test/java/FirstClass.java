import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    @Test
    public void firstTest(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://ccte.nau.edu.ua/");
    }
}
