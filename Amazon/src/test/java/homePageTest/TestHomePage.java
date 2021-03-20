package homePageTest;

import common.WebAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    //This class is for creating test cases from the HomePage class:
    //1. first step: we have to create a reference variable of the homePage class:
    HomePage homepage;
    //2. then we need to use the page factory class:
    public void getInit(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testSearchField() throws InterruptedException {
        getInit();
        homepage.searchField();
    }

}
