
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Tests extends WebDriverSettings {
    @Test
    public void findPhoto() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        PhotoPage photoPage = PageFactory.initElements(driver, PhotoPage.class);
        photoPage.getStarted();

        Assert.assertTrue(photoPage.getCurrentUrl().equals("http://ccte.nau.edu.ua/gallery/dock-galleryProgrammer/index.html"));
    }

    @Test
    public void findVideo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        VideoPage videoPage = PageFactory.initElements(driver, VideoPage.class);
        videoPage.getStarted();

        Assert.assertTrue(videoPage.getCurrentUrl().equals("http://ccte.nau.edu.ua/%D0%A4%D0%BE%D1%82%D0%BE.html"));
    }
}
