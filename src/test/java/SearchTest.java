import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class SearchTest extends WebDriverConfigClass {


    @Test
    public void checkSearchWordTitle(){
        String searchWord = "automation";
        homePage.typeSearchWord(searchWord);
        homePage.clickSearchButton();
        searchResultPage.clickOnFirstLink();
        String titleText = searchResultPage.addTitleTextInLowerCase(); //добавляем в переменную тайтл текст сразу в ловер кейсе так как там он может отличатся
        //Assert.assertEquals(titleText, searchWord);   //будет фейлиться так как в тайтле находиться не только слово automation
        assertTrue(titleText.contains(searchWord));/* проверяем только наличие текста в тайтле так как там не только искомый текст*/
    }

    @Test
    public void checkSerchWordDomain(){
        String checkedSite = "testautomationday.com";
        List<String> listWithDomains = new ArrayList<String>();
        String searchWord = "automation";
        homePage.typeSearchWord(searchWord);
        homePage.clickSearchButton();
        searchResultPage.checkFirstFivePagesDomains(listWithDomains); //метод проходит по всем 5-ти страницам и добавляет данные с линками в один масив
        assertTrue(listWithDomains.toString().contains(checkedSite)); //масив переводим в строку и провераем наличие там искомой фразы

    }




}
