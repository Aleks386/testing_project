import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.soap.Text;
import java.util.List;

public class SearchResultPage {
    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "div.bkWMgd:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")
    private WebElement firstLinkOnSearchPage;

    @FindBy(css = "#pnnext")
    private WebElement searchResultNextPageButton;

    @FindBy(className = "iUh30")
    private   WebElement domainAddress;


    public void clickOnFirstLink() {
        firstLinkOnSearchPage.click();
    }

    public String addTitleTextInLowerCase() {
        String searchPagetitle = driver.getTitle();
        return searchPagetitle.toLowerCase();
    }

    public String addTitleText() {
        String searchPagetitle = driver.getTitle();
        return searchPagetitle;
    }

    public void checkFirstFivePagesDomains(List<String> actualValues){
        for (int i = 1; i <= 4; i++){
            List<WebElement> linkList = driver.findElements(By.className("iUh30"));
                for (WebElement element:linkList) {
                actualValues.add(element.getText()); }
            searchResultNextPageButton.click();
        }




    }

    }










