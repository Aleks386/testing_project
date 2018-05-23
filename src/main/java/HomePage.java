import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    
    @FindBy(className = "lsb")
    private WebElement searchButton;
    
    @FindBy(name = "q")
    private WebElement searchField;

    public void clickSearchButton(){
        searchButton.click();
    }

    public void typeSearchWord(String searchWord){
        searchField.sendKeys(searchWord);
    }



}
