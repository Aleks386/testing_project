import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class WebDriverConfigClass {
    public static WebDriver driver;
    public static HomePage homePage;
    public static SearchResultPage searchResultPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "webdriverfolder/chromewebdriver/chromedriver.exe" );
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }


    /*@After
    public void  close() {
        driver.quit();
    }
    */
}
